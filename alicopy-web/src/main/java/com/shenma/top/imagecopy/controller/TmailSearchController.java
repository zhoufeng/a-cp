package com.shenma.top.imagecopy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shenma.alicopy.util.TaobaoCateUtil;

@Controller
@RequestMapping("/tmail")
public class TmailSearchController {
	private long startTime=0l;
	@RequestMapping(value="/search",method=RequestMethod.POST)
	@ResponseBody
	public String search(@RequestParam("url") String url) throws  InterruptedException{
		return requestNwjsClient(url);
	}
	
	private String requestNwjsClient(String url) throws InterruptedException{
		synchronized (TmailSearchController.class) {
			long endTime=System.currentTimeMillis();
			if(endTime-startTime>=1001){
				
			}else{
				Thread.sleep(1001-endTime+startTime);
			}
			startTime=endTime;
		}
		String tmailSearchUrl="http://localhost:8078/tmail/search";
		String html=TaobaoCateUtil.reqNWJS(url, tmailSearchUrl);
		return html;
		
	}
}
