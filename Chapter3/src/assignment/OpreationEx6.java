package assignment;

public class OpreationEx6 {
	public static void main(String[] args) {
		
		// << 비트를 왼쪽으로 이동
		// >> 비트를 오른쪽으로 이동 (부호를 유지함)
		// >>> 비트를 오른쪽으로 이동 (부호도 상관없이 이동)
		int i = 5;
		System.out.println(i);
		i = i << 2;
		System.out.println(i);
		i = i >> 1;
		System.out.println(i);
		i = i >>> 0;
		System.out.println(i);
		i = -1;
		i = i >>> 1;
		System.out.println(i);
		double k = Math.pow(2,15); // 2의 15제곱
		System.out.println(k);
		// 맨 앞의 -부호 의 연산자도 이동하여 큰 숫자가 나옴
		
		// & 연산자 : 두비트가 모두 1일 때만 반환
		int num1 = 5;
		int num2 = 11;
		int result = num1 & num2;
		System.out.println(result);
		/* 000101
		 * 001011
		 * 000001
		 */
		
		
		// | 연산자 : 두비트 중 하나라도 1이라면 반환
		num1 = 5;
		num2 = 11;
		result = num1 | num2;
		System.out.println(result);
		/* 000101
		 * 001011
		 * 001111
		 */
		
		
		// ^ 연산자 : 두비트가 다르면 1, 같으면 0 반환
		num1 = 5;
		num2 = 11;
		result = num1 ^ num2;
		System.out.println(result);
		/* 000101
		 * 001011
		 * 001110
		 */
		
		
		// ~ 연산자 : 한비트의 1부분을 0으로, 0부분을 1로 변환
		num1 = 5;
		result = ~num1;
		System.out.println(result);
		/* 000101
		 * 111010
		 */
	}

}
