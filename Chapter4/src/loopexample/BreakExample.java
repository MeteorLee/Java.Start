package loopexample;

public class BreakExample {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		while (true) {
			sum += num;
			num ++;
		
			if (sum>100) {
				break;
			}
			
		}
		System.out.println("íŠė " + sum);
		System.out.println("ėë " + num);
	}

}
