
public class Ex01_출력문{
	public static void main(String[] args) {
		System.out.println("�����ٶ�"); // �ּ���(����) : �� ��ɾ�� consoleâ�� ����ϴ� ��ɾ�
		System.out.print("a");
		System.out.println('b');
		
		// 	\t 		: tab
		//	\n 		: enter
		//	\"\" 	: escape sequence
		System.out.println("�ȳ�\t�ϼ���\n\n�����̸���\"ȫ�浿\"�Դϴ�.");
		System.out.println("1+2");
		System.out.println(1+2);
		System.out.println(10);
		
		// ""	: ���ڿ�
		// ''	: ����, ���ڻ��
		
		// ���ڿ� + ���ڿ� 	���ڿ� ����
		System.out.println("��ſ�" + "�ڹ�" + "����");
		System.out.println("1" + "2");
		
		/*
		 *	������ �ּ�
		 */
		
		int a = 123;
		char b = 'A';
		double c = 98.765;
		String d = "아이유";
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		
		/*
		 * 	서식문자
		 * 	정수 		: %d
		 *  실수 		: %f
		 *  문자 		: %c
		 *  문자열 	: %s
		 */
		System.out.printf("a:%d\n", a);
		System.out.printf("b:%c\n", b);
		System.out.printf("c:%f\n", c);
		System.out.printf("d:%s\n", d);
		
		System.out.printf("c:%7.2f\n", c); // 소숫점 2째자리 까지 7칸을 꽉 채운다.
		System.out.printf("저의 이름은:%5s입니다\n", d);
		
		// 소스코드 -> (JDK로 컴파일) -> 바이트코드 -> (JRE로 클래스화일 로딩과 실행) -> 실행화일
		
		// 커맨드 창에서 실행방법
		// cd C:\Java_shg\01_자료형과 기본입출력\src
		// javac Ex01_출력문.java (컴파일 : 컴퓨터가 알아볼 수 있도록 기계어로 만들어줌)
		// java Ex01_출력문 (실행)
	}
}
// ; 세미콜론
// : 콜론
