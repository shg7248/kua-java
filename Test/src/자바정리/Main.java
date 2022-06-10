package 자바정리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> lists = new ArrayList<Person>();
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int age, no;
		String name;
		boolean find;
		
		try {
			while(true) {
				System.out.print("1.의사 2.환자\t번호선택>>");
				int num = Integer.valueOf(br.readLine());
				
				switch(num) {
				case 1:
					System.out.print("이름입력:");
					name = br.readLine();
					System.out.print("나이입력:");
					age = Integer.valueOf(br.readLine());
					System.out.print("병원명입력:");
					String hospital = br.readLine();
					System.out.print("진료과목입력:");
					String subject = br.readLine();
					
					lists.add(new Doctor(1, name, age, hospital, subject));
					break;
				case 2:
					System.out.print("이름입력:");
					name = br.readLine();
					System.out.print("나이입력:");
					age = Integer.valueOf(br.readLine());
					System.out.print("질병명입력:");
					String disease = br.readLine();
					lists.add(new Patient(2, name, age, disease));
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");	
				} // switch
				System.out.print("계속?");
				String yn = br.readLine();
				if(yn.equals("n"))
					break;
			}
			
			System.out.println("ArrayList 사용한 결과");
			for(int i = 0; i < lists.size(); i++) {
				System.out.println(i + ":" + lists.get(i));
			}
			
			System.out.print("검색할 번호입력(1.의사 2.환자) >>");
			no = Integer.valueOf(br.readLine());
			
			System.out.print("검색할 이름입력 >>");
			name = br.readLine();
			
			find = true;
			for(Person person : lists) {
				if(person.getNo() == no && person.getName().equals(name)) {
					System.out.println(person);
					find = !find;
				}
			}
			
			if(!find) {
				System.out.println("찾는 데이터가 없음");
			}
			
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
