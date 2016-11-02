package com.shenma.common.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringUtil {
	protected static Logger logger = LoggerFactory.getLogger("StringUtil");
	public static String urlDecode(String s,String enc){
		String ret=null;
		try {
			ret=URLDecoder.decode(s, enc);
		} catch (UnsupportedEncodingException e) {
			logger.error("decode解码错误:", e);
			ret="";
		}
		return ret;
	}
}
