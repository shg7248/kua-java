import java.io.BufferedInputStream;

public class BufferedTest {
	public static void main(String[] args) throws Exception {
		
		BufferedInputStream bis =
				new BufferedInputStream(System.in);
		
		int i = bis.read();
		System.out.println(i);
	}
}
