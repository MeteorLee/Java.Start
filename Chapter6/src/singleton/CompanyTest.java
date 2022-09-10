package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
//		Company company = new Company();
		
//		Company company2 = new Company();
//		company를 2개이상 못만들게 하기

		Company c1 =Company.getInstance();
	
		Company c2 =Company.getInstance();
	
		
		System.out.println(c1);
		System.out.println(c2);
		// 동일한 값을 가짐 즉 동일한 인스턴스임
		
		Calendar cal = Calendar.getInstance();
		
		
		
	}

}
