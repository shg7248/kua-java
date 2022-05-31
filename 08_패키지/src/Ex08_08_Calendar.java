import java.util.Calendar;

public class Ex08_08_Calendar {
	public static void main(String[] args) {
		
		// Calendar의 매개변수가 없는 생성자는 접근제어자가 protected이기 때문에 생성자들 통해 객체를 생성하려면 같은 패키지거나 상속관계여야지만 가능하다.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		int i = cal.get(Calendar.YEAR);
		System.out.println(i+"년");
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH) + "월");
		System.out.println(cal.get(Calendar.DATE) + "일");
		
		System.out.println(cal.get(Calendar.HOUR) + "시");
		System.out.println(cal.get(Calendar.MINUTE) + "븐");
		System.out.println(cal.get(Calendar.SECOND) + "." + cal.get(Calendar.MILLISECOND) + "초");
		
		int ampm = cal.get(Calendar.AM_PM);
		
		if(ampm == Calendar.AM) {
			System.out.println("AM");
		}
		else {
			System.out.println("PM");
		}
		
		String[] week = {"", "일", "월", "화", "수", "목", "금", "토"};
		System.out.println(week[cal.get(Calendar.DAY_OF_WEEK)] + "요일");
	}
}

