package object;

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.author = author;
		this.title = title;
	}

	@Override
	public String toString() {
		return title + ", " + author;
	}
	
	
}

public class ToString {

	public static void main(String[] args) {
		
		Book book = new Book("두잇자바", "은종님");
		System.out.println(book);
		
		String str = new String("test");
		System.out.println(str);
//		이미 toString이 재정의 되어 있음
	}
}

//toString() 메서드
//
//object 클래스의 메서드
//객체의 정보를 String으로 바꾸어서 사용할 때 많이 쓰임
//String이나 Integer클래스에는 이미 재정의 되어 있음
//String은 문자열 반환
//Integer는 정수 값 반환