package thisEx;


class Birthday{
	int day;
	int month;
	int year;
	
	
	
	public void setYear(int year) {
		this.year = year;
		// year 과 int year이 같기에 구분을 위해 사용
	}
	public void printThis() {
		System.out.println(this); // 현자 자신의 인스턴스의 주소값
	}
}
public class ThisExample {

	public static void main(String[] args) {
		
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		
		b1.day = 13;
		b1.month = 3;
		b1.year = 2015;
		
		b2.day = 24;
		b2.month = 5;
		b2.year = 2018;
		
		b1.printThis();
		System.out.println(b1);
		b2.printThis();
		System.out.println(b2);
		
	}

}
