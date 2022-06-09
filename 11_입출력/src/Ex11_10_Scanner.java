import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex11_10_Scanner {
	public static void main(String[] args) {
		
		File f = new File("test.txt");
		
		try {
			Scanner sc = new Scanner(f);
			sc.useDelimiter(",");
			
			int num, sum = 0, count = 0;
			while(sc.hasNextInt()) {
				num = sc.nextInt();
				System.out.println(num);
				sum += num;
				count++;
			}
			System.out.println("sum = " + sum);
			System.out.println("avg = " + sum / count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
