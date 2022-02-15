package com.sinc.plane;

public abstract class Plane {

	private String planename;
	private int fuelSize;

	public Plane() {
		// TODO Auto-generated constructor stub
	}

	public Plane(String planename, int fuelSize) {
		super();
		this.planename = planename;
		this.fuelSize = fuelSize;
	}

	public void refuel(int fuel) {
		this.setFuelSize(this.getFuelSize() + fuel);
	}

	public abstract void flight(int distance);

	public String getPlanename() {
		return planename;
	}

	public void setPlanename(String planename) {
		this.planename = planename;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}

}
