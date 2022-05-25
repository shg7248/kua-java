
public class Ex02_정수형 {
	public static void main(String[] args) {
		System.out.println(1+2);
		
		int a;	// a����(����)�� ���� ��� �뵵�� ����Ѵ�.
		int b;	// ����
		a=1;	// �ʱ�ȭ
		b=2;	
		int c=3;	// ���� �ʱ�ȭ
		
		System.out.println(a+b);
		System.out.println("a+b");
		System.out.println("a"+"b");
		System.out.println(1313131131313131313L);
		
		byte b1=10;
		byte b2=20;
		int b3;		// byte b3�� �Ʒ� ���꿡�� ������ �߻��Ѵ�.
		b3 = b1+b2;	// 30
		System.out.println("b3="+b3);
		
		int x = 1000000;
		int y = 2000000;
		long z = (long) x * y; // 2�� 8byte * 4byte
		System.out.println("z="+z);
		
	}
}

/*
 * ���ϸ� �����ϴ� ��� :
 * 1. �����̸� ��Ŭ�� - Refactor - Rename���� �̸� ����
 * 2. �����̸� Ŭ�� - F2Ű - �̸� ����
 * 
 * ����Ű
 * ���� : ctrl + c
 * �ٿ��ֱ� : ctrl + v
 * ���� ���ÿ� : ctrl + alt + ����Ű
 * ���� ���� : ctrl + d
 * 
 * ������ �ڷ��� (type)
 * byte : 1byte -128 ~ 127
 * short : 2byte -32,768 ~ 32,767
 * int : 4byte -21�� ~ 21�� (���� ���� ���ȴ�.)
 * long : 8byte
 * 
 * int���� ���� �����͸� �����ϸ� ����� int�� �ȴ�.
 */