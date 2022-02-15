package com.sinc.car;

public class L5 extends Car implements Temp {

	public L5() {
		// TODO Auto-generated constructor stub
	}

	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTempGage() {
		return this.getDistance() / 5;
	}

	@Override
	public void go(int distance) {
		this.setDistance(distance);
		this.setOilSize(this.getOilSize() - (distance / 8));
	}

}
