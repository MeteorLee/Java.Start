package inheritance;

public class Circle {

//	private int x;
//	private int y;

	Circle c1 = new Circle();
		
	Point point; // has - a 상속이 아닌 그냥 가져다 쓰는 관계
	
	private int radius;
	
	public Circle() {
		point = new Point();
	}
}


//상속
//
//상위 클래스는 하위 클래스 보다 일반적인 의미를 가짐
//하위 클래스는 상위 클래스 보다 구체적인 의미를 가짐
//
//ex) 포유류 <- 사람  일반적 <- 구체적 		상속 O
//ex) 원 <- 점  원을 그리는데 위치인 점을 이용	상속 X