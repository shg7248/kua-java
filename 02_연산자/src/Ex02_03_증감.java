
public class Ex02_03_증감 {
	public static void main(String[] args) {
	
		int a = 5, b = 5, aa, bb;
		aa = --a;
		
		// ++a : 먼저
		// a++ : 나중에
		
		System.out.println("a:"+a);
		System.out.println("aa:"+aa);
		
		bb = b--;
		
		System.out.println("b:"+b);
		System.out.println("bb:"+bb);
		
		int x = 5;
		System.out.println("x:"+x);
		++x; // 단독으로 쓰일 경우 ++이 앞에 있으나 뒤에 있으나 같다
		System.out.println("x:"+x);
		
		int i = 10;
		System.out.println(i);		// 10
		System.out.println(i--);	// 10
		System.out.println(--i);	// 8
		System.out.println(--i);	// 7
		System.out.println(i--);	// 7
		System.out.println(i);		// 6
		
	}
}
