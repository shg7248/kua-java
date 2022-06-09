import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Student {
	private String school;
	private int java;
	
	public Student() {
		
	}
	
	public Student(String school, int java) {
		this.school = school;
		this.java = java;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public String getSchool() {
		return this.school;
	}
	
	public void setJava(int java) {
		this.java = java;
	}
	
	public int getJava() {
		return this.java;
	}
	
	@Override
	public String toString() {
		return this.school + "/" + this.java;
	}
}

public class Ex09_11_HashMap {
	public static void main(String[] args) {
		
		HashMap<String, Student> map = new HashMap<String, Student>();
		Scanner sc = new Scanner(System.in);
		String yn, name, school;
		int java;
		
		while(true) {
			
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("학교 : ");
			school = sc.next();
			System.out.print("자바 : ");
			java = sc.nextInt();
			Student student = new Student(school, java);
			map.put(name, student);
			
			System.out.print("계속? : ");
			yn = sc.next();
			if(yn.equals("n"))
				break;
		}
		
		System.out.println(map);
		
		while(true) {
			
			System.out.print("찾는 이름 입력 : ");
			name = sc.next();
			
			Student student = map.get(name);
			if(student == null) {
				System.out.println("찾는 이름이 없습니다.");
			}
			else {
				System.out.println(student);
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