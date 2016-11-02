package com.shenma.top.imagecopy.util;

import org.apache.commons.httpclient.Cookie;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpState;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.shenma.top.imagecopy.util.exception.BusinessException;



public class AliCateAuto2Util {
	/*
	 * 
	 */
	public static long startTime=System.currentTimeMillis();
	public static Integer num=0;
	protected static Logger logger = Logger.getLogger("HttpClientAliUtil");
	private static HttpClient httpclient=null;

	public static String cookieValue="	ali_beacon_id=117.136.13.51.1457585905626.827514.9; cna=8exnDyQO7nkCAXWIDTN2nPq1; l=AicnCwxux6GA5aNOjYfrf-7et1HxrPuO; alicnweb=touch_tb_at%3D1478041590049%7Clastlogonid%3Dkongjishisecom%7Cshow_inter_tips%3Dfalse; __last_loginid__=kongjishisecom; ali_apache_track=\"c_ms=1|c_mt=3|c_mid=b2b-2135715960|c_lid=kongjishisecom\"; _cn_slid_=\"m0Ql%2BnA5vS\"; last_mid=b2b-2135715960; __utma=62251820.1445308915.1457746361.1477351085.1478041590.59; __utmz=62251820.1478041590.59.37.utmcsr=fuwu.1688.com|utmccn=(referral)|utmcmd=referral|utmcct=/; ali_ab=115.219.33.106.1457795959128.4; ad_prefer=\"2016/07/25 22:17:49\"; h_keys=\"%u997c%u5e72#%u963f%u91cc%u5df4%u5df4%u5206%u9500%u5e73%u53f0#%u513f%u7ae5%u5957%u4ef6#%u8fde%u8863%u88d9#%u7eaf%u68c9T%u6064\"; isg=AkZGLL0jYkivkznIVW7I41F0ljyC-PvXEBfahjBvfmlEM-RNmDRpc2yFfeAu; hp_ab_is_marked_2016=1; JSESSIONID=8L78tCuu1-UQWWlHBIvFg5FGJS8A-9LnrJ1Q-JCG5; _tmp_ck_0=\"U8msuy1F4b6rynn6sU%2FkJ8mDSqmuWLw40xAmHHUMa0xZShMMeBYkluj1%2BetKoOYhQ%2FGzyD0nRJryD%2BxZlTi6t7ty%2BN%2Bh7zTxJl2dyVsG0tUUe1Jp86rI%2F8%2FothyW2HjzXQB9N3ZsHVsvXMBE7hflCAF8HGZCoOdeY5sFlBPomA6xvzV%2FmMAd9AzFtCo3you6qCazX6%2FSGo7JGqjYr7e%2BEzxuO2PxukBXojKbtLFNG6OK932w%2FdQ1DYQnXMQ%2B2sECHgHI7n77Yr0y2lzMMNsIdszN4T%2FCLraMSKk7lT6juyzdswAGDYIR4%2FrfXvhn%2FeJT692Q%2FDFvrArUtXrUFm7SLddj%2B9YFtudq8li6SJP61qbpFQX%2Fuqc5nzYJ6KcnbBwyibTu%2BdeOovXQ5URUZ2scnzcCUnHUNRh%2B3Kyoqn7i7o5p%2BCmb9DYRfSrV%2BUZfIrRV5AVfoKMrpLdi3FmRedxG8jTz84QKR6airO2vy4v9UPYygGlgwfYBQyAoRtMjFrX5en14eMtg3gi0JhT1GNGk3s%2BP%2Fx0c2fxgmwHTqU4AWbGqOhelay2JlQ%3D%3D\"; _csrf_token=1478041911877; __cn_logon__=true; ali_apache_tracktmp=\"c_w_signed=Y\"; _nk_=\"4XqXIR1qHwaJZNpI%2BUE0Kw%3D%3D\"; tbsnid=I40MjNwMzX71aU%2BqeDUr118h%2BAhiMPQ7POF15uTW%2BHk6sOlEpJKl9g%3D%3D; LoginUmid=\"5bKWLcinI%2B2job4ZN69p4qItjQR8EGTsNgTc5BFMqKO%2BkczvUn3C%2FQ%3D%3D\"; userID=\"TXCwIFJjO7nDcjS6V3o2J0nzxCTzjlzdJ4zVn7jahM86sOlEpJKl9g%3D%3D\"; userIDNum=\"Q66meEyBOf1nhRthAUduHA%3D%3D\"; login=\"kFeyVBJLQQI%3D\"; _is_show_loginId_change_block_=b2b-2135715960_false; _show_force_unbind_div_=b2b-2135715960_false; _show_sys_unbind_div_=b2b-2135715960_false; _show_user_unbind_div_=b2b-2135715960_false; __rn_alert__=false; __utmb=62251820.2.10.1478041590; __utmc=62251820; __cn_logon_id__=kongjishisecom; cn_tmp=\"Z28mC+GqtZ0s9gBWlWQ3oKZL3kJv01YZSxJPP0Npl7CGE5apwtkL/+GRO3vYOWrhXTlTpK2rvHq9O1LOIA7AF3IjRdEzWUrGnRjLlKubYDrGGrxSv7JtvNVFX8Sfa+rd/eXrMtMIf09QDAkIs78Ya1Dw6CbEZIHP4/lztLH6BBEfIZ0rCaebHnHEZlPOEW0YFr+8cr3zXszFMHcMsFp7AlbydlG44jeCuaEiyIbDZu2Ei8Tc8tEeN2CUli2mxvad\"; unb=2135715960";

	public static String csrf_token="fc3025bd91287a700148194f7a8b804f";

	public static HttpClient getHttpClient(){
		if(httpclient==null){
			HttpState initialState = new HttpState();

		    Cookie mycookie = new Cookie(".1688.com", "mycookie", "stuff", "/", null, false);
		    mycookie.setValue(cookieValue);
		    initialState.addCookie(mycookie);
	
		    // Get HTTP client instance
		    httpclient = new HttpClient();
		    httpclient.getHttpConnectionManager().
		        getParams().setConnectionTimeout(30000);
		    httpclient.setState(initialState);
	
		}
	    return httpclient;
	}
	
	@SuppressWarnings("unchecked")
	public static synchronized String getSkuInfo(Integer topCategoryId,Integer secondCategoryId,Integer thirdCategoryId,Integer tradeType) throws InterruptedException{
		if(httpclient==null)getHttpClient();
		long endTime=System.currentTimeMillis();
		if(endTime-startTime>100){
			
		}else{
			//Thread.sleep(80);
		}
		startTime=endTime;
		num++;
		String cateURL="http://offer.1688.com/offer/post/fill_product_info.htm";
		PostMethod httppost=new PostMethod(cateURL);
		NameValuePair token   = new NameValuePair("_csrf_token", csrf_token);
        NameValuePair catType      = new NameValuePair("catType", "0");
        NameValuePair currentPage   = new NameValuePair("currentPage", "chooseCategory");
        NameValuePair fromWhere = new NameValuePair("fromWhere", "normal");
        NameValuePair operator = new NameValuePair("operator", "new");
        NameValuePair price = new NameValuePair("price", "0.0");
        NameValuePair topCategoryIdNP = new NameValuePair("topCategoryId", topCategoryId.toString());
        NameValuePair secondCategoryIdNP = new NameValuePair("secondCategoryId", secondCategoryId.toString());
        NameValuePair tradeTypeN = new NameValuePair("tradeType", tradeType.toString());
        NameValuePair thirdCategoryIdN = new NameValuePair("thirdCategoryId", thirdCategoryId==null?"":thirdCategoryId.toString());
        NameValuePair[] params=null;
        if(thirdCategoryId==null){
        	params=new NameValuePair[] {token, catType, currentPage, fromWhere,operator,price,topCategoryIdNP,secondCategoryIdNP,tradeTypeN};
        }else{
        	params=new NameValuePair[] {token, catType, currentPage, fromWhere,operator,price,topCategoryIdNP,secondCategoryIdNP,tradeTypeN,thirdCategoryIdN};
        }
        httppost.setRequestBody(params);

        String body=null;
        try {
			httpclient.executeMethod(httppost);
			body=httppost.getResponseBodyAsString();
		} catch (Exception e) {
			logger.error(e);
		} finally{
			 httppost.releaseConnection();
		}
        Document doc=Jsoup.parse(body);
        String properties=doc.select("#properties").attr("data-mod-config");
        if(properties==null)throw new BusinessException();
        //System.out.println(properties);
       
        return properties;

	}
	public static void main(String[] args) {
		AliCateAuto2Util.getHttpClient();
		//AliCateAuto2Util.getSkuInfo("4","422",null,"1");
	}
}
