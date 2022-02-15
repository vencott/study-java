package com.sinc.mobile;

public class Ltab extends Mobile {

	public Ltab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int operate(int time) {
		this.setBatterySize(this.getBatterySize() - (10 * time));
		return this.getBatterySize();
	}

	@Override
	public int charge(int time) {
		this.setBatterySize(this.getBatterySize() + (10 * time));
		return this.getBatterySize();
	}

}
