package com.sinc.mobile;

public class MobileMain {

	public static void main(String[] args) {
		Mobile[] mobiles = new Mobile[2];
		mobiles[0] = new Ltab("Ltab", 500, "AP-01");
		mobiles[1] = new Otab("Otab", 1000, "AND-20");

		System.out.println("Mobile\tBattery\tOS");
		for (Mobile mobile : mobiles) {
			System.out.println(mobile.getMobileName() + "\t" + mobile.getBatterySize() + "\t" + mobile.getOsType());
		}
		System.out.println();

		System.out.println("10분 충전");
		System.out.println("Mobile\tBattery\tOS");
		for (Mobile mobile : mobiles) {
			mobile.charge(10);
			System.out.println(mobile.getMobileName() + "\t" + mobile.getBatterySize() + "\t" + mobile.getOsType());
		}
		System.out.println();

		System.out.println("5분 통화");
		System.out.println("Mobile\tBattery\tOS");
		for (Mobile mobile : mobiles) {
			mobile.operate(5);
			System.out.println(mobile.getMobileName() + "\t" + mobile.getBatterySize() + "\t" + mobile.getOsType());
		}
	}

}
