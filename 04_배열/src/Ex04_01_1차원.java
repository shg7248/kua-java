
public class Ex04_01_1차원 {
	public static void main(String[] args) {
		
//		배열 : 같은 타입의 데이터를 한 묶음으로 묶어서 관리하는 것
		
//		int[] a = {10, 20, 30, 40, 50};
//		int[] a = new int[] {10, 20, 30, 40, 50};
		int[] a = new int[5];
		
		// 바꿀수는 있지만 새로 추가할 수는 없다.
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println(a);
		System.out.println(a.length);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		// System.out.println(a[5]);
		System.out.println("-----------");
		int i;
		for(i=0;i<=4;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("============");
		
		// 확장 for 문
		for(int x : a) { // for(하나만 담을 수 있는 변수 : 반복대상)
			System.out.println(x);
		}
		
		System.out.println("************");
		
//		float[] f = {1.1f, 2.2f, 3.3f};
//		float[] f = new float[] {1.1f, 2.2f, 3.3f};
		float[] f = new float[3];
		f[0] = 1.1f; // 1.1 = b[0] X
		f[1] = 2;
		f[2] = 3.3f;
		
		System.out.println(f);
		for(int j=0; j<f.length; j++)
			System.out.println(f[j]); // 1.1, 2.0, 3.3
		
		System.out.println();
		
		for(float f2 : f) {
			System.out.println(f2);
		}
	}
}
