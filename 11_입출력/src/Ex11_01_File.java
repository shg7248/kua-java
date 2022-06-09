import java.io.File;

public class Ex11_01_File {
	public static void main(String[] args) {
		
//		File f1 = new File("C:\\sun\\abc.txt");
//		File f1 = new File("C:/sun/abc.txt");
//		File f1 = new File("C:\\sun", "abc.txt");
		File f = new File("C:\\sun");
		File f1 = new File(f, "abc.txt");
		System.out.println(f1.length());
	}
}
