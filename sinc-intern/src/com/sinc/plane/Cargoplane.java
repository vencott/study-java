package com.sinc.plane;

public class Cargoplane extends Plane {

	public Cargoplane() {
		// TODO Auto-generated constructor stub
	}

	public Cargoplane(String planename, int fuelSize) {
		super(planename, fuelSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flight(int distance) {
		// TODO Auto-generated method stub
		this.setFuelSize(this.getFuelSize() - 50 * (distance / 10));
	}

}
