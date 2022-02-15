package com.sinc.plane;

public class PlaneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane[] planes = new Plane[2];
		planes[0] = new Airplane("L747", 1000);
		planes[1] = new Cargoplane("C40", 1000);

		System.out.println("Plane\tfuelSize");
		for (Plane plane : planes) {
			System.out.println(plane.getPlanename() + "\t" + plane.getFuelSize());
		}
		System.out.println();

		System.out.println("100 운항");
		for (Plane plane : planes) {
			plane.flight(100);
			System.out.println(plane.getPlanename() + "\t" + plane.getFuelSize());
		}
		System.out.println();

		System.out.println("200 주유");
		for (Plane plane : planes) {
			plane.refuel(200);
			System.out.println(plane.getPlanename() + "\t" + plane.getFuelSize());
		}
	}

}
