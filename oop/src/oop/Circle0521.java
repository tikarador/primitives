package oop;
//task0523

public class Circle0521 {

	public Color color;

	public Circle0521() {
		this.color = new Color();
	}

	public class Color {
		String description;

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}
}