package test.parse;

import com.shenma.alicopy.ecxeption.CopyBussinessException;
import com.shenma.alicopy.parse.DetailHtmlParse;
import com.shenma.alicopy.parse.DetailHtmlParseBean;
import com.shenma.alicopy.util.fetchhtml.FetchHtmlUtil;
import com.shenma.common.util.JacksonJsonMapper;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.junit.Assert;
import org.junit.Test;
import test.common.BaseJUnit4Test;

import javax.annotation.Resource;
import java.io.IOException;

public class TaobaoDetailHtmlParseTest extends BaseJUnit4Test {
	@Resource(name="tmallDetailHtmlParse")
	private DetailHtmlParse taobaoDetailHtmlParse;

	@Resource(name="fetchHtmlUtil")
	private FetchHtmlUtil fetchHtmlUtil;
	
	@Test
	public void testParse() throws CopyBussinessException, JsonGenerationException, JsonMappingException, IOException{
		String url="https://item.taobao.com/item.htm?id=44050405059";
		DetailHtmlParseBean bean = taobaoDetailHtmlParse.parse(url);
		Assert.assertNotNull(bean);
		String beanstr= JacksonJsonMapper.getInstance().writeValueAsString(bean);
		System.out.println(beanstr);
		Assert.assertEquals("蚕丝被冬被芯100%桑蚕丝 春秋冬季加厚被子 单人双人四季被棉被-淘宝网", bean.getSubject());
	}
	
}
