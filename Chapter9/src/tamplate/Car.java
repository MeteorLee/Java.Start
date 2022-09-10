package tamplate;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();	//	나중에 구현함
	
	public abstract void wiper();
	public void washCar() {}// 구현을 한것으로 취급	HookMethod라고 함
							// 필요에 의해서 재정의 해서 쓸수 있음
	
	public void starCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public final void run() {
		starCar();
		drive();
		wiper();
		stop();
		washCar();		// 오버라이딩을 해준 AICar의 washCar만 작동
		turnOff();
	}
	// template 메서드는 fainal을 이용
	// final 은 하위 클래스에서는 수정할 수 없다.\
	
	// 장점 : 
}


//추상 클래스와 탬플릿 메서드
//
//템플릿 메서드 : 추상 메서드나 구현된 메서드를 활용하여 전체 기능의 흐름(시나리오)을 정의하는 메서드
//			final로 선언하면 하위 클래스에서 재정의 할 수 없음
//프레임 워크, 설계 단계에서 많이 사용되는 설계 패턴
//추상 클래스로 선언된 상위 클래스에 템플릿 메서드를 활용하여 전체적인 흐름을 정의하고 하위 클래스에서 다르게 구현되어야하는
//부분은 추상 메드로 언언하여 하위 클래스가 구현하도록 함



//final 예약어
//
//final 변수는 값이 변경될 수 없는 상수임
//	public static final double PI = 3.14;
//final 변수는 오직 한 번만 값을 할 당할 수 있음
//final 메서드는 하위 클래스에서 재정의(overriding) 할 수 없음
//final 클랫느느 더 이상 상속되지 않음
//	예> java의 String 클래스






