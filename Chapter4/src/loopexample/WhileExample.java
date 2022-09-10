package loopexample;
// do while 최소한 한번은 시행함
public class WhileExample {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		do {
			
			//sum = sum + num;
			sum += num;
			//num += 1;
			num++;
		} while (num <= 10);
		
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
	}

}