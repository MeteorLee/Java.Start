package classprt;

public class FunctionTest {

	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 10;
		
		int sum = addNum(num1, num2);
		System.out.println(sum);
	}
	
	public static int addNum(int n1, int n2) { 		//함수 선언
		int result = n1 + n2;						
		return result;
	}
	
}
