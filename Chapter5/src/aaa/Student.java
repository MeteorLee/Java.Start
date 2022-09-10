package aaa;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String adddress;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + adddress); 
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setstudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.adddress = "서울시 영등포구 여의도동";
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.adddress = "미국 산호세";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		// 앞부분은 클래스의 풀네임 @뒤의 내용은 32비트의 주소값을 나타냄
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
	
}


// 인스턴스와 힙 메모리

//하나의 클래스 코드로부터 여러개의 인스턴스를 생성
//인스턴스는 힘(heap) 메모리에 생성됨
//각가의 인스턴스는 다른 메모리를 다른 값을 가짐

// 지역변수는 stack에 저장됨
// studentLee, studentKim는 지역변수
// studentKim와 같은 지역변수의 주소를 나타냄
// studentKim. 의 .을 입력하면 주소를 따라가서 ID adress등을 알수 있음
// stack 메모리는 함수가 시작될때 생성되어 끝나면 없어짐
// heap은 동적이여서 new에의해 생성되며 따로 없애주기 전에는 없어지지 않음



