package 자바정리;

public class Doctor extends Person{
	
	private String hospital;
	private String subject;
	
	Doctor(int no, String name, int age, String hospital, String subject) {
		super(no, name, age);
		this.hospital = hospital;
		this.subject = subject;
	}
	
	public String toString() {
		return super.toString() + ", " + hospital + ", " + subject;
	}
}
