package com.hacker.thirtydayscode;

public class myBook extends Book{

	int price;
	myBook(String title, String author, int price)
	{
		super(title, author);
		this.price=price;
	}

	@Override
	void display() {
		System.out.println("author: "+this.author);
		System.out.println("title: "+this.title);
		System.out.println("price: "+this.price);
		
		
	}

}
