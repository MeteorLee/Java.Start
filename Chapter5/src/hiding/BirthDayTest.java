//public은 모든 클래스에서 쓸 수 있다.
//private은 자신의 클래스에서만 쓸 수있다.
//아무것도 쓰지않은 default는 같은 패키지안에서는 쓸 수 있다.
//
//

package hiding;

class BirthDay {
	
	private int day;
	private int month;
	private int year;
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if (month == 2) {
			if (day<1 || day > 28) {
				System.out.println("날짜 오류입니다.");
			}
		}
		else {
			this.day = day;
		}
//		오류를 대비하고 할 수 있다.
		
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}

public class BirthDayTest{
	
	public static void main(String[] args) {
		
		BirthDay day = new BirthDay();
//		day.month = 2;
//		day.year = 2017;
//		day.day = 30;
//		public이라면 바로 쓸 수 있으나 private면 안됨
		
		day.setMonth(2);
		day.setDay(30);
		day.setYear(2018);
		
		
	}
	
}