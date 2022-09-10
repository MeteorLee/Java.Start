package inheritance;

class Animal2{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human2 extends Animal2{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger2 extends Animal2{
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle2 extends Animal2 {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void fly() {
		System.out.println("하늘을 날라갑니다.");
	}
	
}



public class DownCasting {

	public static void main(String[] args) {

		DownCasting test = new DownCasting();
		test.moveAnimal(new Human2());
		test.moveAnimal(new Tiger2());
		test.moveAnimal(new Eagle2());
		
		System.out.println(test);
		
//		Animal a = new Human(); // 위랑 같음
//		a.move();

		Animal[] animalList = new Animal[3];
		
		
		
	}

	public void moveAnimal(Animal2 animal) {
		
		animal.move();
//		
//		Human2 human = (Human2)animal;
//		human.readBook();
//		사람이 책을 읽는 것 까지는 되지만 호랑이에서 오류가 듬
		
		if(animal instanceof Human2) {
			Human2 human = (Human2)animal;
			human.readBook();
		}
		else if(animal instanceof Tiger2) {
			Tiger2 human = (Tiger2)animal;
			human.hunting();
		}
		else if(animal instanceof Eagle2) {
			Eagle2 human = (Eagle2)animal;
			human.fly();
		}
		else {
			System.out.println("지원하지 않는 기능입니다.");
		}
		
	}
}
// 다운 캐스팅 - instanceof

//하위 클래스가 상위 클래스로 형 변환 되는 것은 묵시적으로 이루어짐
//다시 원래 자료형인 하위 클래스로 형 변환 하려면 명시적으로 다운 캐스팅을 해야함
//이때 원래 인스턴스의 타입을 체크하는 예약어 instanceof임