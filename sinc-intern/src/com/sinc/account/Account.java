package com.sinc.account;

public class Account {

	private String account;
	private int balance;
	private double interestRate;

	public Account() {

	}

	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public double calculateInterest() {
		return this.balance * (interestRate / 100.0);
	}

	public void deposit(int money) {
		this.balance += money;
	}

	public void withdraw(int money) {
		if (this.balance - money < 0) {
			System.out.println("출금 할 수 없습니다.");
		} else {
			this.balance -= money;
		}
	}

	public void accountInfo() {
		System.out.print("계좌번호: " + this.account + " 잔액: " + this.balance + " 이자율: " + this.interestRate + "%");
	}

	public String getAccount() {
		return account;
	}

	public int getBalance() {
		return balance;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
}