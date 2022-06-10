
public class Calc {
	public static void main(String[] args) {
		
		double t1 = System.currentTimeMillis();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		double t2 = System.currentTimeMillis();
		System.out.println((int)((t2-t1) / 1000));
	}
}
