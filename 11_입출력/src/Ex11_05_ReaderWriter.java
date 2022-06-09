import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex11_05_ReaderWriter {
	public static void main(String[] args) {
		
		// FileOutputStream, FileInputStream
		
		FileWriter fw = null;
		FileReader fr = null;
		
		try {
			fw = new FileWriter("write.txt");
			fw.write("즐거운 자바수업~");
			
			// 문자를 출력할때는 중간에 close를 해줘야 함
			// close를 하면 그 스트림을 다시 이용하여 파일에 쓰는 것이 불가능
			fw.close();
			
			fr = new FileReader("write.txt");
			int i;
			while((i = fr.read()) != -1) {
				System.out.println(i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
