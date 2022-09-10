package loopexample;
// for(초기화식 ; 조건식 ; 증감식)
public class ForExample {

	public static void main(String[] args) {
		
		int num;
		int sum;
		
		for (num = 1 , sum = 0 ; num <= 10 ; num++) {
		// for ( , num <= 10 , ) 생략가능	
			sum +=num;

		}
		System.out.println(sum);
		System.out.println(num);

	}

}
