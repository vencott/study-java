package com.sinc.stu;

public class StuVO {
	private String name;
	private int age;
	private int height;
	private int weight;

	public StuVO() {

	}

	public StuVO(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String studentInfo() {
		return this.name + "\t" + this.age + "\t" + this.height + "\t" + this.weight;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

}
