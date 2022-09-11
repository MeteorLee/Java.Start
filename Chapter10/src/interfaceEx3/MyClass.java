package interfaceEx3;

public class MyClass implements MyInterface{

	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}

	public static void main(String[] args) {
		
		MyClass myClass = new MyClass();
		myClass.x();
		myClass.y();
		myClass.myMethod();
		
		X xClass = myClass;
		xClass.x();
		
	}
}

//인터페이스 상속
//
//인터페이스 간에도 상속이 가능(extends 사용)
//구현코드의 상속이 아니므로 형 상속(type inheritance)라고 함
