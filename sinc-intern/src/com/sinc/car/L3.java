package com.sinc.car;

public class L3 extends Car implements Temp {

	public L3() {
		// TODO Auto-generated constructor stub
	}

	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTempGage() {
		return this.getDistance() / 10;
	}

	@Override
	public void go(int distance) {
		this.setDistance(distance);
		this.setOilSize(this.getOilSize() - (distance / 10));
	}

}
