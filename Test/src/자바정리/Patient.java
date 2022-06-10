package 자바정리;

public class Patient extends Person {
	
	private String disease;
	
	Patient(int no, String name, int age, String disease) {
		super(no, name, age);
		this.disease = disease;
	}
	
	public String toString() {
		return super.toString() + ", " + disease;
	}
}
