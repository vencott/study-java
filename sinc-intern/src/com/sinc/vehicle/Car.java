package com.sinc.vehicle;

public class Car extends Vehicle {

	private double restOil;
	private int curWeight;

	public Car() {

	}

	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		this.restOil = 0;
		this.curWeight = 0;
	}

	public void addOil(int oil) {
		double addedOil = this.restOil + oil;
		if (addedOil <= this.getOilTankSize()) {
			this.restOil = addedOil;
		}
	}

	public void moving(int distance) {
		this.restOil -= (this.getEfficiency() * distance);
	}

	public void addWeight(int weight) {
		int addedWeight = this.curWeight + weight;
		if (addedWeight <= this.getMaxWeight()) {
			this.curWeight = addedWeight;
		}
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + this.restOil + "\t" + this.curWeight;
	}

	public double getRestOil() {
		return restOil;
	}

	public int getCurWeight() {
		return curWeight;
	}

	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}

	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}
}
