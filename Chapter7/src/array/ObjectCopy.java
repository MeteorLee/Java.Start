//객체 배열 복사하기
//
//배열의 값을 복사하는게 아닌 배열의 주소를 복사함
//얕은 복사라고 불림

// get set을 이용하여 인스턴스 값을 복사함
// 깊은 복사


package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		Book[] bookArray3 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥1", "조정래");
		bookArray1[1] = new Book("태백산맥2", "조정래");
		bookArray1[2] = new Book("태백산맥3", "조정래");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray3[0] = new Book();
		bookArray3[1] = new Book();
		bookArray3[2] = new Book();
		
		for (int i = 0; i<bookArray3.length; i++) {
			bookArray3[i].setAuthor(bookArray1[i].getAuthor());
			bookArray3[i].setBookName(bookArray1[i].getBookName());
		}
		
		for (int i = 0; i < bookArray3.length; i++) {
			bookArray3[i].showBookInfo();
		}
		
		
		System.out.println("--------------------------");
		
		bookArray1[0].setAuthor("나목");
		bookArray1[0].setBookName("박완서");
//		bookArray1의 주소를 bookArray2에 복사됬기에 bookArray2의 인스턴스값도 다르게 보임
	
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();	
		}
		
		System.out.println("--------------------------");
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();	
		}
		
		for (int i = 0; i < bookArray3.length; i++) {
			bookArray3[i].showBookInfo();
		}
		
	
	}
	

}
