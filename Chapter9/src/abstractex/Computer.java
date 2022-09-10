package abstractex;

// 추상 클래스 선언을 해야 추상 메서드를 만들 수 있음
public abstract class Computer {

// 메서드의 이름만 선언한다
//	구현 코드가 없음
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 킵니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	// 추상 클래스 에서도 그냥 클래스를 선언가능
}
