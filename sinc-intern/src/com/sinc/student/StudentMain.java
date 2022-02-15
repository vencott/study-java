package com.sinc.student;

public class StudentMain {

	public static void main(String[] args) {
		Student kim = new Student("Kim", 100, 90, 95, 89);
		Student lee = new Student("Lee", 60, 70, 99, 98);
		Student park = new Student("Park", 68, 86, 60, 40);

		System.out.println(kim.getName() + " 평균: " + kim.getAvg() + " 학점: " + kim.getGrade() + "학점");
		System.out.println(lee.getName() + " 평균: " + lee.getAvg() + " 학점: " + lee.getGrade() + "학점");
		System.out.println(park.getName() + " 평균: " + park.getAvg() + " 학점: " + park.getGrade() + "학점");
	}
}
