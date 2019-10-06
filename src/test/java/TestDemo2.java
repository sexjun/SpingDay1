import com.csd.Spring.demo2.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @aothor cds
 * @create 2019/10/4 - 21:36
 */
public class TestDemo2 {
	@Test
	public void testConstuctorIo(){
		System.out.println("测试构造器注入");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
		UserDao a= (UserDao)applicationContext.getBean("UserDao1");
		a.save();
	}
	@Test
	public void testSetMethodIo(){
		System.out.println("测试set方法注入");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
		UserDao a= (UserDao)applicationContext.getBean("UserDao2");
		a.save();
	}

	@Test
	public void testComplexTypeIo(){
		System.out.println("测试复杂类型方法注入");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
		UserDao a= (UserDao)applicationContext.getBean("UserDao3");
		a.save();
	}
}
