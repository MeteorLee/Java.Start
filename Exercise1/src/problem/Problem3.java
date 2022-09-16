package problem;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {

		// 돈 = 50000*a + 10000*b + 5000*c + 1000*d + 500*e + 100*f + 50*g + 10*h
		
		int money = 0;
		int a,b,c,d,e,f,g,h;
		a =b =c =d =e =f =g= h =0;
		
		System.out.print("금액을 넣으세요 :");
		Scanner sc = new Scanner(System.in);
		money = sc.nextInt();
		
		while (money >= 50000) {
			money -= 50000;
			a++;
		}
		while (money >= 10000) {
			money -= 10000; 
			b++;
		}
		while (money >= 5000) {
			money -= 5000;
			c++;
		}
		while (money >= 1000) {
			money -= 1000;
			d++;
		}
		while (money >= 500) {
			money -= 500;
			e++;
		}
		while (money >= 100) {
			money -= 100;
			f++;
		}
		while (money >= 50) {
			money -= 50;
			g++;
		}
		while (money >= 10) {
			money -= 10;
			h++;
		}
		
		System.out.println("50000원" + a + "개");
		System.out.println("10000원" + b + "개");
		System.out.println("5000원" + c + "개");
		System.out.println("1000원" + d + "개");
		System.out.println("500원" + e + "개");
		System.out.println("100원" + f + "개");
		System.out.println("50원" + g + "개");
		System.out.println("10원" + h + "개");

	
	}
	
}
