import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = 
				new FileInputStream(new File("C:\\Users\\admin\\Downloads\\Test05_송학관.java"));
		
		FileOutputStream fos = 
				new FileOutputStream("C:\\Users\\admin\\Downloads\\Test05.java");
	
		int i;
		while((i = fis.read()) != -1) {
			fos.write(i);
		}
		
		fis.close();
		fos.close();
	}
}
