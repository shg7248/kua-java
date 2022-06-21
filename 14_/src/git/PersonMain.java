package git;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
    
    // static인 init 메서드에서 호출하기 떄문에 static 을 붙여준다.
    
    public static final int SELECT_ALL = 1;
    public static final int SELECT_BY_GENDER = 2;
    public static final int UPDATE_PERSON = 3;
    public static final int DELETE_PERSON = 4;
    public static final int ADD_PERSON = 5;
    public static final int PROGRAM_EXIT = 6;

    static Scanner sc = new Scanner(System.in);

    // Dao(Data Access Objects)
    // DB를 사용해 데이터를 조회하거나 조작을 전담하는 오브젝트
    // DB와의 연결을 담당한다.
    // 저장소 (테이블) 에 데이터를 입력, 조회, 수정, 삭제 등의 처리를 담당한다.
    static PersonDao pdao = new PersonDao();

    // DTO(Data Transfer Object)
    // 데이터의 전달을 위해 만들어진 오브젝트
    // 데이터를 담을 private 변수와 그 변수를 조작할 수 있는 getter, setter 메서드로 구성한다.
    // bean 또는 VO(Value Object)라고도 한다.
    // 아래 정의된 ArrayList는 이 DTO를 담을 컬렉션 이다.
    static ArrayList<PersonDao> beans = null;

    public static void main(String[] args) {
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
                case SELECT_ALL:
                    getAllPerson();
                    break;
                case SELECT_BY_GENDER:
                    getPersonByGender();
                    break;
                case UPDATE_PERSON:
                    updatePerson();
                    break;
                case DELETE_PERSON:
                    deleteData();
                    break;
                case ADD_PERSON:
                    insertData();
                    break;
                case PROGRAM_EXIT:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("1 ~ 6까지 숫자만 입력이 가능합니다.");
            }
        }

    } // init
    
    // 모든 인월들 조회
    public static void getAllPerson() {
        System.out.println("getAllPerson");
        ArrayList<PersonBean> beans = pdao.getAllPerson();

        for(PersonBean bean : beans) {
            System.out.println(bean);
        }
    }

    // 특정 성별의 인원들 조회
    public static void getPersonByGender() {
        System.out.println("getPersonByGender");
    }

    // 특정 인원의 신상정보 수정
    public static void updatePerson() {
        System.out.println("updatePerson");
    }

    // 특정 인원의 신상정보 삭제
    public static void deleteData() {
        System.out.println("deleteData");
    }

    // 인원 추가
    public static void insertData() {
        System.out.println("insertData");
    }
}
