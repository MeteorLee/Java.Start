package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {

		Customer customerJin = new Customer(123, "Jin");
		
		System.out.println();
		
		VipCustomer customerKang = new VipCustomer(1234, "Kang");
		
		
		GoldCustomer customerLee = new GoldCustomer(1414, "Lee");
		
		customerJin.calcPrice(10000);
		customerLee.calcPrice(10000);
		customerKang.calcPrice(10000);
		
		
		System.out.println(customerJin.showCustomerInfo());
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKang.showCustomerInfo());
		
	}

}
