package com.sinc.vehicle;

public class Vehicle {

	private int maxWeight;
	private double oilTankSize;
	private double efficiency;

	public Vehicle() {

	}

	public Vehicle(int maxWeight, double oilTankSize, double efficiency) {
		super();
		this.maxWeight = maxWeight;
		this.oilTankSize = oilTankSize;
		this.efficiency = efficiency;
	}

	@Override
	public String toString() {
		return this.maxWeight + "\t" + this.oilTankSize;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public double getOilTankSize() {
		return oilTankSize;
	}

	public double getEfficiency() {
		return efficiency;
	}
}
