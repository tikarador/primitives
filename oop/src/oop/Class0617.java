package oop;

public class Class0617 {

	public static void todo() {
		printIdea(new Idea());
	}
	public static void printIdea(Idea idea) {
		System.out.println(idea.getDescription());
	}
	public static class Idea {
		public String getDescription() {
			return "Idea's description from 0617";
		}
	}
}
