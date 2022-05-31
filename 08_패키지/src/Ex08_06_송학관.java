
public class Ex08_06_송학관 {
	public static void main(String[] args) {
		
//		double d = Math.random(); // �Ǽ�
//		System.out.println(d);
		
		//1~45 ���� ���� 
		
//		int d = (int)(Math.random() * 45) + 1;
//		System.out.println(d);
		
		int[] lotto = new int[6];
		int i,j;
		for(i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random() * 11) + 1; // 1~11
			
			for(j=0;j<i;j++) {
				if(lotto[i] == lotto[j]) {
					lotto[i] = (int)(Math.random()*11)+1;
					j=-1;
				}
			}//
		}//
		
		System.out.println("�� �߻���Ų �ζ� ��ȣ");
		for(i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
	}
}
/*
숫자1: 12
숫자2: 12
중복됨숫자2: 3
숫자3: 3
중복됨숫자3: 11
숫자4: 71
1~45사이의 수 입력하세요.
숫자4: q
유효하지 않은 값
숫자4: 12
중복됨숫자4: 7
숫자5: 5
숫자6: 33

컴이 발생시킨 로또 번호
21 41 39 37 2 27 

내가 선택한 로또 번호
12 3 11 7 5 33 

맞은 갯수 : 0
꽝!!
*/

