
public class Ex04_05_2차원 {
	public static void main(String[] args) {

		int[][] arr =
			{
				{80,72,63,83}, 
				{92,21},
				{99,49,59}
			};
		
		for(int[] x : arr) {
			for(int y : x) {
				System.out.print(y+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		int[][] arr = new int[][] 
//			{
//				{80,72,63,83}, 
//				{92,21},
//				{99,49,59}
//			};
		
//		int[][] arr = new int[3][4];
//		arr[0][0] = 80;
//		arr[1][1] = 21;
//		arr[2][0] = 99;
		
//		int[][] arr = new int[3][];
//		arr[0] = new int[4];
//		arr[1] = new int[2];
//		arr[2] = new int[3];
//		
//		arr[0][0] = 80;
//		arr[1][1] = 21;
//		arr[2][0] = 99;
		
		System.out.println("arr.length:"+arr.length);
		System.out.println("arr[0].length:"+arr[0].length);
		System.out.println("arr[1].length:"+arr[1].length);
		System.out.println("arr[2].length:"+arr[2].length);
	
		System.out.println("arr[0][0]:"+arr[0][0]);
		System.out.println("arr[0][1]:"+arr[0][1]);
		System.out.println("arr[1][0]:"+arr[1][0]);
		System.out.println("arr[2][0]:"+arr[2][0]);
		// System.out.println("arr[2][3]:"+arr[2][3]); 없는방이므로 에러 
		
		int i,j;
		System.out.println("\t0열\t1열\t2열\t3열");
		for(i=0;i<arr.length;i++) {
			System.out.print(i+"행\t");
			for(j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
			
			
	}
}
