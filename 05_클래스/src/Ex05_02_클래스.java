
class Snack {
	static String company;
	private String name;
	private int price;
	
	Snack() {
		
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	int getPrice() {
		return price;
	}
}

public class Ex05_02_클래스 {
	public static void main(String[] args) {
		Snack.company = "농심"; // 인스턴스 변수와 달리 언급만 되도 변수가 생성된다.
		
		Snack s1 = new Snack();
		s1.setName("새우깡");
		s1.setPrice(1000);
		
		System.out.println(Snack.company);
		System.out.println(s1.getName());
		System.out.println(s1.getPrice());
		
		System.out.println();
		
		Snack s2 = new Snack();
		s2.setName("브라보콘");
		s2.setPrice(2000);
		
		System.out.println(Snack.company);
		System.out.println(s2.getName());
		System.out.println(s2.getPrice());
	}
}
