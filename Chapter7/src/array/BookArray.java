//객체 배열 만들기
//
//참조 자료형을 선언하는 객체 배열
//배열만 생성 한 경우 요소는 null로 초기화 됨
//각 요소를 new를 활용하여 생성하여 저장해야함
//book[] library = new Book[5] 는 library에 Book 객체의 주소를 5개 지정해줌


package array;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book();

		
		for (int i = 0 ; i < library.length; i++) {
			System.out.println(library[i]);
		}
		System.out.println();
		for (int i = 0 ; i < library.length; i++) {
			library[i].showBookInfo();
		}
	}

}


