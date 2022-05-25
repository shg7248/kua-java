
public class Ex03_07_송학관2 {
	public static void main(String[] args) {
		
		int sum1=0;
		for(int i=0;i<10;i++) {
			for(int j=1+(i*10);j<=(i+1)*10;j++) {
				sum1+=j;
			}
			System.out.println("1~"+((i+1)*10)+"="+sum1);
		}	
		
		System.out.println();
		
		for(int i=0;i<10;i++) {
			int sum2=0;
			for(int j=1+i*10;j<=(i+1)*10;j++) {
				sum2+=j;
			}
			System.out.println((1+i*10)+"~"+((i+1)*10)+"="+sum2);
		}	
			
	}
}
