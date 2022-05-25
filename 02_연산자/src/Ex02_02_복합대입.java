
public class Ex02_02_복합대입 {
	public static void main(String[] args) {
	
		String aa = Integer.toBinaryString(10);
		String bb = Integer.toBinaryString(12);
		
		System.out.println(aa + " & " + bb + " = " + (10 & 12));
		System.out.println(Integer.parseInt("1000", 2));
		
		int a = 10, b = 20, c = 30, d = 40;
		System.out.println("a: " + a);
		
		// a = a + 3;
		a += 3;
		System.out.println("a: " + a);
		
		System.out.println("b: " + b);
		b -= 5;
		System.out.println("b: " + b);
		
		System.out.println("c: " + c);
		c *= 2;	// c = c * 2;
		System.out.println("c: " + c);
		
		System.out.println("d: " + d);
		d %= 6;
		System.out.println("d: " + d);
		
		String fruit = "apple";
		System.out.println("fruit : " + fruit);
		
		fruit += "banana";
		System.out.println("fruit : " + fruit);
	}
}
