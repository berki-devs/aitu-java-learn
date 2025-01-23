package assignments.Assignment_3;

public class task2 {
	public static void main(String[] args) {
		Duck duck = new Duck("Donald");
		duck.meetTheDuck();
		duck.fly();
		duck.eat();
		duck.move();
		duck.fly();
	}

	public interface Flyable {
		public void fly();
	}

	public interface Moveable {
		public void move();
	}

	public interface Eatable {
		public void eat();
	}

	public static class Duck implements Flyable, Eatable, Moveable {
		private String name;
		private boolean isHungry;

		public Duck(String name) {
			this.name = name;
			this.isHungry = true;
		}

		public void meetTheDuck() {
			System.out.println("Ducks name is " + this.name);
			System.out.println("He's " + (this.isHungry ? "hungry" : "fine") + "\n");
		}

		@Override
		public void eat() {
			if (!this.isHungry) {
				System.out.println(this.name + " is not hungry yet");
			} else {
				this.isHungry = false;
				System.out.println(this.name + " is eating something...");
			}
		}

		@Override
		public void fly() {
			if (this.isHungry) {
				System.out.println(this.name + " is too hungry to fly");
			} else {
				this.isHungry = true;
				System.out.println("Duck is flying");
			}
		}

		@Override
		public void move() {
			System.out.println("Duck is walking");
		}
	}

}