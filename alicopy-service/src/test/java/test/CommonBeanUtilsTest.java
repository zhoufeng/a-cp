package test;

import com.shenma.alicopy.parse.DetailHtmlParse;
import com.shenma.alicopy.util.JsonpUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.junit.Test;
import test.common.BaseJUnit4Test;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;


public class CommonBeanUtilsTest extends BaseJUnit4Test{
	
	@Resource(name="alibabaDetailHtmlParse")
	private DetailHtmlParse alibabaDetailHtmlParse;
	
	@SuppressWarnings({ "unused", "unchecked" })
	@Test
	public void testPro() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException{
		Map<String,Object> map=new HashMap<String,Object>();
		Map<String,Object> submap=new HashMap<String,Object>();
		submap.put("url", "cctv");
		map.put("images", submap);
		String a=BeanUtils.getProperty(map, "images.url");
		Map<String,Object> b=(Map<String, Object>) PropertyUtils.getProperty(map, "images");
		System.out.println(b);
	}
	
	@Test
	public void testDe(){
		String url="https://item.taobao.com/item.htm?id=44050405059";
		String html= JsonpUtil.getAliDefaultConnet(url).html();
		System.out.println(html);
	}
}
