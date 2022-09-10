// 명시적 형변환
// 명시적으로 표현해줘야함
package chapter2;

public class ExpicitConversion {
	public static void main(String[] args) {
		
		int iNum = 1000;
		// byte bNum = iNum; 4바이트 -> 2바이트로 묵시적 변환 X
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);  // 4바이트에서 2바이트로 하여 앞의 2바이트가 손실되서 다른 값이 나옴
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);  // 소수점이하는 사라짐
		
		float fNum = 0.9F;
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);
		
		System.out.println(num1);	// 더하기 전에 변환
		System.out.println(num2);	// 더하고 나서 변환
	}

}
