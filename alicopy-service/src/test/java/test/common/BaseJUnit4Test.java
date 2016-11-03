package test.common;

import com.shenma.aliutil.service.AliToken;
import com.shenma.aliutil.util.AliConstant;
import com.shenma.aliutil.util.SessionUtil;
import com.shenma.aliutil.util.memcache.MemCachedUtil;
import org.junit.Before;

import javax.annotation.Resource;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/config/spring/spring.xml"})
public class BaseJUnit4Test {
	 
	@Resource
	protected MemCachedUtil cachedUtil;

	@Resource
	protected AliConstant aliConstant;
	
	@Before
	public void setContation(){
		AliToken aliToken=cachedUtil.getByAppkeyAndMemberId(aliConstant.APP_KEY, "b2b-1623492085");
		SessionUtil.setAliSession(aliToken);
	}
}
