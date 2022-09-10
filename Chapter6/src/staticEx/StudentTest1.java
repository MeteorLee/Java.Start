package staticEx;

public class StudentTest1 {
	
	public static void main(String[] args) {
//		studentJ.studentID = 10001;
//		이렇게 하나 하나 지정하는게 아니고		
		
		Student studentJ = new Student();
		
		System.out.println(studentJ.serialNum);
//		studentJ.serialNum++;
		
		Student studentT = new Student();
		
		System.out.println(studentJ.serialNum);
		System.out.println(studentT.serialNum);

		System.out.println(Student.serialNum);
		// 노란줄이 뜨는 이유는 static변수는 Student클래스에서 공유되고 있기에
		// studentJ라는 인스턴스가 아닌 Studet클래스를 사용하는
		// Student.serialNum이라고 쓰는게 좋다.
		
//		studentJ.serialNum studentT.serialNum은 공유 되고 있다.
		
		System.out.println(studentJ.studentID);
		System.out.println(studentT.studentID);
		
		// private 보통 static변수는 기준이 되는 변수 이기에 함부러 변화를 주지 해야하므로
		// private로 정의하게 된다 (지금은 public으로 되있지만)
		// private 로 정의 하게 되면 Student.serialNum으로 할수 없기에
		// get을 이용하게 해야함
		
		System.out.println(Student.getSerialNum());
		
	}

}
//static 변수 예
//
//여러 인스턴스가 하나의 메모리 값을 공유 할 때 필요
//학생이 생성될 때마다 학번이 증가해야 하는 경우
//기준이 되는 값은 static 변수로 생성하여 유지 함
//
//각 학생이 생성될 때 마다 static 변수 값을 복사해 와서 하나 증가
//시킨 값을 생성된 인스턴스의 학번 변수에 저장해 줌