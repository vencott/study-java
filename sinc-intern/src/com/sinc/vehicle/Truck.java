package com.sinc.vehicle;

public class Truck extends Car {

	public Truck() {

	}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}

	@Override
	public double getEfficiency() {
		return super.getEfficiency() - (this.getCurWeight() / 5 * 0.2);
	}

	@Override
	public void moving(int distance) {
		this.setRestOil(this.getRestOil() - this.calcOil(distance));
	}

	public double calcOil(int distance) {
		return distance / this.getEfficiency();
	}

	public int getCost(int distance) {
		return (int) this.calcOil(distance) * 3000;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + this.getEfficiency();
	}
}
