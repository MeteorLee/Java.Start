package aaa;

public class FunctionTest {

	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 10;
		
		int sum = addNum(num1, num2);
		System.out.println(sum);
	}
	
	public static int addNum(int n1, int n2) { 		//함수 선언
		int result = n1 + n2;						
		return result;
	}
	
}

//객체 : 객체 지향프로그램의 대상, 생성된 인스턴스
//클래스 : 객체를 프로그래밍하기 위해 코드로 만든 상태
//인스턴스 : 클래스가 메모리에 생성된 상태
//멤버 변수 : 클래스의 속성, 특성
//메서드 : 멤버 변수를 이용하여 클래스의 기능을 구현
//참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수
//참조 값 ; 생성된 인스턴스의 메모리 주소 값