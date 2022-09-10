// 클래스를 구동
// 클래스를 생성

//클래스를 사용하기 위해서는 클래스를 생성해야함
//new 예약어를 이용하여 클래스를 생성
//
//클래스형 변수이름 = new 생성자();
//
//Student studentA = new Student();


package classprt;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.adddress = "서울시 서초구 서초동";
		
		studentLee.showStudentInfo();
		
	}

}
