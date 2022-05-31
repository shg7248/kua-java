import java.util.Arrays;

public class Ex08_05_Wrapper extends Object {
	public static void main(String[] args) {

		int a = 10;
		Integer it1 = new Integer(11);
		Integer it2 = new Integer(22);
		System.out.println(it1 + it2);
		
		Integer it3 = 11;// 11=>new Integer(11) autoboxing
		Integer it4 = 22;
		System.out.println(it3 + it4);
		
		int it5 = new Integer(11); // new Integer(11) => 11
		
		double b = 1.1;
		Double d1 = new Double(1.1);
		
		String str1 = "100";
		System.out.println(str1.hashCode() - 48525);
		String str2 = "101";
		System.out.println(str2.hashCode() - 48525);
		
		int x = Integer.parseInt("100");
		int y = Integer.parseInt("200");
		System.out.println(x + y); // 300
		
		Integer t = Integer.valueOf("100");
		Integer u = Integer.valueOf("200");
		System.out.println(t + u);
		
		double z = Double.parseDouble("1.1");
		System.out.println("z : " + z);
		
		int[] arr = {10, 20, 30, 40, 50};
		int sum1 = 0;
		
		for(int i : arr) {
			sum1 += i;
		}
		System.out.println("합 : " + sum1);
		
		String[] arr2 = {"10", "20", "30", "40", "50"};
		int sum2 = 0;
		
		for(String i : arr2) {
			sum2 += Integer.valueOf(i);
		}	
		System.out.println("합 : " + sum2);
		
		String[] arr3 = {"슬기:80", "크리스탈:90", "아이유:40"};
		int sum3 = 0;
		
		for(String str : arr3) {
			int index = str.indexOf(":");
			sum3 += Integer.valueOf(str.substring(index + 1));
		}
		
		System.out.println("합 : " + sum3);
		
		System.out.println(Character.digit('3', 5));
	}
}

/*
 * Wrapper 클래스 : 기본 데이터를 객체로 만들어야만 하는 경우
 * int => Integer
 * double => Double
 * char, boolean, byte, short, long, float
 * 
 * 
 * 
 * 
 */
