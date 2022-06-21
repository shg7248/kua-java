import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	
	static Scanner sc = new Scanner(System.in);
	// static을 붙이는 이유 :
	// init 이라는 static 메서드에서 호출했기 때문에
	
	static PersonDao pdao = new PersonDao();
	
	static ArrayList<PersonBean> beans = null;
	
	public static void main(String[] args) {
		
		// static에서 호출하기 때문에
		// 메서드에 static을 붙인다.
		init();
		
	}
	
	static void init() {
		
		while(true) {
			System.out.println("===메뉴 선택하기===");
			System.out.println("1. 전체 정보 조회");
			System.out.println("2. 성별로 조회");
			System.out.println("3. 정보수정");
			System.out.println("4. 정보삭제");
			System.out.println("5. 정보추가");
			System.out.println("6. 프로그램 종료");
			System.out.print(">> 메뉴 번호 입력 : ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				beans = pdao.getAllPerson();
				
				// 확장 for 문
				for(PersonBean bean : beans) {
					System.out.println(bean);
				}
				
				// 일반 for 문
//				for(int i = 0; i < beans.size(); i++) {
//					System.out.println(beans.get(i));
//				}
				break;
			case 2:
				beans = getPersonByGender();
				
				for(PersonBean bean : beans) {
					System.out.println(bean);
				}
				break;
			case 3:
				updatePerson();
				break;
			case 4:
				deleteData();
				break;
			case 5:
				insertData();
				System.out.println();
				
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("1 ~ 6까지 숫자만 입력할 수 있습니다.");
			}
		}
	} // init

	private static ArrayList<PersonBean> getPersonByGender() {
		String gender;
		System.out.print("검색할 성별 입력 : ");
		gender = sc.next();
		return pdao.getPersonByGender(gender);
	}
	
	private static void insertData() {
		
		PersonBean bean = new PersonBean();
		
		System.out.println("번호는 시퀀스로 입력됩니다.");
		
		System.out.print("이름입력 >> ");
		String name = sc.next();
		
		System.out.print("나이입력 >> ");
		int age = sc.nextInt();
		
		System.out.print("성별입력 >> ");
		String gender = sc.next();
		
		System.out.print("생일 >> ");
		String birth = sc.next();
		
		bean.setName(name);
		bean.setAge(age);
		bean.setGender(gender);
		bean.setBirth(birth);
		
		int result = pdao.insertPerson(bean);
		System.out.println(result);
	}
	
	private static void updatePerson() {
		
		PersonBean bean = new PersonBean();
		
		System.out.print("번호입력 >> ");
		int num = sc.nextInt();
		
		System.out.print("이름입력 >> ");
		String name = sc.next();
		
		System.out.print("나이입력 >> ");
		int age = sc.nextInt();
		
		System.out.print("성별입력 >> ");
		String gender = sc.next();
		
		System.out.print("생일 >> ");
		String birth = sc.next();
		
		bean.setNum(num);
		bean.setName(name);
		bean.setAge(age);
		bean.setGender(gender);
		bean.setBirth(birth);
		
		pdao.updatePerson(bean);
	}
	
	private static void deleteData() {
		System.out.print("삭제할 번호 입력 >> ");
		int num = sc.nextInt();
		
		pdao.deletePerson(num);
	}
}
