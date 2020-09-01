package org.animals;
public class Raven extends Animal implements Bird{

	private boolean hasEggs;
	
	public Raven() {
		super(0.3, 0.2, (byte)2, "worms");
	}
	
	public Raven(double weightInKilos, double lengthInMeters, byte legs, String favoriteFood) {
		super(weightInKilos, lengthInMeters, legs, favoriteFood);
	}

	@Override
	public String sound() {
		return "Graa-graa";
	}

	@Override
	public String fly() {
		return "Flying with wings";
	}

	@Override
	public String toString() {
		return "Raven" + "\n" +
				"Has eggs = " + hasEggs() + "\n" +
				"Weight in kilos = " + getWeightInKilos() + "\n" +
				"Length in meters = " + getLengthInMeters() + "\n" +
				"Legs = " + getLegs() + "\n" +
				"Favorite food = " + getFavoriteFood() + "\n";
	}

	public boolean hasEggs() {
		return hasEggs;
	}

	public Raven hasEggs(boolean hasEggs) {
		this.hasEggs = hasEggs;
		return this;
	}

}
