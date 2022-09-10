package staticEx;

public class Student {

	static int serialNum = 10000;

	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10; // 지역변수
//		studentId = 123;   --- 오류남  // 멤버변수, 인스턴스 변수
//		인스턴스 변수는 new에서 생성 되므로 오류가 남
// 		ex) 만약 Student studentJ = new Student()를 하기 전에
//		System.out.println(Student.getSerialNum())을 사용하게 된다면
//		serialNum은 static변수라 생성 되어 있어 호출되게 되는데
//		인스턴스가 생성이 안되었기 때문에 오류가 나게 됨
		
		return serialNum; // static 변수, 클래스 변수  
	}

//	public static void setSerialNum(int serialNum) {
//		Student.serialNum = serialNum;
//	}
	// 값을 함부러 수정하지 못하게 막음
	
}
