import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex11_08_Buffer {
	public static void main(String[] args) {
		
		FileWriter fw = null;
		FileReader fr = null;
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			fw = new FileWriter("write2.txt");
			bw = new BufferedWriter(fw);
			
			bw.write("즐거운 자바수업~");
			bw.newLine();
			bw.write("재미있는 자바수업~");
			bw.newLine();
			bw.write("신나는 자바수업~");
			
			// 버퍼가 아직 채워지지 않았기 때문에 콘솔에 출력되지 않는다.
//			bw.close();
			
			fr = new FileReader("write2.txt");
			br = new BufferedReader(fr);
			
			// 한 줄을 읽어들이는 메서드 : readLine()
			// flush나 close를 하지 않았다면 텍스트 파일에 아무것도 없기 때문에
			// 콘솔에는 빈칸이 출력된다.
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			// 한 글자씩 읽어들이는 메서드 : read()
//			int i;
//			while((i = fr.read()) != -1) {
//				System.out.print((char)i);
//			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 2차 스트림을 닫으면 자동으로 1차 스트림도 닫힌다.
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
