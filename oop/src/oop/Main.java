package oop;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle();
        System.out.println("task0521:\n" + circle.x + " " + circle.y + " " + circle.radius);
        Circle anotherCircle = new Circle(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
        Circle0521 circle0521 = new Circle0521();
        circle0521.color.setDescription("Red");
        System.out.println("task0523: " + circle0521.color.getDescription());
        System.out.println("task0525:");
        Cat cat1 = new Cat(2, "Madrid", "gris");
        Cat cat2 = new Cat(3, 4);
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        Dog dog1 = new Dog("Barbos", 3);
        Dog dog2 = new Dog("Olivia", 9);
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println("task0526:");
        Solution.Man man1 = new Solution.Man("George", 26, "New-York");
        Solution.Man man2 = new Solution.Man("Herman", 28, "La Plata");
        Solution.Woman woman1 = new Solution.Woman("Helen", 23, "Mexico");
        Solution.Woman woman2 = new Solution.Woman("Belen", 27, "Buenos Aires");
        System.out.println(man1.toString());
        System.out.println(man2.toString());
        System.out.println(woman1.toString());
        System.out.println(woman2.toString());
        System.out.println("task0532:");
        Class0532.N();
        Class0532.searchMax();
        System.out.println(Class0532.maxNumber);
        System.out.println("task0603:");
        for (int i = 0; i < 2; i++) {
        	Class0603 animal = new Class0603();
        	Class0603.Cats cat = animal.new Cats();
        	Class0603.Dogs dog = animal.new Dogs();
        	System.gc();
        }
        System.out.println("catCount = " + Cat.catCount);
        System.out.println("task0606:");
        System.out.println("How many evens and odds?");
        Class0606 class0606 = new Class0606();
        class0606.askNumber();
        if (class0606.userInput != null) {
        	class0606.todoIt(class0606.userInput);
        }
        System.out.println("task0609:");
        System.out.println("Distance (1, 25, -2, 3");
        System.out.println(Class0609.getDistance(1, 25, -2, 3));
        System.out.println("task0616:");
        Class0616 class0616 = new Class0616();
        class0616.todo();
        System.out.println("task0616:");
        Class0617 class0617 = new Class0617();
        class0617.todo();
        System.out.println("task0621:");
        Class0621 class0621 = new Class0621();
        Class0621.Cat cat11 = class0621.new Cat("Abuelo Diego");
        Class0621.Cat cat12 = class0621.new Cat("Abuela Naranjita");
        Class0621.Cat cat21 = class0621.new Cat(cat11, "Padre Alberto" );
        Class0621.Cat cat22 = class0621.new Cat("Madre Markiza", cat12);
        Class0621.Cat cat31 = class0621.new Cat(cat21, "Hijo Purrito", cat22);
        Class0621.Cat cat32 = class0621.new Cat(cat21, "Hija Purrita", cat22);
        System.out.println(cat11.toString());
        System.out.println(cat12.toString());
        System.out.println(cat21.toString());
        System.out.println(cat22.toString());
        System.out.println(cat31.toString());
        System.out.println(cat32.toString());
        System.out.println("task0621:");
        Class0622 class0622 = new Class0622();
        class0622.doIt();
	}

}
