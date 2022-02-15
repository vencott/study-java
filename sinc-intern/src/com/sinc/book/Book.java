package com.sinc.book;

public class Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;

	public Book() {

	}

	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}

	public double getDiscountBookPrice() {
		return bookPrice / 100 * (100.0 - bookDiscountRate);
	}

	public String getBookName() {
		return bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
}