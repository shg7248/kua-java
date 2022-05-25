
public class Ex03_05_for {
	public static void main(String[] args) {
		int i;
		for(i=10;i>=1;i-=3) {
			System.out.println("java"+i);
			System.out.println("하하하");
		}
		
		System.out.println("for문 밖 : " + i);
		
		System.out.println();
		
		int sum = 0;
		for(i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("1~10까지의 합 : " + sum);
	}
}

/*
 * 		for(초기식; 조건식; 증감식){
 * 			반복할 문장;
 * 		}
 * 
 * 		1. 초기식
 * 		2. 조건식
 * 		3. 조건식이 참이라면 {} 안으로 들어가서 일처리
 * 		4. 증감식
 * 		5. 2로 돌아가서 반복
 * 		6. 조건식이 거짓이라면 빠져나옴
 * 
 */
