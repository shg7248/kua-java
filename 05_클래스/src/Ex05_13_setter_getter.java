
class Book { // 내가 만들어 쓰는 자료형
	
	private String title; // private : 다른 클래스에선 보이지 않음
	private String author;
	private int price;
	
	Book() {
		this.title = "JSP";
		this.author = "써니";
		this.price = 1000;
	}
	
	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	Book(String title, int price) {
		this.title = title;
		this.author = "윤아";
		this.price = price;
	}
	
	void setTitle(String t) { 	// setter 메서드
		title = t;
	}
	
	String getTitle() {			// getter 메서드
		return title;
	}
	
	void setAuthor(String a) {
		author = a;
	}
	
	String getAuthor() {
		return author;
	}
	
	void setPrice(int p) {
		price = p;
	}
	
	int getPrice() {
		return price;
	}
	
	void show() {
		System.out.println("title : " + title);
		System.out.println("author : " + author);
		System.out.println("price : " + price);
	}
}

public class Ex05_13_setter_getter {	// 실행 메서드를 가지고 있는 실행 클래스
	public static void main(String[] args) {
		
		Book bk1 = new Book();
		// bk1.title = "자바";
		bk1.setTitle("자바");
		bk1.setAuthor("홍길동");
		bk1.setPrice(3000);
		
		System.out.println("title : " + bk1.getTitle());
		System.out.println("author : " + bk1.getAuthor());
		System.out.println("price : " + bk1.getPrice());
		
		System.out.println("------------------");
		
		Book bk2 = new Book();
		bk2.setTitle("무엇");
		bk2.setAuthor("송학관");
		bk2.setPrice(100000);
		
		System.out.println("title : " + bk2.getTitle());
		System.out.println("author : " + bk2.getAuthor());
		System.out.println("price : " + bk2.getPrice());
	}
}