package com.mc.ojt.designpattern.a_builder;

public class Book {

	private String title;
	private String author;
	private int page;
	private int price;

	private Book(Builder builder) {
		this.title = builder.title;
		this.author = builder.author;
		this.page = builder.page;
		this.price = builder.price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPage() {
		return page;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", page=" + page + ", price=" + price + "]";
	}

	// [점층적 생성자 패턴]
	// Book book = new Book("해리포터", "조앤롤링", 1000, 1000);

	// 자바빈패턴 대비 장점 : 캡슐화를 통한 속성의 접근권한 관리를 할 수 있다.
	// Immutable한 객체를 만들 수 있다.(setter 만들지 않는다.)
	// Immutable : 객체를 생성한 이후 속성 값을 변경 불가능한
	// mutable : 변경 가능한

	// 단점 : new Book("해리포터", "조앤롤링", 1000, 1000);
	// 세번째 전달인자 1000과 네번째 전달인자 1000을 코드만 보고 어떤 의미의 데이터인지 알 수가 있을까?
	// 가독성이 떨어지는 단점

	// ex) String : immutable
	// StringBuffer : mutable

	// [자바빈패턴]
	// 기본생성자를 생성, 모든 속성에 대한 getter/setter + toString 를 만들어준다.
	// 장점 : 가독성
	// book.setPrice(1000); => 1000이 가격을 의미한 다는 것을 한눈에 알 수 있다.

	// 단점 : immutable한 객체를 만들 수 없다.
	// dto(data transfer object): 데이터 전송용 객체, mutable
	// vo(value object): 데이터 전송용 객체, immutable

	// [builder]
	// 가독성 + immutable한 객체 생성도 가능 객체생성패턴
	
	public static class Builder{
		private String title;
		private String author;
		private int page;
		private int price;
		
		public Builder title(String title) {
			this.title = title;
			return this;
		}
		
		public Builder author(String author) {
			this.author = author;
			return this;
		}
		
		public Builder page(int page) {
			this.page = page;
			return this;
		}
		
		public Builder price(int price) {
			this.price = price;
			return this;
		}
		
		public Book build() {
			return new Book(this);
		}
	}
	
	
	

}
