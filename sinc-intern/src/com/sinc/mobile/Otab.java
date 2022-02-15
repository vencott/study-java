package com.sinc.mobile;

public class Otab extends Mobile {

	public Otab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int operate(int time) {
		this.setBatterySize(this.getBatterySize() - (12 * time));
		return this.getBatterySize();
	}

	@Override
	public int charge(int time) {
		this.setBatterySize(this.getBatterySize() + (8 * time));
		return this.getBatterySize();
	}

}
