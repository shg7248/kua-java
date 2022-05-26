
class Product {
	private String code;
	private String company;
	
	Product(String code, String company) {
		this.code = code;
		this.company = company;
	}
	
	void show() {
		System.out.println("code : " + code);
		System.out.println("company : " + company);
	}
	
	String getCode() {
		return this.code;
	}
	
	String getCompany() {
		return this.company;
	}
}

class Computer extends Product {
	
	private String os;
	private int ram;
	
	Computer(String code, String company, String os, int ram) {
		super(code, company);
		this.os = os;
		this.ram = ram;
	}
	
	@Override
	void show() {
		super.show();
		System.out.println("os : " + os);
		System.out.println("ram : " + ram);
	}
}

class Book extends Product {
	
	private String title;
	private String author;
	
	Book(String code, String company, String title, String author) {
		super(code, company);
		this.title = title;
		this.author = author;
	}
	
	String getTitle() {
		return this.title;
	}
	
	String getAuthor() {
		return this.author;
	}
}

public class Ex06_04_상속 {
	public static void main(String[] args) {

		Product p = new Product("P01", "제조사");
		p.show();
		
		System.out.println();
		
		Computer c = new Computer("Co2", "삼성", "window10", 64);
		c.show();
		
		System.out.println();
		
		Book b = new Book("B03", "중앙출판사", "자바", "이무진");
		
		System.out.println("code : " + b.getCode());
		System.out.println("company : " + b.getCompany());
		System.out.println("title : " + b.getTitle());
		System.out.println("author : " + b.getAuthor());
	
		System.out.println("===================================");
		
		Product[] pd = {
				new Product("P01", "제조사"),
				new Computer("Co2", "삼성", "window10", 64),
				new Book("B03", "중앙출판사", "자바", "이무진")
		};
		
		for(Product p2 : pd) {
			p2.show();
			System.out.println();
		}
	}
}
