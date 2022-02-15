package com.sinc.cal;

import java.util.Random;

public class CalMain {

	public static final int RAN_NUMS = 4;

	public static void main(String[] args) {
		int sum;
		double avg;
		String grade;
		int[] randomNums = new int[RAN_NUMS];
		Calc calc = new Calc();

		Random random = new Random();

		for (int i = 0; i < randomNums.length; i++) {
			randomNums[i] = random.nextInt(101);
		}

		sum = calc.calcSum(randomNums[0], randomNums[1], randomNums[2], randomNums[3]);

		avg = sum / (double) RAN_NUMS;

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

		System.out.println("Sum:" + sum);
		System.out.println("Avg:" + avg);
		System.out.println(grade + "학점");
	}
}