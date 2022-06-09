import java.io.File;
import java.io.IOException;

public class Ex11_03_File {
	public static void main(String[] args) {
		
		File f1 = new File("A"); // 확장자가 없으면 폴더
		File f2 = new File("B"); // "B" : C:\\Java_shg\\11_입출력\\B
		File f3 = new File("C");
		File f4 = new File(f1, "ab.txt");
		
		if(f1.exists()) {
			System.out.println("존재함");
			f1.renameTo(f2);
		}
		else {
			System.out.println("존재안함");
			f1.mkdir();
			try {
				f4.createNewFile(); // IOException은 RuntimeException을 상속받지 않았기 때문에 무조건 예외처리를 해줘야 한다.
				System.out.println("파일 생성함");
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(f3.exists()) {
				if(f3.delete()) {
					System.out.println("파일 삭제함");
				}
			}
			else {
				System.out.println("존재하지 않음");
			}
		}
	}
}

// File 객체는 입출력이 불가능하다.
