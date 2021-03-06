
class Stu {
	String name;
	int kor;
	int eng;
	
	Stu () { // default 생성자
		this.name = "김세은";
		this.kor = 90;
		this.eng = 80;
	}
	
	Stu (String name) {	// 생성자가 만들어 졌다면 default 생성자는 만들어지지 않는다.
		this.name = name;
		this.kor = 77;
		this.eng = 33;
	}
	
	Stu (String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	void display() {
		System.out.println(name + ", " + kor + ", " + eng);
	}
}

public class Ex05_17_객체배열 {
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30};
		
		Stu s1 = new Stu();
		Stu s2 = new Stu("수지");
		Stu s3 = new Stu("수영", 60, 80);
		
		s1.display();
		s2.display();
		s3.display();
		
//		Stu[] arr2 = { new Stu(), new Stu("수지"), new Stu("수영", 60, 80) };
		
		Stu[] arr2 = new Stu[3];
		arr2[0] = new Stu();
		arr2[1] = new Stu("수지");
		arr2[2] = new Stu("수영", 60, 80);
		
		for(Stu st : arr2) {
			st.display();
		}
		
	}
}