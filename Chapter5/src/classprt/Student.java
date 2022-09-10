//클래스 정의하기
//
//(접근제어자) class 클래스이름 {     
//	멘버 변수;
//	메서드;
//}

// 클래스 이름은 대문자
// public 을 가진 클래스는 1개

// 클래싀의 속성은 property, attribute 라고함


// 클래스의 기능

// 메서드로 구형
// 객체가 수행하는 기능
package classprt;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String adddress;
	
	//메서드
	public void showStudentInfo() {
		System.out.println(studentName + "," + adddress); 
	}
	
	// 스튜던트 이름을 외부에 알려주는 메서드
	
		// public 자료형 메서드이름() {
		//  return 반환할 값
		// }
		
		public String getStudentName() {
			return studentName;
		}
		
		//studentName 을 새로 지정하는 메서드
		
		public void setstudentName(String name) {
			studentName = name;
		}
		
	// 클래스를 구동하는 부분
/*	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.adddress = "서울시 서초구 서초동";
		
		studentLee.showStudentInfo();
	}*/
}
