import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11_04_FileStream {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
//			File file = new File("from.txt");
//			if(!file.exists()) {
//				file.createNewFile();
//			}
			
			fis = new FileInputStream("from.txt");
			// new FileNotFoundException()
			// C:\\Java_shg\\11_입출력\\from.txt
			// input : 읽어들이는데 쓰임
			
			fos = new FileOutputStream("to.txt");
			// 생성자의 두번째 인자 기본값은 false(덮어쓰기 X)
			// 해당 폴더가 없으면 FileNotFoundException이 발생한다.
			// 파일명만 있으면 자동으로 생성된다.
			
			int i;
			while(true) {
				// new IOException()
				i = fis.read();
				if(i == -1) {
					// 파일의 끝(EOF)을 읽으면 -1을 리턴함
					break;
				}
				else {
					fos.write(i);
				}
			} // while
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 연결 다리를 끊어야 프로그램이 안정적으로 종료된다.
				fos.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

// 스트림은 자료의 입출력을 도와주는 중간 매개체 역할을 한다.
// 입출력이 동시에 되지 않는다.
// IOException : close, read, write
// FileNotFoundException : 
