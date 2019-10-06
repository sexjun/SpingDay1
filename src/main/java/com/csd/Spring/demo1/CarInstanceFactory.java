package com.csd.Spring.demo1;

/**
 * @aothor cds
 * @create 2019/10/4 - 20:00
 * 模拟一个工厂类。假设是jar包中的类
 */
public class CarInstanceFactory {
	public CarDao getCarDaoAccess(){
		return  new CarDaoImpl();
	}
}
