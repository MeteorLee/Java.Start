// 변하지 않는 값
package chapter2;

public class Constant {

	public static void main(String[] args) {
		
		final int MAX_NUM = 100;
		final double PI = 3.14;
		
		// PI = 3.15; 는 변할수 없으므로 오류
		
		final int STUDENT_NUM = 31; 
		int num = 0;
		if (num == STUDENT_NUM) {}
		
		System.out.println(STUDENT_NUM);
		
		
	}
	
}
