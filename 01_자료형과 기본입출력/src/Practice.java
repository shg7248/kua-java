
public class Practice {
	public static void main(String[] args) {
		
		String name = "송";
		byte[] bytes = name.getBytes();
		StringBuffer sb = new StringBuffer();
		
		for(byte b : bytes) {
			String binary = Integer.toBinaryString(b & 0xff);
			if(binary.indexOf("1110") == 0) {
				sb.append(binary.substring(4));
			} else {
				sb.append(binary.substring(2));
			}
		}
		
		String first = sb.toString().substring(0, 8);
		String second = sb.toString().substring(8);
		
		System.out.println(Integer.parseInt(first, 2));
		System.out.println(Integer.parseInt(second, 2));
		
		
		
	}
}
