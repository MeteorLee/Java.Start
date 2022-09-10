package thisEx;

class Person{
	
	String name;
	int age;
	
	public Person() {
//		name = "이름없음";
//		age = 1;
//		이미 아래에 이름과 나이를 가지고 있는 생성자가 있으므로 아래처럼 기입하면됨.
		this("이름없음",1); // 알아서 아래의 생성자로 들어가서 String과 int에 매칭해줌
//		this를 이용하여 생성자에서 다른 생성자를 호출함
//		만약 this위에 다른 statement가 존재하면 제대로 다른 생성자를 호출할수 없기에
//		this가 가장 먼저 쓰여야함
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 반환형은 자신의 클래스 이름
	public 	Person returnSelf() {
		return this;
	}
	
}


public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf());
	}

}
