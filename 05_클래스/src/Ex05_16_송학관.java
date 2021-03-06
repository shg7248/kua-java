
class Music {
	
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music() {
		this.title = "INVU";
		this.singer = "태연";
		this.genre = "발라드";
		this.price = 1000;
	}
	
	Music(String title, String singer, String genre, int price) {
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}
	
	String getTitle() {
		return title;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	
	String getSinger() {
		return singer;
	}
	
	void setSinger(String singer) {
		this.singer = singer;
	}
	
	String getGenre() {
		return genre;
	}
	
	void setGenre(String genre) {
		this.genre = genre;
	}
	
	int getPrice() {
		return price;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	void display() {
		System.out.println(title + ", " + singer + ", " + genre + ", " + price);
	}
}

public class Ex05_16_송학관 {
	public static void main(String[] args) {
		
		Music m1 = new Music();
		Music m2 = new Music("that that", "싸이", "댄스", 2000);
		Music m3 = new Music();
		
		m3.setTitle("어머나");
		m3.setSinger("장윤정");
		m3.setGenre("트로트");
		m3.setPrice(3000);
		
		m1.display();
		m2.display();
		m3.display();
		
//		Music m1 = new Music();	// (생성자 통한 초기화)INVU, 태연, 발라드, 1000
//		Music m2 = new Music("that that", "싸이", "댄스", 2000); // 생성자 통한 초기화
//		Music m3 = new Music(); // setter 통한 초기화 ("어머나", "장윤정", "트로트", "3000")
		
		// m1 getter 통한 출력
		// m2, m3 display() 메서드에서 한번에 출력
		
	}   
}