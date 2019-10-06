import com.csd.Spring.demo3.AccountDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @aothor cds
 * @create 2019/10/4 - 22:29
 */
public class TestDemo3 {
	@Test
	public void testInject(){
		System.out.println("测试注解component");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
		AccountDao a = (AccountDao)applicationContext.getBean("accountDaoImpl");
		a.saveAccount();
	}
}
