//반복문에 쓰이며 반복문 내부 continue 문을 만나면
//이후 반복되는 부분을 수행하지 않고 조건식이나 증감식을 수행함
//1부터 100까지 중 홀수만 더하는 예

package loopexample;

public class ContinueExample {

	public static void main(String[] args) {

		int total = 0;
		int num;
		
		for (num =1; num <= 100; num++) {
			
			if (num % 2 == 0) {
				continue;
			}
			total += num;
		}
		System.out.println("합은" + total);
	}

}
