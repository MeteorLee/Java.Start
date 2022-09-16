package problem;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {

		double radius;	// 반지름
		double area;	// 넓이
		
		System.out.print("반지름을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		radius = sc.nextDouble();
		
		area = Math.PI*(radius*radius);
		System.out.println("원의 넓이는 : " + area);
	}

}
