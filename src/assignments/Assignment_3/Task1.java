package assignments.Assignment_3;

public class Task1 {
	public static void main(String[] args) {
		FighterJet aircraft = new FighterJet("SU-25");
		aircraft.setCargoCapacity(4300);
		aircraft.setBombs(10);
		aircraft.setRockets(15);
		aircraft.getInfo();

		System.out.println();
		aircraft.setAltitude(5000);

		aircraft.takeOff();
		aircraft.fly();
		aircraft.land();
	}

	public interface Flyable {
		void takeOff();

		void fly();

		void land();
	}

	public abstract static class Plane implements Flyable {
		private String model;
		private int altitude;

		public Plane(String model) {
			this.model = model;
			this.altitude = 0;
		}

		public String getModel() {
			return model;
		}

		public void setAltitude(int altitude) {
			if (altitude < 1000) {
				this.altitude = 1000;
			} else {
				this.altitude = altitude;
			}
		}

		@Override
		public void takeOff() {
			if (altitude == 0) {
				setAltitude(1000);
			}
			System.out.println(model + " is taking off");
		}

		@Override
		public void fly() {
			if (this.altitude > 0) {
				System.out.println(model + " is flying at " + altitude + " km");
			} else {
				System.out.println(model + " needs to take off first");
			}
		}

		@Override
		public void land() {
			if (altitude > 0) {
				System.out.println(model + " is landing");
				altitude = 0;
			} else {
				System.out.println(model + " is already on the ground");
			}
		}
	}

	public static class FighterJet extends Plane {
		private static int BOMB_WEIGHT = 200;
		private static int ROCKET_WEIGHT = 150;
		private int cargoCapacity;
		private int bombs;
		private int rockets;

		public FighterJet(String model) {
			super(model);
			this.cargoCapacity = 0;
			this.bombs = 0;
			this.rockets = 0;
		}

		public int getCargoCapacity() {
			return cargoCapacity;
		}

		public void setCargoCapacity(int capacity) {
			if (capacity < 0) {
				return;
			}
			this.cargoCapacity = capacity;
		}

		public int getBombs() {
			return bombs;
		}

		public void setBombs(int bombs) {
			if (bombs < 0) {
				return;
			}
			int totalWeight = (bombs * BOMB_WEIGHT) + (this.rockets * ROCKET_WEIGHT);
			if (totalWeight <= cargoCapacity) {
				this.bombs = bombs;
			} else {
				System.out.println("Carrying capacity exceeded when adding bombs\n");
			}
		}

		public int getRockets() {
			return rockets;
		}

		public void setRockets(int rockets) {
			if (rockets < 0) {
				return;
			}
			int totalWeight = (this.bombs * BOMB_WEIGHT) + (rockets * ROCKET_WEIGHT);
			if (totalWeight <= cargoCapacity) {
				this.rockets = rockets;
			} else {
				System.out.println("Carrying capacity exceeded when adding missiles\n");
			}
		}

		public void getInfo() {
			System.out.println("Fighter Jet Model: " + getModel());
			System.out.println("Cargo Capacity: " + getCargoCapacity() + " kg");
			System.out.println("Current Bombs: " + getBombs());
			System.out.println("Current Rockets: " + getRockets());
			System.out.println("Total Weight of Weapons: " + ((getBombs() * BOMB_WEIGHT) + (getRockets() * ROCKET_WEIGHT)) + " kg");
		}
	}
}
