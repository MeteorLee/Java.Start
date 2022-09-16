package problem;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {

		ArrayList<Post> postList = new ArrayList<Post>();
		int no = 0; // 글 번호
		int in = 0; // 입력받는 숫자

		
		
		while(true) {
			
			
			
			System.out.print("1.전체리스트 2.등록 0.종료>");
			
			Scanner sc = new Scanner(System.in);
			in = sc.nextInt();
			
			if (in == 0) {  // 종료
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			switch (in) {   
			case 1: 		// 전체리스트
				System.out.println("== 게시물 리스트 ==");
				System.out.println("no                title                 date ");
				for(Post post : postList) {
					System.out.printf("%1d %21s %21s %n", post.no, post.title, post.time);
				}
				continue;
				
			case 2:			// 등록
				Post post = new Post();
				
				no++;
				post.no = no;
				
				System.out.print("제목 : ");
				Scanner sc1 = new Scanner(System.in);
				String title = sc1.nextLine();
				post.setTitle(title);
				
				System.out.print("작성자 : ");
				Scanner sc2 = new Scanner(System.in);
				String author = sc2.nextLine();
				post.setAuthor(author);
				
				postList.add(post);
				post = null;
				System.out.println("글이 추가 되었습니다.");
				continue;
				
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
			}
			
		}
}

