//ArrayList 클래스
//
//기존 배열은 길이를 정하여 선언하므로 사용 중 부족한 경우 다른 배열로 복사하는 코드를 직접 구현해야 함
//중간의 요소가 삭제되거나 삽입되는 경우도 나머지 요소에 대한 조정하는 코드를 구현해야함
//ArrayList 클래스는 자바에서 제공되는 객체 배열이 구현된 클래스
//여러 메서드와 속성 등 사용하여 객체 배열을 편리하게 관리 할 수 있음
//가장 많이 사용하는 객체 배열 클래스 


package arrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(String s : list) {
			System.out.println(s);
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list);
	}

}
