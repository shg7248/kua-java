import java.util.ArrayList;
import java.util.Scanner;

class Studentshg{
	
	private String name;
	private int kor;
	private int eng;
	
	public Studentshg(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getKor() {
		return this.kor;
	}
	
	public int getEng() {
		return this.eng;
	}
	
	public String toString() {
		return name + "/" + kor + "/" + eng;
	}
}

public class Test05_송학관 {
	public static void main(String[] args) {
		ArrayList<Studentshg> students = new ArrayList<Studentshg>();
		Scanner sc = new Scanner(System.in);
		String name, yn;
		int kor, eng;
		boolean find;
		
		while(true) {
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("국어 : ");
			kor = sc.nextInt();
			System.out.print("영어 : ");
			eng = sc.nextInt();
			
			students.add(new Studentshg(name, kor, eng));
			
			System.out.print("계속?(y/n) : ");
			yn = sc.next();
			if(yn.equals("n"))
				break;
		}
		
		System.out.println(students);
		
		System.out.println();
		
		for(Studentshg student : students) {
			System.out.println(student);
		}
		
		System.out.println();
		
		while(true) {
			System.out.print("찾는 이름 : ");
			name = sc.next();
			
			find = false;
			for(Studentshg student : students) {
				if(student.getName().equals(name)) {
					System.out.println("국어 : " + student.getKor());
					System.out.println("영어 : " + student.getEng());
					find = !find;
					break;
				}
			}
			
			if(!find) {
				System.out.println("찾는 이름 없음");
			}
			
			System.out.print("계속? : ");
			yn = sc.next();
			if(yn.equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}
}

/*
이름:kim
국어:77
영어:88
계속?(y/n) : y
이름:park
국어:33
영어:44
계속?(y/n) : n
[kim/77/88, park/33/44]

kim/77/88
park/33/44

찾는 이름 : park
국어:33
영어:44
계속?y
찾는 이름 : choi
찾는 이름 없음
계속?n
프로그램을 종료합니다.
*/
