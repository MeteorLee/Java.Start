package problem;

import java.time.LocalDate;

public class Post {

	int no;
	String title;
	String author;
	LocalDate time;
	
	public Post() {
		this.time = LocalDate.now();
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
