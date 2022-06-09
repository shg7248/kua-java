import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataInOutTest {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = 
				new FileOutputStream("C:\\Users\\admin\\Downloads\\Test05.java");
		DataOutputStream dos =
				new DataOutputStream(fos);
		
		dos.writeInt(100);
		dos.writeChars("ssdfsdfsdf");
		
	}
}
