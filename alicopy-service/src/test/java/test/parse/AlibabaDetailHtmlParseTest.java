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
import org.springframework.beans.factory.annotation.Autowired;
import test.common.BaseJUnit4Test;

import javax.annotation.Resource;
import java.io.IOException;

public class AlibabaDetailHtmlParseTest extends BaseJUnit4Test{

	@Resource(name="tmallDetailHtmlParse")
	private DetailHtmlParse alibabaDetailHtmlParse;

	@Resource(name="fetchHtmlUtil")
	private FetchHtmlUtil fetchHtmlUtil;
	
	@Test
	public void testParse() throws CopyBussinessException, JsonGenerationException, JsonMappingException, IOException{
		String url="http://detail.1688.com/offer/521647808949.html";
		DetailHtmlParseBean bean = alibabaDetailHtmlParse.parse(url);
		Assert.assertNotNull(bean);
		String beanstr= JacksonJsonMapper.getInstance().writeValueAsString(bean);
		System.out.println(beanstr);
		Assert.assertEquals("2015秋装新款撞色棉麻印花长袖连衣裙亚麻中长裙女8531010095", bean.getSubject());
	}
	
	
}
