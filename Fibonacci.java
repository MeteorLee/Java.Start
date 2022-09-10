package first;

public class Fibonacci {
	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 1;
		System.out.println("1number");
		System.out.println(num1);
		System.out.println("2number");
		System.out.println(num2);
		
		for (int i =1 ; i <= 18 ;i++) {
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.println((i+2)+ "number");
			System.out.println(num3);
		}
	}

}
