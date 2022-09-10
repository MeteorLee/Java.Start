package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		int rank = 2;
		char medalColor;
		
		switch(rank) {
			case 1: medalColor = 'G';
					break;
					// break가 빠지면 rank가 1이더라도 S가 출력됨
					// case2 까지 진행됨
			case 2: medalColor = 'S';
					break;

			case 3: medalColor = 'G';
					break;
		
			default: medalColor = 'A';
		}
		System.out.println(rank + "등 메달의 색깔은" + medalColor + "입니다.");
	}

}
