package application;

import java.time.LocalDateTime;
import java.util.Locale;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		LocalDateTime data01 = LocalDateTime.now();
		String text1 = "Traveling to New Zealand";
		String content1 = "I'm going to visit this wonderful country!";
		int likes = 12;
		Post post1 = new Post(data01, text1, content1, likes);
		String comment1 = "Have a nice trip";
		String comment2 = "Wow that's awesome !";

		post1.AddComment(new Comment(comment1));
		post1.AddComment(new Comment(comment2));
		
		LocalDateTime data02 = LocalDateTime.now();
		String text2 = "Good night guys";
		String content2 = "See you tomorrow";
		int likes2 = 5;
		Post post2 = new Post(data02, text2, content2, likes2);
		String comment3 = "Good night";
		String comment4 = "May the Force be with you";

		post2.AddComment(new Comment(comment3));
		post2.AddComment(new Comment(comment4));
		
		System.out.println(post1);
		System.out.println(post2);
	}

}
