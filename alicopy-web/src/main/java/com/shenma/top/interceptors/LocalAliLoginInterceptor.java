package com.shenma.top.interceptors;

import com.shenma.alicopy.util.BaseHttpClient;
import com.shenma.aliutil.sdk.ali.auth.HostedAuthService;
import com.shenma.aliutil.service.AliToken;
import com.shenma.aliutil.service.AlibabaRequestService;
import com.shenma.aliutil.util.AliConstant;
import com.shenma.aliutil.util.SessionUtil;
import com.shenma.common.util.JacksonJsonMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@Controller
public class LocalAliLoginInterceptor extends HandlerInterceptorAdapter {
	
	protected static Logger logger = Logger.getLogger("LocalAliLoginInterceptor");
	
	@Autowired
	private HostedAuthService hostedAuthService;
	
	@Autowired
	private AlibabaRequestService alibabaRequestService;

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
		logger.info("开始登陆拦截");
		Object object=request.getSession().getAttribute(AliConstant.ali_info_name);
		AliToken info=null;
		if(object==null){
			Map<String,String> params=new HashMap<String,String>();
			params.put("memberId", "b2b-2135715960");
			params.put("appKey", "1014423");
			String tokenstr=BaseHttpClient.get("http://imagecopy.kongjishise.com/alicopy/open/api/getToken", params, "utf-8");
			info= JacksonJsonMapper.getInstance().readValue(tokenstr, AliToken.class);
			request.getSession().setAttribute(AliConstant.ali_info_name, info);
		}else{
			info=(AliToken) object;
			//alibabaRequestService.refreshTokenWithEffectiveness(info);
			
		}
		SessionUtil.setAliSession(info);
		return super.preHandle(request, response, handler);
	}
	
	private void setCookie(HttpServletRequest request,HttpServletResponse response){
		String JSESSIONID=null;
		Cookie[] cookies = request.getCookies();
	    if (cookies != null) {
	        for (int i = 0; i < cookies.length; i++) {
	            Cookie c = cookies[i];
	            if (c.getName().equals("JSESSIONID")) {
	            	JSESSIONID = c.getValue();
	            }
	        }
	    }
	    
	    /*
	     * 如果没有发现guid cookie ,生成新的guid,并写cookie
	    */
	    if (JSESSIONID == null) {
	    	JSESSIONID=UUID.randomUUID().toString();
	        Cookie guidcookie = new Cookie("JSESSIONID", JSESSIONID);
	        guidcookie.setMaxAge(-1);
	        guidcookie.setDomain(".kongjishise.com");
	        response.addCookie(guidcookie);
	    } 
	}
	public void postHandle(
			HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
	}
	
	
	public void afterCompletion(
			HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
