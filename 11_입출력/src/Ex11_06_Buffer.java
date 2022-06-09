import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11_06_Buffer {
	public static void main(String[] args) {
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			// 파일과 연결되는 직접적인 스트림 형성 (1차 스트림)
			FileOutputStream fos = new FileOutputStream("data.txt");
			
			// 잘 쓰기위한 보조적인 역할 (2차 스트림)
			// 중간에 버퍼를 만들어서 모아놓았다가 한번에 처리함
			// 크기가 5
			// 퍼버의 크기를 지정해주지 않면 기본적으로 8192byte로 지정된다.
			bos = new BufferedOutputStream(fos, 5);
			
			// 크기(5)만큼 차게되면 버퍼를 비움
			// 1~5까지 보내고 버퍼에 6에서 10까지 다시 5개가 차게 되는데 
			// 이후에 더 이상 들어오려는 데이터가 없기 때문에 버퍼 안에 그대로 6~10까지 남겨져 있음
			// 아스키코드 값으로 처리되기 때문에 이상한 문자들이 써짐
			for(int i = 1; i <= 10; i++) {
				bos.write(i);
			}
			
			bis = new BufferedInputStream(new FileInputStream("data.txt"), 5);
			int j;
			while((j = bis.read()) != -1) {
				System.out.print(j + " ");
			}
			
			// close가 되기 전에도 버퍼에 남겨진 데이터들을 내보낼 수 있음
			bos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
//		finally {
//			try {
//				// 2차 스트림만 닫으면 됨
//				// 끊어내는 순간 버퍼에 남겨진 데이터들이 모두 내보내져 텍스트에 출력된다
//				bos.close();
//				bis.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
	}
}

//buffer : 임시기억 장소
