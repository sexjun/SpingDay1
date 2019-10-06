package com.csd.Spring.demo1;

/**
 * @aothor cds
 * @create 2019/10/4 - 16:30
 */
public class CarDaoImpl implements CarDao {


	public CarDaoImpl() {
		System.out.println("默认构造方法启动了");
	}

	public void save() {
		System.out.println("CarDaoImpl --- save方法运行了");
	}
}
