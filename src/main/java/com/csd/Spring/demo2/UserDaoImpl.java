package com.csd.Spring.demo2;

import java.util.Date;

/**
 * @aothor cds
 * @create 2019/10/4 - 21:09
 * 使用构造方法进行依赖注入
 *
 */
public class UserDaoImpl implements UserDao {
	// 如果是经常变化的数值，并不适合注入的方式
	private String name;
	private int age;
	private Date date;

	public UserDaoImpl(String name, int age, Date date) {
		this.name = name;
		this.age = age;
		this.date = date;
	}

	@Override
	public void save() {
		System.out.println("save方法执行了" + "\n-name=" + name + "-age=" + age + "-dare=" + date);
	}
}
