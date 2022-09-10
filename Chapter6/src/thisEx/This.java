package thisEx;

public class This {
	
}

//자신의 메모리를 가르킴
//생성자에서 다른 생성자를 호출
//자신의 주소를 반환함



//생성자에서 다른 생성자를 호출 하는 this
//public Person() 
//	this("이름없음",1);
//
//public Person(String name, int age) {
//	this.name = name;
//	this.age = age;
//	
//}
//this를 이용하여 다른 생성자를 호출할 때는 그 이전에 어떠한 statement도 사용할 수 없다.
//위와 같이 생성자가 여러 개 이고 파라미터만 다를 경우 constructor overloading이라고 한다.