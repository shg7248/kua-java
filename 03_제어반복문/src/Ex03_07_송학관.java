
public class Ex03_07_송학관 {
	public static void main(String[] args) {
		
		// 1
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%5==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
		System.out.println();
		
		// 2
		int i;
		int sum1=0;
		for(i=1;i<=100;i++) {
			sum1+=i;
			if(i%10==0) {
				System.out.println("1~"+i+"="+sum1);
			}
		}
		
		System.out.println();
		
		// 3
		int j;
		int sum2=0;
		for(j=1;j<=100;j++) {
			sum2+=j;
			if(j%10==0) {
				System.out.println((j-9)+"~"+j+"="+sum2);
				sum2=0;
			}
		}
	}
}
