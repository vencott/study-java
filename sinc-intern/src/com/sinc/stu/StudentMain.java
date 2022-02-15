package com.sinc.stu;

public class StudentMain {

	public static void main(String[] args) {
		StuVO studentArray[] = new StuVO[10];
		int stuNum = 0;

		studentArray[0] = new StuVO("홍길동", 15, 170, 80);
		studentArray[1] = new StuVO("한사람", 13, 180, 70);
		studentArray[2] = new StuVO("임걱정", 16, 175, 65);

		System.out.println("이름\t나이\t신장\t몸무게");
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null) {
				System.out.println(studentArray[i].studentInfo());
				stuNum++;
			}
		}
		System.out.println();

		double ageSum = 0;
		double heightSum = 0;
		double weightSum = 0;
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null) {
				ageSum += studentArray[i].getAge();
				heightSum += studentArray[i].getHeight();
				weightSum += studentArray[i].getWeight();
			}
		}
		System.out.println("나이 평균: " + ageSum / stuNum);
		System.out.println("신장 평균: " + heightSum / stuNum);
		System.out.println("몸무게 평균: " + weightSum / stuNum);
		System.out.println();

		StuVO ageMax = studentArray[0];
		StuVO ageMin = studentArray[0];
		StuVO heightMax = studentArray[0];
		StuVO heightMin = studentArray[0];
		StuVO weightMax = studentArray[0];
		StuVO weightMin = studentArray[0];
		for (int i = 1; i < studentArray.length; i++) {
			StuVO curStuVO = studentArray[i];
			if (curStuVO != null) {
				if (curStuVO.getAge() > ageMax.getAge()) {
					ageMax = curStuVO;
				}

				if (curStuVO.getAge() < ageMin.getAge()) {
					ageMin = curStuVO;
				}

				if (curStuVO.getHeight() > heightMax.getHeight()) {
					heightMax = curStuVO;
				}

				if (curStuVO.getHeight() < heightMin.getHeight()) {
					heightMin = curStuVO;
				}

				if (curStuVO.getWeight() > weightMax.getWeight()) {
					weightMax = curStuVO;
				}

				if (curStuVO.getWeight() < weightMin.getWeight()) {
					weightMin = curStuVO;
				}
			}
		}

		System.out.println("나이가 가장 많은 학생: " + ageMax.getName());
		System.out.println("나이가 가장 적은 학생: " + ageMin.getName());
		System.out.println("신장이 가장 큰 학생: " + heightMax.getName());
		System.out.println("신장이 가장 작은 학생: " + heightMin.getName());
		System.out.println("몸무게가 가장 많이 나가는 학생: " + weightMax.getName());
		System.out.println("몸무게가 가장 적게 나가는 학생: " + weightMin.getName());
	}
}
