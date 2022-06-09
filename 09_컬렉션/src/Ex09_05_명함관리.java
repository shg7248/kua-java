import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Card {
	private String name;
	private String tel;
	
	public Card(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getTel() {
		return this.tel;
	}
	
	public String toString() {
		return name + "\t" + tel;
	}
}

public class Ex09_05_명함관리 {
	public static void main(String[] args) {
		
		ArrayList<Card> cards = new ArrayList<Card>();
		Scanner sc = new Scanner(System.in);
		String name, tel;
		int selectNum;
		boolean find;
		
		while(true) {
			System.out.println();
			System.out.println("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료");
			System.out.print(">> ");
			selectNum = sc.nextInt();
			
			switch(selectNum) {
			case 1:
				System.out.print("이름 입력 : ");
				name = sc.next();
				System.out.print("전화번호 입력 : ");
				tel = sc.next();
				
				cards.add(new Card(name, tel));
				break;
			case 2:
				System.out.print("삭제할 이름 입력 : ");
				name = sc.next();
				
				find = false;
				for(Card card : cards) {
					if(card.getName().equals(name)) {
						System.out.println(name + "님의 정보가 삭제되었습니다.");
						cards.remove(card);
						find = !find;
						break;
					}
				}
				if(!find)
					System.out.println(name + "님의 정보가 없습니다.");
				
				break;
			case 3:
				System.out.print("수정할 이름 입력 : ");
				name = sc.next();
				
				find = false;
				for(Card card : cards) {
					if(card.getName().equals(name)) {
						System.out.print("수정할 번호 입력 : ");
						tel = sc.next();
//						card.setTel(tel);
						cards.set(cards.indexOf(card), new Card(name, tel));
						System.out.println("번호가 수정되었습니다!!");
						find = !find;
						break;
					}
				}
				if(!find)
					System.out.println(name + "님의 정보가 없습니다.");
				
				break;
			case 4:
				System.out.println("이름\t전화번호");
				System.out.println("=======================");
				if(cards.size() == 0) {
					System.out.println("비 어 있 음");
				}
				else {
//					for(Card card : cards) {
//						System.out.println(card.getName() + "\t" + card.getTel());
//					}
					Iterator<Card> iterator = cards.iterator();
					while(iterator.hasNext()) {
						Card card = iterator.next();
						System.out.println(card);
					}
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); // 프로그램을 강제로 종료시키는 메서드
				break;
			default :
				System.out.println("1~5만 입력 가능합니다.");	
			}
		}
	}
}
