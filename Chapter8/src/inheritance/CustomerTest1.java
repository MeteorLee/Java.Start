package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerID(1000);
		customerLee.setCustomerName("Lee");
		
		System.out.println();
		
		VipCustomer customerKim = new VipCustomer();
		customerKim.setCustomerID(1001);
		customerKim.setCustomerName("kim");
	
		customerKim.calcPrice(220000);
		System.out.println();
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println();
		System.out.println(customerKim.showCustomerInfo());
		
		
	}
	

}
