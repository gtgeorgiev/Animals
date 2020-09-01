package org.animals;

public class Lion extends Animal implements Mammal {

	private String name;
	private boolean hasPartner;
	
	public Lion(String name, double weightInKilos, double lengthInMeters, byte legs, String favoriteFood) {
		super(weightInKilos, lengthInMeters, legs, favoriteFood);
		this.setName(name);
	}

	@Override
	public String sound() {
		return "Roar-roar";
	}

	@Override
	public String walk() {
		return "Wolking on paws";
	}

	@Override
	public String toString() {
		return "Lion" + "\n" +
				"Name = " + getName() + "\n" +
				"Weight in kilos = " + getWeightInKilos() + "\n" +
				"Length in meters = " + getLengthInMeters() + "\n" +
				"Legs = " + getLegs() + "\n" +
				"Favorite food = " + getFavoriteFood() + "\n";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Lion hasPartner(boolean hasPartner) {
		this.hasPartner = hasPartner;
		return this;
	}
}
