package object;

class Student{
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(java.lang.Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(studentID == std.studentID) 
				return true;
			else return false;
		}
		return false;
	}
	
	
	
}

public class Equals {

	public static void main(String[] args) {
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2);
//		힙메모리가 다르다. 주소값이 같지 않다.
		System.out.println(str1.equals(str2));
//		문자열이 같은지 보도록 재정의 되어 있다. 논리적인 동일성을 본다.

		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
//		처음에는 ==와 equals가 false로 같지만 위에서 equals를 재정의하여 true값이 나오도록함.
	}
}

//equals() 메서드
//
//두 인스턴스의 주소 값을 비교하여 true/false를 반환
//재정의 하여 두 인스턴스가 논리적으로 동일함의 여부르 반환
//같은 학번의 학생인 경우 여러 인스턴스의 주소 값은 다르지만, 같은 학생으로 처리해야
//학점이나 정보 산출에 문제가 생기지 않으므로 이런 경우 equals()메서드 를 재정의함