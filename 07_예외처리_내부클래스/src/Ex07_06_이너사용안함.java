
class CarName {
	String model;
	int year;
	CarName(String model, int year) {
		this.model = model;
		this.year = year;
	}
}

class Car {
	CarName name;
	String color;

	Car(String model, int year,String color) {
		this.name = new CarName(model,year);
		this.color = color;
	}

	void OutInfo() {
		System.out.printf("�� = %s, ��� = %d, ���� = %s\n",
				name.model, name.year, color);
	}
}

public class Ex07_06_이너사용안함 {
	public static void main(String[] args) {
		
		CarName sonata = new CarName("�ҳ�Ÿ", 2009);
		System.out.printf("�� = %s, ��� = %d\n", sonata.model, sonata.year);
		
		Car pride = new Car("�����̵�", 2015, "�Ķ�");
		pride.OutInfo();
		
	}
}
