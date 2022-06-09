import java.util.InputMismatchException;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[6];
		int[] comLotto = new int[6];
		
		// 내 로또
		for(int i = 0; i < lotto.length; i++) {
			
			int input = 0;
			
			try {
				System.out.print("숫자" + (i + 1) + ": ");
				input = sc.nextInt();
				if(input < 0 || input > 45) {
					throw new Exception();
				}
			}catch(InputMismatchException nfe) {
				System.out.println("유효하지 않은 값");
				i -= 1;
				continue;
			}catch(Exception e) {
				System.out.println("1~45사이의 수 입력하세요.");
				i -= 1;
				continue;
			}finally {
				sc.nextLine();
			}
			
			lotto[i] = input;
			
			for(int j = 0; j < i; j++) {
				if(lotto[j] == input) {
					System.out.println("중복됨");
					i -= 1;
					continue;
				}
			}
		}
		
		// 컴퓨터 로또
		for(int i = 0; i < comLotto.length; i++) {
			comLotto[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				if(comLotto[i] == comLotto[j]) {
					comLotto[i] = (int)(Math.random() * 45) + 1;
					j = -1;
				}
			}
		}
		
		System.out.println("컴이 발생시킨 로또 번호");
		for(int i : comLotto) {
			System.out.print(i + "\t");
		}		
		
		System.out.println();
		
		System.out.println("내가 선택한 로또 번호");
		for(int i : lotto) {
			System.out.print(i + "\t");
		}
		
		int count = 0;
		for(int l1 : comLotto) {
			for(int l2 : lotto) {
				if(l1 == l2) {
					count++;
				}
			}
		}
		
		System.out.println();
		System.out.println("맞은 갯수 : " + count);
		
		switch(count) {
		case 6:
			System.out.println("1등");
			break;
		case 5:
			System.out.println("3등");
			break;
		case 4:
			System.out.println("4등");
			break;
		case 3:
			System.out.println("5등");
			break;
		case 2:
		case 1:
		case 0:
			System.out.println("꽝!!");
		}
	}
}
