import java.util.ArrayList;
import java.util.Scanner;

class Music {
	private String title;
	private String singer;
	private int price;
	
	public Music(String title, String singer, int price) {
		this.title = title;
		this.singer = singer;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return title+"/"+singer+"/"+price;
	}
}

public class Ex09_04_송학관 {
	public static void main(String[] args) {
		
		ArrayList<Music> arr = new ArrayList<Music>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("제목 : ");
			String title = sc.next();
			
			System.out.print("가수 : ");
			String singer = sc.next();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			arr.add(new Music(title, singer, price));
			
			System.out.print("계속? ");
			String yn = sc.next();
			
			if(yn.equals("n")) {
				break;
			}
		}
		
		System.out.println(arr);
		
		while(true) {
			System.out.print("찾는 제목 입력 : ");
			String t = sc.next();
			
			boolean find  = false;
			for(Music mm : arr) {
				if(mm.getTitle().equals(t)) {
					System.out.println(t + "의 가수명은 " + mm.getSinger());
					find = !find;
					break;
				}
			}
			if(!find)
				System.out.println("찾는 제목이 없습니다.");
			
			System.out.print("계속? ");
			String yn = sc.next();
			if(yn.equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
	}
}
/*
제목:낙하
가수:악뮤
가격:1000
계속?y
제목:마시멜로
가수:아이유
가격:2000
계속?n
[낙하/악뮤/1000, 마시멜로/아이유/2000]
찾는 제목 입력:마시멜로
마시멜로의 가수명은 아이유
계속?y
찾는 제목 입력:단발머리
찾는 제목이 없습니다.
계속?n
프로그램을 종료합니다.
*/
