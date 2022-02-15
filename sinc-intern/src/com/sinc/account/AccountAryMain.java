package com.sinc.account;

public class AccountAryMain {

	public static void main(String[] args) {
		Account[] accounts = new Account[5];

		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account("221-0101-211" + (i + 1), 100000, 4.5);
		}

		for (int i = 0; i < accounts.length; i++) {
			accounts[i].accountInfo();
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < accounts.length; i++) {
			accounts[i].setInterestRate(3.7);
		}

		for (int i = 0; i < accounts.length; i++) {
			accounts[i].accountInfo();
			System.out.println(" 이자: " + accounts[i].calculateInterest() + "원");
		}
	}

}
