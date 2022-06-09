import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex11_09_송학관 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		BufferedReader vc = null;
		BufferedWriter bw = null;
		
		try {
			// 콘솔 입력
			br = new BufferedReader(new InputStreamReader(System.in));
			
			// 파일 출력
			bw = new BufferedWriter(new FileWriter("voca.txt", true));
			
			// 파일 입력
			vc = new BufferedReader(new FileReader("voca.txt"));
			
			boolean find = false;
			
			while(true) {
				
				System.out.println("1.단어입력 2.단어검색 3.종료");
				System.out.print(">>");
				int num = sc.nextInt();
				String str;
				
				switch(num) {
				case 1:
					System.out.print("단어/뜻 입력>>");
					str = br.readLine();
					bw.write(str);
					bw.newLine();
					bw.flush();
					break;
				case 2:
					System.out.print("검색 단어 입력>>");
					str = br.readLine();
					String i;
					find = false;
					while((i = vc.readLine()) != null) {
						String[] v = i.split("/");
						if(v[0].equals(str)) {
							System.out.print("단어>");
							System.out.println(v[0]);
							System.out.print("단어의 뜻>");
							System.out.println(v[1]);
							find = !find;
							break;
						}
					}
					if(!find)
						System.out.println("찾는 단어 없음");
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println("1~3만 입력 가능");	
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				vc.close();
				bw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

/*
1.단어입력 2.단어검색 3.종료
>>1
단어/뜻 입력>>hand/손
1.단어입력 2.단어검색 3.종료
>>1
단어/뜻 입력>>blue sky/푸른 하늘
1.단어입력 2.단어검색 3.종료
>>1
단어/뜻 입력>>snow/눈
1.단어입력 2.단어검색 3.종료
>>2
검색 단어 입력>>snow
단어>snow
단어의 뜻>눈
1.단어입력 2.단어검색 3.종료
>>2
검색 단어 입력>>blue sky
단어>blue sky
단어의 뜻>푸른 하늘
1.단어입력 2.단어검색 3.종료
>>2
검색 단어 입력>>school
찾는 단어 없음
1.단어입력 2.단어검색 3.종료
>>3
*/
