import java.io.File;

public class Ex11_02_File {
	public static void main(String[] args) {
		
		File win = new File("C:\\Windows\\");
		System.out.println("win : " + win);
		String result = win.isDirectory() ? "폴더" : "파일";
		System.out.println("result : " + result);
		
		String result2 = win.isFile() ? "파일" : "폴더";
		System.out.println("result2 : " + result2);
	
		String[] lists = win.list();
		System.out.println("lists : " + lists.length);
		
		for(int i = 0; i < lists.length; i++) {
			File f = new File(win, lists[i]);
			if(f.isFile()) {
				System.out.println("파일 : " + lists[i]);
			}
			else {
				System.out.println("폴더 : " + lists[i]);
			}
		}
	}
}
