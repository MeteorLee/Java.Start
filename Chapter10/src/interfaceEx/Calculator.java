package interfaceEx;

public abstract class Calculator	implements Calc{
// 다 구현하지 않으면 abstract
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	
	
	
}
