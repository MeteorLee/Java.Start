package assignment;

public class OperationEx4 {
	public static void main(String[] args) {
		// 조건식 ? 결과1 : 결과2;
		int num = (5 > 3) ? 10 : 20;
		System.out.println(num);

		int num2 = (5 < 3) ? 10 : 20;
		System.out.println(num2);
		
		int father_age = 45;
		int mother_age = 40;
		
		char ch;
		ch = (father_age > mother_age) ? 'T' : 'F';
		
		System.out.println(ch);
	}

}
