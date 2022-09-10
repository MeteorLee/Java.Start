package array;

public class EnhancedFor {

	public static void main(String[] args) {

		String[] strArr = {"Java", "Android", "C"};
		
		for(int i = 0; i< strArr.length; i++) {
		System.out.println(strArr[i]);
		}
		
		for (String s : strArr) { // s = strArr[i]라는 의미
			System.out.println(s);
		}
			
		int[] arr = {1,2,3,4,5};
		
		for (int num : arr) { // num = arr[i]라는 의미
			System.out.println(num);
		}
			
	}

}
