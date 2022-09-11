package interfaceEx;

public class CalculatorTest {

	public static void main(String[] args) {
		
//		Calc calc = new CompleteCalc();
//		calc.add(0, 0);
//		calc.divide(0, 1);
//		calc.substract(0, 0);
//		Calc에서 다 구현되지 않았지만 CompleteCalc에서 구현된 것을 불러오기에 전부다 사용가능
		
//		Calc calc1 = new CompleteCalc();	구현 가능
//		Calc calc2 = new Calc();			인터페이스 타입으로 생성 불가능
//		Calc calc3 = new Calculator();		times divide를 구현해놓지 않아서 생성 불가능
		
		
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
//		calc.showInfo는 부를 수 없다.
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.divide(num1, 0));
		
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
//		static이므로 calc가 아닌 Calc를 써야함
		System.out.println(sum);
	}


}

//인터페이스 구현과 형 변환
//
//인터페이스를 구현한 클래스는 인터페이스 형으로 선언한 변수로 형 변환 할 수 있음
//상속에서의 형 변환과 동일한 의미
//단 클래스 상속과 달리 구현코드가 없기 때문에 여러 인터페이스를 구현할 수 있음 (다중 상속의 의미) : Clac, Runnalbe , 로 여러개 가능
//형 변환시 사용할 수 있는 메서드는 인터페이스에 선언된 메서드만 사용할 수 있음

