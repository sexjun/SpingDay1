package com.csd.Spring.demo2;

import java.time.DateTimeException;
import java.util.Date;

/**
 * @aothor cds
 * @create 2019/10/4 - 21:09
 * 使用set方法进行依赖注入
 */
public class UserDaoImp2 implements UserDao {
	private String name;
	private int age;
	private Date date;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public void save() {
		System.out.println("save方法执行了" + "\n-name=" + name + "-age=" + age + "-dare=" + date);
	}
}
