package interfaceEx2;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
//		Customer 클래스가 Buy, Sell 두개를 implements하더라도 buyer, seller가 
//		사용할 수 있는 메서드가 한정적일 수 있다.
		
		customer.order();
		buyer.order();
		seller.order();
//		Sell, Buy가 가상메서드 이기에 customer의 order가 불리게 된다.
		
	}
	

}
