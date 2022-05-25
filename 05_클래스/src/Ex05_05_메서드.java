import java.util.Scanner;

class Student {
	
	int kor;
	int eng;	// 멤버변수
	int math;
	
	// 합계를 리턴하는 sum 메서드 정의
	int sum() {
		int result = kor + eng + math;
		return result;
	}

	public float avg() {
		
		// sum() 메서드에서 합계 정보를 받아 옴
		float result = sum() / 3f;
		return result;
	}
	
}

public class Ex05_05_메서드 {
	public static void main(String[] args) throws Exception { // 정의
		
		Student s = null;
		s = new Student();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		s.kor = sc.nextInt();
		System.out.print("영어점수 : ");
		s.eng = sc.nextInt();
		System.out.print("수학점수 : ");
		s.math = sc.nextInt();
		
		// int sum = s.sum(kor, eng, math)
		int sum = s.sum();
		System.out.println("sum : " + sum);
		
		float avg = s.avg();
		System.out.printf("avg : %.1f", avg);
	}
}