import com.csd.Spring.demo1.CarDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @aothor cds
 * @create 2019/10/4 - 16:33
 */
public class TestDemo1 {
	@org.junit.Test
	public void testDefaultConstructor(){
		System.out.println("无参构造方法测试");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		CarDao carDao = (CarDao)applicationContext.getBean("CarDao1");
		carDao.save();
	}

	@org.junit.Test
	public void testIndustryConstructor(){
		System.out.println("工厂构造方法测试");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		CarDao carDao= (CarDao)applicationContext.getBean("CarDao2");
		carDao.save();
	}

	@org.junit.Test
	public void testStatiindustryConstructor(){
		System.out.println("静态工厂构造方法测试");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		CarDao carDao= (CarDao)applicationContext.getBean("CarDao3");
		carDao.save();
	}



}
