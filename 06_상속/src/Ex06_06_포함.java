
class Per {
	String name;
	int age;
	
	Per(String name, int age){
		this.name = name;
		this.age = age;
	}
} // Per

class Stu {
	int kor, eng, math;
	Per per;	// Per 객체를 포함
	
	Stu(String name, int age, int kor, int eng, int math){
		per = new Per(name, age);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	} // 생성자
	
	void display() {
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(per.name);
		System.out.println(per.age);
	}
} // Stu

public class Ex06_06_포함 {
	public static void main(String[] args) {

		Stu s = new Stu("kim", 25, 70, 80, 90);
		System.out.println(s.kor);
		System.out.println(s.eng);
		System.out.println(s.math);
		System.out.println(s.per.name);
		System.out.println(s.per.age);
		
		System.out.println("----------------");
		
		s.display();
	}
}
