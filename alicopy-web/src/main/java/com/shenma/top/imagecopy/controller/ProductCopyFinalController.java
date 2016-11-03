package com.shenma.top.imagecopy.controller;

import com.shenma.alicopy.dao.SaveTaskDao;
import com.shenma.alicopy.service.AliForeBackSevice;
import com.shenma.alicopy.service.TaobaoForeBackService;
import com.shenma.alicopy.util.prase.cate.AliBaBaBusseness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/top/finalproductcopy")
public class ProductCopyFinalController {
	
	@Autowired
	private AliForeBackSevice aliForeBackSevice;
	
	@Autowired
	private TaobaoForeBackService taobaoForeBackService;
	
	@Autowired
	private SaveTaskDao saveTaskDao;
	


	/**
	 * 阿里巴巴单个复制
	 * @param variables
	 * @return
	 */
	@RequestMapping(value="/saveAliItem")
	@ResponseBody
	public Map<String,Object> saveAliItem(@RequestBody Map<String,Object> variables){
		return aliForeBackSevice.saveAliItem(variables,false);
	}


	/**
	 * 阿里巴巴批量复制
	 * @param variables
	 * @return
	 */
	@RequestMapping(value="/batchSaveAliItem")
	@ResponseBody
	public List<Map<String,Object>> batchSaveAliItem(@RequestBody Map<String,Object> variables){
		String[] urlsList=variables.get("urls").toString().split("");
		List<Map<String,Object>> retList=new ArrayList<Map<String, Object>>();
		for(String url:urlsList){
			variables.put("url", url);
			Map<String,Object> ret=aliForeBackSevice.saveAliItem(variables,false);
			retList.add(ret);
		}
		//@TODO
		return	retList;
	}

	/**
	 * 淘宝单个复制
	 * @param variables
	 * @return
	 */
	@RequestMapping(value="/saveTaobaoItem")
	@ResponseBody 
	public Map<String,Object> saveTaobaoItem(@RequestBody Map<String,Object> variables){
		return taobaoForeBackService.saveTaobaoItem(variables,false);
	}
	
	/**
	 * 阿里巴巴多选复制
	 * @param variables
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/saveAliItemList")
	@ResponseBody 
	public List<Map<String,Object>> saveAliItemList(@RequestBody Map<String,Object> variables){
		List<Map<String,Object>> retList=new ArrayList<Map<String,Object>>();
		List<String> urlList=(List<String>) variables.get("urlList");
		Map<String,Object> params=(Map<String, Object>) variables.get("params");
		if(urlList!=null&&urlList.size()>0){
			//RunningTask task=RunningTaskManager.addTask(urlList.size());
			for(int i=0;i<urlList.size();i++){
				String url=urlList.get(i);
				if(url.startsWith("//"))url="http:"+url;
				params.put("url", url);
				Map<String,Object> oneRet=aliForeBackSevice.saveAliItem(params,true);
				retList.add(oneRet);
				/*if(i==0){
					msg=(String) oneRet.get("msg");
					ret.put("msg", msg);
				}*/
				//RunningTaskManager.stepTask(task.getId(), 1);
			}
			//RunningTaskManager.delTask(task.getId());
			
		}
		return retList;
	}
	
	/**
	 * 阿里巴巴类目复制
	 * @param variables
	 * @return
	 * @throws InterruptedException
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/saveAliCateList")
	@ResponseBody 
	public List<Map<String,Object>> saveAliCateList(@RequestBody Map<String,Object> variables) throws  InterruptedException{
		List<Map<String,Object>> retList=new ArrayList<Map<String,Object>>();
		Map<String,Object> params=(Map<String, Object>) variables.get("params");
		String cateUrl=(String) variables.get("cateUrl");
		String orgurl=(String) variables.get("url");
		Integer totalPages=(Integer) variables.get("totalPages");
		
		AliBaBaBusseness bus=new AliBaBaBusseness();
		List<String> urls=bus.getUrls(orgurl, cateUrl, totalPages);
		
		for(int i=0;i<urls.size();i++){
			String url=urls.get(i);
			if(url.startsWith("//"))url="http:"+url;
			params.put("url", url);
			Map<String,Object> oneRet=aliForeBackSevice.saveAliItem(params,true);
			retList.add(oneRet);
		}
		return retList;
	}
	
	
	@RequestMapping(value="/saveAll")
	@ResponseBody 
	public String saveAll(@RequestBody Map<String,Object> variables){
		return null;
	}
	
	/**
	 * 淘宝多选复制
	 * @param variables
	 * @return
	 */
	@SuppressWarnings({ "unchecked" })
	@RequestMapping(value="/saveTaobaoItemList")
	@ResponseBody 
	public List<Map<String,Object>> saveTaobaoItemList(@RequestBody Map<String,Object> variables){
		List<Map<String,Object>> retList=new ArrayList<Map<String,Object>>();
		String msg=null;
		List<String> urlList=(List<String>) variables.get("urlList");
		Map<String,Object> params=(Map<String, Object>) variables.get("params");
		for(int i=0;i<urlList.size();i++){
			String url=urlList.get(i);
			params.put("url", url);
			Map<String,Object> oneRet=taobaoForeBackService.saveTaobaoItem(params,true);
			retList.add(oneRet);
			/*if(i==0){
				msg=(String) oneRet.get("msg");
				ret.put("msg", msg);
			}*/
		}
		return retList;
	}
	

	
}
