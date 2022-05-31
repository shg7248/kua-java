
abstract class Empl {
	private String empno;
	private String name;
	private int pay;
	
	int getPay() {
		return this.pay;
	}
	
	public Empl(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	void print() {
		System.out.println(empno + ", " + name + ", " + pay);
	}
	
	abstract double getMontyPay();
	
} // Empl

class FullTime extends Empl { // 정규직
	private int bonus;
	FullTime(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}
	
	@Override
	double getMontyPay() {
		return (super.getPay()/(double)12) + (bonus/(double)12);
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(bonus);
	}
	
} // FullTime

class Contract extends Empl { // 계약직
	private int hireYear;
	Contract(String empno, String name, int pay, int hireYear) {
		super(empno, name, pay);
		this.hireYear = hireYear;
	}
	
	@Override
	double getMontyPay() {
		return super.getPay()/(double)12 * hireYear;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(hireYear);
	}
} // Contract

class PartTime extends Empl { // 일용직
	private int workDay;
	PartTime(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}
	
	@Override
	double getMontyPay() {
		return super.getPay() * workDay;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(workDay);
	}
} // PartTime

public class Ex06_11_송학관 {
	public static void main(String[] args) {
		
		PartTime p = new PartTime("P01", "제니", 30, 7);
		Contract c = new Contract("C02", "웬디", 200, 3);
		FullTime f = new FullTime("F03", "윤아", 400, 200);
		
		// FullTime : (pay/(double)12) + (bonus/(double)12)
		// Contract : pay/(double)12 * hireYear
		// PartTime : pay * workDay

		p.print();	// "P01", "제니", 30
		System.out.println(p.getMontyPay());
		c.print(); 	// "C02", "웬디", 200 
		System.out.println(c.getMontyPay());
		f.print(); 	// "F03", "윤아", 400
		System.out.println(f.getMontyPay());
		
		System.out.println("============");
		// 객체 배열로 출력
		Empl[] empl = {new PartTime("P01", "제니", 30, 7), new Contract("C02", "웬디", 200, 3), new FullTime("F03", "윤아", 400, 200)};
		for(Empl e : empl) {
			e.print();
			System.out.println(e.getMontyPay()+"\n");
		}
	} // main
}

// 상속받는 자식 클래스 매서드의 접근범위 :
// 
