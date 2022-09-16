package problem;

public class Problem2 {

	public static void main(String[] args) {

		int num = 0;
		int a, b;
		a = 7; // a의 배수
		b = 8; // b의 배수
		
		
		for (int i = 1; i < 100; i++) {
			if (i % a == 0) {
				if(i % b == 0) {
					num = i;
				}
			} 
		
		}

		System.out.println("찾는 정수 : " + num);
	}

}
