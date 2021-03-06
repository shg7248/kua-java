import java.util.Scanner;

public class Ex03_03_ifelse {
	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int kor, eng, math;
		String name;
		
		System.out.print("이름입력=> ");
		name = sc.next();	// 문자열을 읽겠다.
		
		System.out.print("국어점수=> ");
		kor = sc.nextInt();	// 정수를 읽겠다.
		
		System.out.print("영어점수=> ");
		eng = sc.nextInt();
		
		System.out.print("수학점수=> ");
		math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = total / 3f;
		
		System.out.println("============================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("============================");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math);
		System.out.println("============================");
		System.out.println("총합 : " + total);
		System.out.printf("평균 : %.2f\n", avg);
		
		if(avg >= 90) {
			System.out.println("학점 : A학점");
		}
		else if(avg >= 80) {
			System.out.println("학점 : B학점");
		}
		else if(avg >= 70) {
			System.out.println("학점 : C학점");
		}
		else if(avg >= 60) {
			System.out.println("학점 : D학점");
		}
		else {
			System.out.println("학점 : F학점");
		}
	}
}
