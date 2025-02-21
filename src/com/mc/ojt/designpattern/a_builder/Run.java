package com.mc.ojt.designpattern.a_builder;

public class Run {

	public static void main(String[] args) {
		Book book = new Book.Builder()
				.title("해리포터")
				.author("조앤롤링")
				.price(1000)
				.page(1000)
				.build();
		
		System.out.println(book);
		System.out.println(book.getTitle());
	}

}
