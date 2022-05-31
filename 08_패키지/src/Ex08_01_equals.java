
class Fruit extends Object {
	
	String name;
	int price;
	
	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// 주소를 리턴하는 기능이 마음에 안들어서 toString을 오버라이딩 해서 사용했다.
	@Override
	public String toString() {
		return "name : " + name + ", price : " + price;
	}
	
//	public boolean equals(Object obj) {
//		String name = null;
//		if(obj instanceof String) {
//			name = (String)obj;
//		}
//		return this.name.equals(name);
//	}
	
	@Override
	public boolean equals(Object obj) {
		// this가 f1을 받는다.
		// obj가 f2를 받는다.
		Fruit f = null;
		if(obj instanceof Fruit)
			f = (Fruit) obj;
		return this.price == f.price;
	}
}

public class Ex08_01_equals {
	public static void main(String[] args) {
		
//		apple, 1000
//		orange, 2000
		
		Fruit f1 = new Fruit(new String("apple"), 1000);
		System.out.println(f1);
		Fruit f2 = new Fruit(new String("apple"), 1000);
		System.out.println(f2);
		
		System.out.println(f1.price == f2.price);
		System.out.println(f1.name.equals(f2.name));
		
		System.out.println(new String("100").hashCode());
		System.out.println(new String("100").hashCode());
		
	}
}

// 참조변수만 써도 toString 메서드가 호출이 된다.
// 모든 클래스는 Object라는 클래스를 상속 받는다. (모든 클래스의 조상)
// toString은 주소를 리턴하도록 되어 있다.
// String 객체를 이용해서 문자열을 생성하면 주소가 다르다.

// Object
// String toString() : 주소를 리턴
// boolean equals() : 주소 비교한 결과 비교
