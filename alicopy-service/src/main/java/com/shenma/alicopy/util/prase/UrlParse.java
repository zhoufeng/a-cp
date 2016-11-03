package com.shenma.alicopy.util.prase;

import com.shenma.alicopy.util.bean.ImageBean;
import com.shenma.alicopy.util.bean.ImageVoBean;

public interface UrlParse {
	/**
	 * 功能描述:根据url解析所有图片
	 * @param url
	 * @return
	 */
	public ImageBean<ImageVoBean> parseImages(String url);
}
