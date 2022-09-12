package object;

class Student2 extends Student{

	Student2(int studentID, String studentName) {
		super(studentID, studentName);
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
	
	public int hashCode() {
		return studentID;
	}
//	hashCode를 재정의해 StudentID가 출력되게 만들었다.
//	주로 equals를 재정의하는 데 쓰이는 멤버변수를 가져다 쓰는게 흔함.
//	equals를 재정의하면 hashCode도 재정의 해줘야함 아니면 문제가 생길 가능성이 높음
}

public class HashCode {

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
		
		System.out.println(std1.hashCode()); // 10진수 adress가 반환됨
		System.out.println(std2.hashCode());
//		다른 adress를 지니고 있음
		System.out.println(System.identityHashCode(std2));
//		실제 hip메모리 값이 그대로 출력됨
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
//		str1, str2 서로 다르게 정의하여 다른 hip메모리를 지니고 있으나 같게 보이는 것은 hashCode메서드가 재정의 되어있기 때문인다.
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
//		재정의 되기 전(실제) 의 hashCode값
		
		Student2 std3 = new Student2(123123, "Jin");
		Student2 std4 = new Student2(123123, "Jin");
//		hashCode를 재정의한 Student2로 생성
		System.out.println(std3.hashCode());
		System.out.println(std4.hashCode());
//		hashCode가 재 정의되어 StudentID인 123123이 출력되게 만듬
		
		
		
		
		}
}


//hashCode() 메서드
//
//hash : 정보를 저장,검색하기 위해 사용하는 자료구조
//자료의 특정값(키 값)에 대해 저장 위치를 반환해주는 해시 함수를 사용함
//	저장위치	   객체 정보
//	index hash(key)
//		  해시 함수
//해시 함수는 어떤 정보인가에 따라 다르게 구현 됨
//hashCode() 메서드는 인스턴스의 저장 주소를 반환함
// 힙메모리에 인스턴스가 저장되는 방식이 hash
// jvm에서 인스턴스를 관릴할 때 hash방식으로 관리함


//hashCode()의 반환 값 : 자바 가상 머신이 저장한 인스턴스의 주소값을 10진수로 나타냄
//서로 다른 메모리의 두 인스턴스 가 같다면??
//	재정의 된 equals() 메서드의 값이 true
//	동일한 hashCode() 바환 값을 가져야함
//논리적으로 동일함을 위해 equals()메서드를 재정의 하였다면 hashCode()메서드로 재정의 하여 동일한 값이 반환 되되록 함
//String 클래스 : 동일한 문자열 인스턴스에 대해 동일한 정수가 반환 됨
//integer 클래서 : 동일한 정수값의 인스턴스에 대해 같은 정수값이 반환 됨

















