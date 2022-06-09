import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11_07_InputStreamReader {
	public static void main(String[] args) {
		
		// 키보드 -> 표준 입력 스트림
		
//		InputStream is = System.in;
		
		// 2byte도 입력 받을 수 있도록 만들어 줌
//		InputStreamReader isr = new InputStreamReader(is);
		
		// 버퍼를 통해서 좀 더 빠르게 읽어올 수 있음
//		BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br 
			= new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String str = br.readLine();
			
			//Scanner은 공백부분을 읽지 못함
			System.out.println("str : " + str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
