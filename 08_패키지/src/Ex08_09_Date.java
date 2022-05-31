import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex08_09_Date {
	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		
		System.out.println(now.getMonth() + 1 + "월");
		System.out.println(now.getDate() + "일");
		
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(week[now.getDay()] + "요일");
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-d, hh:mm:ss");
		System.out.println(sdf1.format(now));
		
		// E : 요일, a : 오전/오후
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 d일 E요일 a hh시 mm분 ss초");
		System.out.println(sdf2.format(now));
	}
}

