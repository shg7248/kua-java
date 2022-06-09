import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class PrintStreamTest {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("172.30.1.17", 10000);
		
		while(true) {
			Thread.sleep(1000);
			OutputStream stream = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(stream);
			PrintWriter pw = new PrintWriter(osw, true);
			pw.print("dfsdfsdfsdfs");
		}
	}
}
