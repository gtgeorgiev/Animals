package org.animals;

public class Snake extends Animal implements Reptile {

	private boolean hasHole;
	private String colour;
	
	public Snake(boolean hasHole, double weightInKilos, double lengthInMeters, byte legs, String favoriteFood) {
		super(weightInKilos, lengthInMeters, legs, favoriteFood);
		this.setHasHole(hasHole);
	}

	@Override
	public String sound() {
		return "Sss-sss";
	}

	@Override
	public String drag() {
		return "Snaking whole body";
	}

	public Snake withColour(String colour) {
		this.colour = colour;
		return this;
	}
	
	@Override
	public String toString() {
		return "Snake" + "\n" +
				"Has hole = " + hasHole() + "\n" +
				"Weight in kilos = " + getWeightInKilos() + "\n" +
				"Length in meters = " + getLengthInMeters() + "\n" +
				"Legs = " + getLegs() + "\n" +
				"Favorite food = " + getFavoriteFood() + "\n";
	}

	public boolean hasHole() {
		return hasHole;
	}

	public void setHasHole(boolean hasHole) {
		this.hasHole = hasHole;
	}

}
