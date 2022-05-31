
class Top1 {
	private int data;
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
} // Top1

class Top2<T> {
	
	private T data;
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}	
	
} // Top2
public class Ex09_01_Generic {
	public static void main(String[] args) {
		
		Top1 t1 = new Top1();
		t1.setData(100);
		int result = t1.getData();
		System.out.println("result : " + result);
		
		Top2<String> t2 = new Top2<String>();
		t2.setData("orange");
		System.out.println(t2.getData());
		
		Top2<Integer> t3 = new Top2<Integer>();
		t3.setData(new Integer(300)); // t3.setData(300)
		System.out.println(t3.getData());
	}
}

// Generic : 하나의 코드를 여러 타입에 대하여 재사용할 수 있도록 해주는 기술
