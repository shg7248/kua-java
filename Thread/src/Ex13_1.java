import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.PrintStream;

import javax.xml.crypto.Data;

public class Ex13_1 {
	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\admin\\Downloads\\Test05_송학관.java"));
		
		int i = fis.read();
		
		PrintStream ps = new PrintStream("C:\\Users\\admin\\Desktop\\ttt.txt", "utf-8");
		ps.write('0');
		
		System.out.println("1");
		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\admin\\Desktop\\object.txt"));
		
		int b;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		while((b = fis.read() ) != -1) {
			baos.write(b);
		}
		
		byte[] bs = baos.toByteArray();
		System.out.printf("%.2f", bs.length / 1024f);
		
		System.out.println();
		
		byte[] bf = {'a', 'b', 'c', 'd'};
		ByteArrayInputStream bais = new ByteArrayInputStream(bf);
		
	}
	
	class Student {
		String name;
		int age;
		
		public Student(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}
}
