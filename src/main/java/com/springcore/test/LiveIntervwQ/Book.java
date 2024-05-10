package com.springcore.test.LiveIntervwQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Book {
	// Write Program in Java 8
	// 1. Print the titles of books published after 2000
	// 2. Calculate the total price of all books
	// 3. Find the book with the highest price
	// 4. Create a new list with books priced less than $40

	private String title;
	private String author;
	private int year;
	private double price;
	private String serialNo;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + ", price=" + price + ", serialNo="
				+ serialNo + "]";
	}

	public Book(String title, String author, int year, double price, String serialNo) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.price = price;
		this.serialNo = serialNo;
	}

	public static void main(String[] args) {

		List<Book> book = Arrays.asList(new Book("java 8", "rahul", 2014, 90.0, "we321w4545"),
				new Book("c++", "sam", 2029, 80.0, "we321w465"), new Book("c", "ram", 1500, 60.0, "we321w456"),
				new Book("python", "sid", 2012, 50.0, "we321w427"), new Book("dotnet", "nov", 2010, 30.0, "we321w467"),
				new Book("golang", "sxx", 2012, 50.0, "we321w427"));
		// 1. Print the titles of books published after 2000
		// 2. Calculate the total price of all books
		// 3. Find the book with the highest price
		// 4. Create a new list with books priced less than $40

		System.out.println("Print the titles of books published after 2000");
		book.stream().filter(bk -> bk.getYear() > 2000).map(Book::getTitle).forEach(e -> System.out.print(e + " "));

		System.out.println("\n\nCalculate the total price of all books");
		double countBook = book.stream().mapToDouble(Book::getPrice).sum();
		System.out.println(countBook);

		System.out.println("\nCalculate the price of all books released after 2000");
		countBook = book.stream().filter(bk -> bk.getYear() > 2000).mapToDouble(Book::getPrice).sum();
		// map with filter
		System.out.println(countBook);

		System.out.println("\nFind the book with the highest price");
		Book mostExpensiveBook = book.stream().max((book1, book2) -> Double.compare(book1.getPrice(), book2.getPrice()))
				.orElse(null);
		System.out.println(mostExpensiveBook);
		Optional<Book> mostExpensiveBook1 = book.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Book::getPrice)));
		System.out.println(mostExpensiveBook1);

		System.out.println("\nCreate a new list with books priced less than $40");
		List<Book> affortBooks = book.stream().filter(bk -> bk.getPrice() < 40).collect(Collectors.toList());
		affortBooks.forEach(System.out::println);

		System.out.println("\ngroup by skills");
		Map<String, List<Book>> byskilset = book.stream().collect(Collectors.groupingBy(Book::getTitle));
		// System.out.println(byskilset);

		byskilset.forEach((skillset, bookList) -> {
			System.out.print("Skillset: " + skillset);
			bookList.forEach(e -> System.out.println("  " + e.getAuthor()));
		});

		System.out.print("\nfind book which has serial no ending with 7 : ");
		// find book which has serial no ending with 7
		List<String> bySerial = book.stream().filter(e -> e.getSerialNo().endsWith("7")).map(Book::getTitle)
				.collect(Collectors.toList());
		System.out.print(bySerial);

		
		System.out.print("\nsort employee base on salary, if salary is same, sort on name \n");
		
		book.sort(Comparator.comparingDouble(Book::getPrice).thenComparing(Book::getTitle));
		
		book.forEach(emp -> System.out.println(emp.getTitle() + " - Salary: $" + emp.getPrice()));
		

	}
}
