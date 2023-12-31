package oop;

public class Class0621 {

	class Cat {
		String name;
		Cat father;
		Cat mother;
		public Cat(Cat father, String name, Cat mother) {
			super();
			this.name = name;
			this.father = father;
			this.mother = mother;
		}
		public Cat(String name) {
			super();
			this.name = name;
			this.father = null;
			this.mother = null;
		}
		public Cat(Cat father, String name) {
			super();
			this.name = name;
			this.father = father;
			this.mother = null;
		}
		public Cat(String name, Cat mother) {
			super();
			this.name = name;
			this.mother = mother;
			this.father = null;
		}
		@Override
		public String toString() {
			if ((this.mother != null)&(this.father != null)) {
				return "The cat's name is " + this.name + ", father is " + this.father.name + ", mother is " + this.mother.name;
			} else if (this.mother != null) {
				return "The cat's name is " + this.name + " no father, mother is " + this.mother.name;
			} else if (this.father != null) {
				return "The cat's name is " + this.name + ", father is " + this.father.name + ", no mother";
			}
			return "The cat's name is " + name + ", no mother, no father";
			
		}
		
	}
}
