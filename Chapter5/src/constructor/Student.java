package constructor;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String adddress;
	
	// 생성자로 이 객체가 생성될 때 2개의 매개변수를 가지고 시작하게 하고 싶음
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	} 
	
	// 생성자가 생성됬으므로 다른 Test에서도 생성자를 정의 해줘야함
	// 그렇지 않으면 default 생성자가 Test에 이제는 생성되지 않으므로 오류가 발생함
	
	
	//default 생성자를 이용하는 경우
	public Student() {}
	// 생성자 오버로드로 오류를 막아줌
	// Test의 김유신 부분이 오류가 나는 것을 막아줌
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + adddress); 
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setstudentName(String name) {
		studentName = name;
	}
	
	
}



