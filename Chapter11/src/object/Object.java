package object;

public class Object {
	
	

}
//Object 클래스

//모든 클래스의 최상위 클래스
//java.lang.Object클래스
//모든 클래스는 Object클래스에서 상속 받음
//모든 클래스는 Object클래스의 메서드를 사용할 수 있음
//모든 클래스는 Object클래스의 메서드 중 일부는 재정의 할 수 있음(final로 선언된 메서드는 재정의 할 수 없음)
//컴파일러가 extends Object를 추가함


//object 클래스 메서드
//
//String to String()			객체를 문자열로 표현하여 반환합니다. 재정의 하여 객체에
//							대한 설명이나 특정 멤버 변수 값을 반환합니다.
//boolean equals(Object obj)	두 인스턴스가 동일한지 여부를 반환합니다. 재정의 하여
//							논리적으로 동일한 인스턴스임을 정의할 수 있습니다.
//int hash Code()				객체의 해시 코드 값을 반환합니다.
//Object clone()				객체를 복제하여 동일한 멤버 변수 값을 가진 새로운
//							인스턴스를 생성합니다.
//Class getClass()			객체의 Class 클래스를 반환합니다.
//void finalize()				인스턴스가 힙 메모리에서 제거될 때 가비지 컬렉터(GC)에
//							의해 호출되는 메서드입니다. 네트워크 연결 해제, 열려있는
//							파일 스트링 해제 등을 구현합니다.
//void wait()					멀티 스레드 프로그램에서 사용하는 메서드입니다. 스레드를
//							'기다리는 상태'(non runnable)로 만듭니다.
//void notify()				wait()메서드에 의해 기다리고 있는 스레드(nonrunnable 상태)
//							를 실행 가능한(runnable)로 가져옵니다.
//				
					