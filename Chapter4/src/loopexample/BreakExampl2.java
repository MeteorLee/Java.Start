package loopexample;

public class BreakExampl2 {

	public static void main(String[] args) {

		int dan = 1;
		int times = 1;
		
		while (dan<10) {
			
			times = 1;
			while(times<10) {
				
				if (dan < times) {
					break;
				}
				System.out.println(dan + "x" + times + "=" + dan*times);
				times ++;
				
			}
			dan ++;
			System.out.println("");
		}
		
	}

}
