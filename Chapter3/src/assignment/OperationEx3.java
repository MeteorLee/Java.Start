package assignment;

public class OperationEx3 {
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		// (num1 = num1 + 10) < 10)이 flase 이므로 (i = i + 2) < 10)이 실행되지 않음
		System.out.println(value);
		System.out.println(num1); // num1 은 연산이 됨
		System.out.println(i); // i는 연산이 이뤄지지 않음
		
		value = ((num1 = num1 + 10) < 10) || ((i = i + 2) > 10);
		// 둘다 false 라도 연산이 진행 된다
		System.out.println(value);
		System.out.println(num1); // num1 은 연산이 됨
		System.out.println(i); // i의 연산이 이루어짐
		
	
	}

}
