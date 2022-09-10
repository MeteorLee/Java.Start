package inheritance;

public class OverRiding {

	public static void main(String[] args) {

	/*	Customer customerLee = new Customer(1001, "Lee");
		int price = customerLee.calcPrice(10000);
		System.out.println("지불 금액은 " + price +"이고 "+ customerLee.showCustomerInfo());
		
		
		
		VipCustomer customerJin = new VipCustomer(123,"Jin",222);
		int price2 = customerJin.calcPrice(10000);
		System.out.println("지불 금액은 " + price2 +"이고 "+ customerJin.showCustomerInfo());
	*/	
		
		Customer customerWho = new VipCustomer(1000, "Who",1212);
		int price = customerWho.calcPrice(10000);
		System.out.println("지불 금액은 " + price +"이고 "+ customerWho.showCustomerInfo());
		
		
		
		
	}

}