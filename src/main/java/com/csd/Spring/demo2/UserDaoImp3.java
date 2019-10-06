package com.csd.Spring.demo2;

import java.util.*;

/**
 * @aothor cds
 * @create 2019/10/4 - 21:09
 * 复杂数据类型依赖注入
 *
 */
public class UserDaoImp3 implements UserDao {
	private String[] myStrs;
	private List<String> myList;
	private Set<String> mySet;
	private Map<String,String> myMap;
	private Properties myProps;

	public void setMyStrs(String[] myStrs) {
		this.myStrs = myStrs;
	}

	public void setMyList(List<String> myList) {
		this.myList = myList;
	}

	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}

	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}

	public void setMyProps(Properties myProps) {
		this.myProps = myProps;
	}


	@Override
	public void save() {
		System.out.println(Arrays.toString(myStrs));
		System.out.println(myList);
		System.out.println(mySet);
		System.out.println(myMap);
		System.out.println(myProps);

	}
}
