import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Song {

	static class SongThread implements Runnable {

		Socket s = null;
		OutputStream os = null;
		BufferedWriter bw = null;
		
		public SongThread() throws Exception {
			s = new Socket("localhost", 10000);
			os = s.getOutputStream();
			bw = new BufferedWriter(new OutputStreamWriter(os));
		}
		
		@Override
		public void run() {
			for(int i = 0; i < 100; i++) {
				try {
					bw.write("안녕하세요");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void main(String[] args) throws Exception{
		Thread thread = new Thread(new SongThread());
		thread.start();
	}
}


