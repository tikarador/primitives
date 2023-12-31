package oop;

public class Class0603 {

	public Cats cat;
	public Dogs dog;
	public class Cats {
		protected void finalize() {
			System.out.println("A Cat was destroyed");
		}
	}
	public class Dogs {
		protected void finalize() {
			System.out.println("A Dog was destroyed");
		}
	}
}
