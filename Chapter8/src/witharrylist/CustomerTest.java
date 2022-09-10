package witharrylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(1001, "이순신");
		Customer customerkim = new Customer(1001, "김진호");
		GoldCustomer customerJin = new GoldCustomer(1002, "진");
		GoldCustomer customerChang = new GoldCustomer(1002, "창모");
		VipCustomer customerKang = new VipCustomer(1003, "강호동",3);
		VipCustomer customerHong = new VipCustomer(1003, "홍진호",4);
		
		customerList.add(customerLee);
		customerList.add(customerkim);
		customerList.add(customerJin);
		customerList.add(customerChang);
		customerList.add(customerKang);
		customerList.add(customerHong);
		
		System.out.println("-------고객정보 출력-------");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("-------할인율과 보너스 포인트 결과-------");
		
		
		
//		for(Customer customer : customerList) {
//			int price = customer.calcPrice(10000);
//			System.out.println(customer.customerName + "님의 계산 금액은 " + price + "원이고 보너스 포이트는 "+ customer.bonusPoint
//					+ " 입니다.");
//		}
		
		int price = 10000;
		for(Customer customer : customerList) {
			
			int cost = customer.calcPrice(price);
			
			System.out.println(customer.getCustomerName() + "님의 " + cost +"를 지불 하셨습니다.");
			System.out.println(customer.showCustomerInfo());
			
		}
		
		
	}

}
