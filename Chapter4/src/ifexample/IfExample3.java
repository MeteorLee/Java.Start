package ifexample;
//else if 가 아닌 if 로만 한다면 앞의 if else if 만족하더라도 다시한번 비교하여 문제가 생김
public class IfExample3 {

	public static void main(String[] args) {
		
		int age = 7;
		int charge = 0;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		}
		if(age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		if(age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생 입니다.");
		}
		else {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
	}
}
