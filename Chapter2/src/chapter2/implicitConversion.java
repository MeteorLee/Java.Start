// 묵시적 형변환  명시적인 표현은 하지않아도 된다
// 작은수에서 큰수로
// 덜 정밀한 수에서 정밀한 수로
package chapter2;

public class implicitConversion {
	public static void main(String[] args) {
		byte bNum = 10; //2 바이트
		int num = bNum; //2 바이트 -> 4바이트
		
		System.out.println(num);
		
		long lNum = 10;    // 8바이트
		float fNum = lNum; // 8바이트 -> 4바이트 이지만 정수 -> 실수로 정밀한 수로 형변환
		
		System.out.println(fNum);
		
		double dNum = fNum + num; // num -> float , (fNum + num)(float) -> double
		System.out.println(dNum);
	
	}
}
