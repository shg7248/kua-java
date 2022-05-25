import java.util.Scanner;

public class Ex05_입력문 {
	public static void main(String[] args) {
		
//		int kor = 70;
//		int eng = 80;
//		int math = 90;
		
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
		double av = total / 3f;
		
		System.out.println("============================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("============================");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math);
		System.out.println("============================");
		System.out.println("총합 : " + total);
		System.out.printf("평균 : %.2f", av);
		
	}
}
