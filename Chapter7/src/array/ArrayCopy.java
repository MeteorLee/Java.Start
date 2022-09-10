//배열 복사하기
//
//기존 배열과 같은 배열을 만들거나 배열이 꽉 찬 경우 더 큰 배열을 만들고 기존 배열 자료를 복사할 수 있습니다.
//System.arraycopy(src,srcPos,dest,destPos,length);
//src = 복사할 배열 이름
//srcPos = 복사할 배열의 첫 번째 위치
//dest = 복사해서 붙여 넣을 대상 배열 이름
//destPos = 복사해서 대상 배열에 붙여 넣기를 시작할 첫 번째 위치
//length = src에서 dest로 자료를 복사할 요소 개수


package array;

public class ArrayCopy {

	public static void main(String[] args) {

		int[] array1 = {1,2,3,4,5};
		int[] array2 = {10 , 20, 30, 40, 50};
		
		System.arraycopy(array1, 0, array2, 2, 3);
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
	

}
