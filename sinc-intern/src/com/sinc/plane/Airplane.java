package com.sinc.plane;

public class Airplane extends Plane {

	public Airplane() {
		// TODO Auto-generated constructor stub
	}

	public Airplane(String planename, int fuelSize) {
		super(planename, fuelSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flight(int distance) {
		// TODO Auto-generated method stub
		this.setFuelSize(this.getFuelSize() - 30 * (distance / 10));
	}

}
