package array;

public class ArrayTest3 {
	public static void main (String[] args) {

	char[] alphabets = new char[26];
	
	char ch1 = 'A'; // 65
	
	for(int i=0; i < alphabets.length; i++, ch1++) {
		alphabets[i]  =ch1;
		System.out.println(alphabets[i]);
		}
	}
}