package abstractex;

public class ComputerTest {

	public static void main(String[] args) {

//		Computer c1 = new Computer();
//		Computer c2 = new NoteBook();
//		추상클래스는 생성될 수 없음.
//		구현코드가 없는 메소드가 있기 때문이다.
		
		Computer c1 = new DeskTop();
		
		c1.turnOn();
		c1.turnOff();
		
		System.out.println("----------------");		


		NoteBook c2 = new MyNoteBook();
//		이건 가능하다.
		 
		Computer c3 = new MyNoteBook();
		c2.playYoutube();
//		가능
//		c3.playYoutbe.();
//		불가능 - c3를 Computer가 아닌 NoteBook으로 바꿀 필요가 있음
		
		c2.display();
		c3.display();
//		이 경우에는 MyNoteBook에 display가 없는 데도 NoteBook의 display가 호출 가능함
//		Computer의 추상 메서드 display에서 NoteBook의 display로 이동함

		
		
	}

}
