
public class Ex05_08_재귀호출 {
	public static void main(String[] args) throws Exception { // 정의
		
		show(3);
		
	}

	static void show(int cnt) {
		System.out.println("Hi~" + cnt);
		if(cnt == 1) return;
		
		// 내가 나를 호출함
		show(--cnt);
	}
}