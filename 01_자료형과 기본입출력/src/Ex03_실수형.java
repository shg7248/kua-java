
public class Ex03_실수형 {
	public static void main(String[] args) {
		
		double d1 = 1.2;
		double d2;
		d2 = 3.4;
		
		double d3;
		d3 = d1 + d2;
		
		System.out.println("d3="+d3);
		
		double d4 = 0.123E3; // 0.123*10*10^3
		System.out.println("d4="+d4);
		
		double d5 = 0.123E-3; // 0.123*10*10^-3
		System.out.println("d5="+d5);
		// 0.000123 == 1.23E-4
		
		double dd = 0.0131313E-2;
		System.out.println("sdfsdf"+dd);
		
		float f1;
		f1 = 0.0123F;	// f�� ������ �ڵ����� double�� ����
		System.out.println("f1="+f1);
		
		float f2 = 3; // 자동형변환
		System.out.println("f2="+f2);
		
		// i
		// int i = 7.8; int < float 강제형변환
		int i = (int) 7.8;
		System.out.println("i="+i);
		
	}
}

/*
	실수형 자료형
	float  : 4byte -3.4E38 ~ +3.4E38
	double : 8byte -1.7E308 ~ +1.7E308
*/