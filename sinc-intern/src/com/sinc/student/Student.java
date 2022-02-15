package com.sinc.student;

public class Student {

	public static final int SUBJECT_NUMS = 4;

	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;

	public Student() {

	}

	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	public double getAvg() {
		return (this.korean + this.english + this.math + this.science) / (double)SUBJECT_NUMS;
	}

	public String getGrade() {
		double avg = this.getAvg();
		String grade;

		if (avg <= 100 && avg >= 90) {
			grade = "A";
		} else if (avg < 90 && avg >= 70) {
			grade = "B";
		} else if (avg < 70 && avg >= 50) {
			grade = "C";
		} else if (avg < 50 && avg >= 30) {
			grade = "D";
		} else {
			grade = "F";
		}

		return grade;
	}

	public String getName() {
		return name;
	}
}
