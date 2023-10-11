package com.moneySutra.entity;

public class Student {

	
	int age;
	String name;
	
	public void showName()
	{
		System.out.print("----my name is"+ age);
	}

	public int getAge() {
		return age;
	}

	public boolean setAge(int age) {
		if(age > 0)
		{
			this.age = age;
			return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

