package singleton;

public class Company {

//	private이므로 외부에서는 Company를 생성할 수 없다.
	private static Company instance1 = new Company();
//	instance는 단 한개만 내부에서만 생성하겠다.
	
	private Company(){	}

	public static Company getInstance() {
//		if(instance1 == null)
//			instance1 = new Company();
//		인스턴스가 없을 때 호출하는 경우를 대비한 방어적인 코드
		
		return instance1;
	}
}
