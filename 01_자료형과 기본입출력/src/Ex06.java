import java.text.DecimalFormat;

public class Ex06 {
	public static void main(String[] args) {
		
		int a = 123;
		float b = 1.987f;
		String c = "홍길동";
		char d = 'X';
		
		System.out.println("a="+a);
		System.out.printf("b=%.2f\n", b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		DecimalFormat df = new DecimalFormat("###.##");
		String dd = df.format(134343434343431.987f);
		System.out.println(dd);
		
				
		
	}
}
