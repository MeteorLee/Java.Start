package interfaceEx;

public interface Calc {
	
	
	double PI = 3.14;
	int ERROR = -99999999;
//	public static final 이 앞에 붙음
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
//	abstract가 앞에 붙음
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
//	default를 이용하여 구현부를 만들 수 있다.
//	여러 클래스가 동일한 메서드를 지닐때 사용
//	하위클래스에서 재정의 가능
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i: arr) {
			total += i;
		}
		return total;
	}
}








//인터페이스의 요소
//
//상수 : 모든 변수는 상수로 변환 됨
//추상 메서드 : 모든 메서드는 추상 메서드로 구현됨
//디폴트 메서드 : 기본 구현을 가지는 메서드, 구현 클래스에서 재정의 할 수 있음
//정적(static) 메서드 : 인스턴스 생성과 상관없이 인터페이스 타입으로 사용할 수 있는 메서드
//private 메서드 : 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없음.
//				인터페이스 내부에서만 기능을 제공하기 위해 구현하는 메서드