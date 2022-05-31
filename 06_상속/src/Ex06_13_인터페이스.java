
interface Camera {
	void takePhoto();
}

interface Music {
	void playMusic();
}


interface DBM {
	void viewTv();
}

class Shape2 {
	private int size;
	private String color;
	
	Shape2(int size, String color) {
		this.size = size;
		this.color = color;
	}
	
	void setSize(int size) {
		this.size = size;
	}
	
	int getSize() {
		return this.size;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	String getColor() {
		return this.color;
	}
}

class Phone extends Shape2 implements Camera, Music {
	
	Phone(int size, String color) {
		super(size, color);
	}
	
	@Override
	public void takePhoto() {
		System.out.println("사진찍기");
	}
	
	@Override
	public void playMusic() {
		System.out.println("음악감상");
	}
	
}

public class Ex06_13_인터페이스 {
	public static void main(String[] args) {

		Phone p = new Phone(7, "blue");
		System.out.println(p.getSize());
		System.out.println(p.getColor());
		p.playMusic();
		p.takePhoto();
	}
}
