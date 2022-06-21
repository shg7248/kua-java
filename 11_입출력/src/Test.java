import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
//		String str = "즐";
//		byte[] bytes = str.getBytes();
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i = 0; i < bytes.length; i++) {
//			String binary = Integer.toBinaryString(bytes[i] & 0xff);
//			if(i == 0) {
//				sb.append(binary.substring(4, binary.length()));
//			}
//			else {
//				sb.append(binary.substring(2));
//			}
//		}
//		
//		System.out.println(sb.toString());
//		System.out.println(Integer.parseInt(sb.toString(), 2));
//		
//		toHex("1100");
//		toHex("1001");
//		toHex("1001");
//		toHex("0000");
//		
//		System.out.println(new String("\uc990"));
		
//		try {
//			ServerSocket server = new ServerSocket(10000);
//			Socket socket = server.accept();
//			System.out.println(socket);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		int[] arr = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		int[] copy = Arrays.copyOf(arr, 8);
		for(int a : copy) {
			System.out.println(a);
		}
		System.out.println(copy);
		System.out.println(arr);
		

		
	}
	
//	static void toHex(String binary) {
//		
//		int result = Integer.parseInt(binary, 2);
//		System.out.println(Integer.toHexString(result));
//	}
}
