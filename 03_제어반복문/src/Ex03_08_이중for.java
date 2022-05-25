
public class Ex03_08_이중for {
	public static void main(String[] args) {
		
		int i, j;
		for(i=1;i<=3;i++) {
			for(j=6;j<=7;j++) {
				System.out.println(i+","+j);
			}
			System.out.println("---------------");
		} // 안쪽for
		System.out.println("**************");
		
	} // 바깥쪽for
}

/*
 *		for(){
 *			for(){
 *
 *			} // 안쪽for
 *		} // 바깥쪽for
 */
