package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import entities.Comment;
import entities.Post;

public class Program {
	
public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow tha's awesome!");
		
		Post p1 = new Post(
				sdf.parse("07/10/2024 10:56:38"),
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country",
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Good night!");
		Comment c4 = new Comment("May the force be with you");
		Comment c5 = new Comment("Always remeber my friend: with great power comes great responsability");
		
		Post p2 = new Post(
				sdf.parse("17/11/2024 19:22:29"),
				"Good night guys",
				"See you tomorrow",
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		p2.addComment(c5);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
