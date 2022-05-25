
public class Ex05_15_생성자 {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.show();
		
		System.out.println("=========================");
		
		Book b2 = new Book("HTML", "아이유", 3000);
		b2.show();
	}
}