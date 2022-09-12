package object;

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x = " + x +  "," + " y = " + y;
	}
}

class Circle implements Cloneable{
//			Cloneable 잊지 말자
	
	Point point;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	public String toString() {
		return "원점은 " + this.point + "이고 반지름은 " + radius + "입니다.";
	}

//	Source의 override에서 clone으로 생성 가능
	@Override
	protected java.lang.Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class ObjectCloneTest {
												//클론 할 수없는걸 클론을 할 때 예외 처리
	public static void main(String[] args) throws CloneNotSupportedException {

		Circle c1 = new Circle(10, 20, 5);
		
		Circle clonec1 = (Circle)c1.clone();
//		object로 반환 받아야함으로 강제로 (Circle)클래스로 다운 캐스팅 함
		
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(clonec1));
//		서로 다른 hashCode값을 가진 인스턴스
	
		System.out.println(c1.toString());
		System.out.println(clonec1.toString());
		
	}

}
