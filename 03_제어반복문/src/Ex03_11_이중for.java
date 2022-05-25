
public class Ex03_11_이중for {
	public static void main(String[] args) {
		
		int i, j;
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(i=0;i<5;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				System.out.print(j>=i?"*":" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(i=4;i>=0;i--) {
			for(j=0;j<5;j++) {
				System.out.print(j>=i?"*":" ");
			}
			System.out.println();
		}		
		
		
		
	}
}

//   *
//  ***
// *****
//  *** 
//   *
