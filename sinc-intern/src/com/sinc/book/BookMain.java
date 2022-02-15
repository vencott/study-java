package com.sinc.book;

public class BookMain {
	
	public static final int BOOK_NUMS = 3;

	public static void main(String[] args) {
		Book[] books = new Book[BOOK_NUMS];
		books[0] = new Book("SQL Plus", 50000, 5.0);
		books[1]= new Book("Java 2.0", 40000, 3.0);
		books[2]= new Book("JSP Servlet", 60000, 6.0);
		
		for ( Book book : books) {
			System.out.println(book.getBookName() + "\t" + book.getBookPrice() + "\t" + book.getBookDiscountRate() + "%\t" + book.getDiscountBookPrice() + "원");
		}
	}
}