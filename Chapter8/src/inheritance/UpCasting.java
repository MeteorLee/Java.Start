//상위 클래스로의 묵시적 형 변환(업캐스팅)
//
//상위 클래스 형으로 변수를 선언하고 하위 클래스 인스턴스를 생성 할 수 있음
//하위 클래스는 상위 클래스의 타입을 내포하고 있으므로 상위 클래스로 묵시적 형변환이 가능함

package inheritance;

public class UpCasting {

	public static void main(String[] args) {

		Customer customerJo = new VipCustomer(111, "Jo");
		
		customerJo.calcPrice(200000);
		// VipCustomer() 생성자의 호출로 인스턴스는 전부 생성됨
		// 타입이 Customer이므로 접근할 수 있는 변수나 메서드는 Customer의 변수와 메서드만 사용가능함
		// customer의 customerName,ID등은 사용할 수 있지만
		// agent같은 변수는 사용할 수 없다.
		// customerJo.agentID 같은 것은 오류남
		
		
		
		System.out.println(customerJo.showCustomerInfo());
		
		
		
	}

}
