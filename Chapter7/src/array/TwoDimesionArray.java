package array;

public class TwoDimesionArray {

	public static void main(String[] args) {

		int[][] arr = new int[2][3];
		
		System.out.println(arr.length);
		// 행의 길이를 나타냄
		System.out.println(arr[0].length);
		// 열의 길이를 나타냄
		
		int[][] arr2 = {{1,2,3},{4,5,6,}};
		
		for (int i = 0 ; i < arr2.length; i++) {
			for(int j = 0 ; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]); // 0.0 ~ 0.2 / 1.0 ~ 1.2
			}
		}
		
		char[][] alphabets = new char[13][2];
		char ch = 'A';
		
		for(int i = 0; i < alphabets.length; i++) {
			for(int j = 0; j < alphabets[i].length; j++,ch++) {
				alphabets[i][j] = ch;
				System.out.println(alphabets[i][j]);
			}
		}
		
		
		
	}

}
