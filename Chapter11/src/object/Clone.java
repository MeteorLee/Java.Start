package object;

public class Clone {

	public static void main(String[] args) {

	}

}


//Clonew() 메서드


//객체의 원본 복제하는데 사용하는 메서드
//원본을 유지해 놓고 복사본을 사용할 때
//기본 틀(prototype)을 두고 복잡한 생성과정을 반복하지 않고 복제
//clone()메서드를 사용하면 객체의 정보(멤버변수 값)가 같은 인스턴스가 또 생성되는 것이므로
//	객체 지향 프로그램의 정보 은닉, 객체 보호의 관점에서 위배될 수 있음 (private 값이 복제될 수 있음)
//객체의 clone()메서드 사용을 허용한다는 의미의 cloneable 인터페이스를 명시해 줌
// ex) Class Circle implements Cloneable{ ...