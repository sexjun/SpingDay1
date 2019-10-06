package com.csd.Spring.demo1;

/**
 * @aothor cds
 * @create 2019/10/4 - 20:41
 */
public class CarStaticFactory {
	public static CarDao getCarInstance(){
		return  new CarDaoImpl();
	}
}
