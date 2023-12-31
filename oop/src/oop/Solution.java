package oop;
//task0526

public class Solution {

	public static class Man {
		String name;
		int age;
		String address;
		public Man(String name, int age, String address) {
			super();
			this.name = name;
			this.age = age;
			this.address = address;
		}
		@Override
		public String toString() {
			return name + " " + age + " " + address;
		}
		
		
	}
	public static class Woman {
		String name;
		int age;
		String address;
		public Woman(String name, int age, String address) {
			super();
			this.name = name;
			this.age = age;
			this.address = address;
		}
		@Override
		public String toString() {
			return name + " " + age + " " + address;
		}
		
		
	}
}
