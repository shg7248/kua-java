
public class Ex05_18_객체배열 {
	public static void main(String[] args) {
		
		// Book객체 종류별로 3개를 배열로 생성
		Book[] books = new Book[3];
		books[0] = new Book();
		books[1] = new Book("Java", 20000);
		books[2] = new Book("Python", "학관", 30000);
		
		for(Book b : books) {
			b.show();
			System.out.println("=========================");
		}
	}
}