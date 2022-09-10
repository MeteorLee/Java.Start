package chapter2;

public class BinaryTset2 {

	public static void main(String[] args) {
		int num1 = 0B00000000000000000000000000000101; // +5
		int num2 = 0B11111111111111111111111111111011; // -5
		
		int num3 = num1 + num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

	}

}
