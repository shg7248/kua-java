
public class Ex03_13_break_continue {
	public static void main(String[] args) {
		
		int i;
		for(i=1;i<=10;i++) {
			if(i==5) {
				break; // 반복문을 빠져나간다.
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		i=0;
		for(i=1;i<=10;i++) {
			if(i==5) {
				continue; // continue 이후의 작업은 스킵하고 바로 증감식으로 넘어간다.
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("====================");
		
		i=1;
		while(i<=10) {
			if(i==5)
				break; // 반복문을 빠져나간다.
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		
		i=1;
		while(i<=10) {
			i++;
			if(i==5)
				continue; // 조건식으로 간다.
			System.out.print(i + " ");
		}
	}
}
