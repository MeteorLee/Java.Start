// 클래스를 구동
// 클래스를 생성

//클래스를 사용하기 위해서는 클래스를 생성해야함
//new 예약어를 이용하여 클래스를 생성
//
//클래스형 변수이름 = new 생성자();
//
//Student studentA = new Student();


package constructor;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "이순신");
//		studentLee.studentName = "이순신";  생성자 부분에서 정의 되기에 주석처리
		studentLee.adddress = "서울시 서초구 서초동";
//		studentLee.studentID = 100;
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.adddress = "미국 산호세";
		// Student 부분의 default 생성자 덕분에 오류가 나지않음
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		
	}

}
