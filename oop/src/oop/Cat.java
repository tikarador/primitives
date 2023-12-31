package oop;

//task0517
public class Cat {

	public String name;
	public int age;
	public int weight;
	public String address;
    public String color;
    static int catCount = 0;
	public Cat(String name) {
		super();
		this.name = name;
		this.age = 3;
		this.weight = 3;
		this.color = "black-white";
		catCount++;
	}
	public Cat(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.color = "black-white";
		catCount++;
	}
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.weight = 3;
		this.color = "black-white";
		catCount++;
	}
	public Cat(int age, int weight) {
		super();
		this.age = age;
		this.weight = weight;
		this.color = "black-white";
		catCount++;
	}
	public Cat(int age, String address, String color) {
		super();
		this.age = age;
		this.address = address;
		this.color = color;
		this.weight = 3;
		catCount++;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", weight=" + weight + ", address=" + address + ", color=" + color
				+ "]";
	}
	public static int getCatCount() {
		return catCount;
	}
	public static void setCatCount(int catCount) {
		Cat.catCount = catCount;
	}
	
}
