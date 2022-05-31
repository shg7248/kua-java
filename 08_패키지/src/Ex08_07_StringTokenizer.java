import java.util.StringTokenizer;

public class Ex08_07_StringTokenizer {
	public static void main(String[] args) {
		
		StringTokenizer stn = new StringTokenizer("2022/05 31,10:43", ",/");
		// 기본 구분자는 공백이다.
		
		int count = stn.countTokens();
		System.out.println("파싱한 갯수 : " + count);
		
		while(stn.hasMoreTokens()) {
			String s = stn.nextToken();
			System.out.println("s: " + s);
		}
		System.out.println();
		
		String stn2 = "2022/05/31,10:43";
		String[] sp = stn2.split("/");
		
		System.out.println(sp.length);
		for(String str : sp) {
			System.out.println(str);
		}
		
//		stn.asIterator();
//		
//		while(stn.hasMoreElements()) {
//			System.out.println(stn.nextToken());
//		}
		
	}
}

