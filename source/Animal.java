package org.animals;

public abstract class Animal {
	
	private double weightInKilos;
	private double lengthInMeters;
	private int legs;
	private String favoriteFood;
	
	public Animal(double weightInKilos, double lengthInMeters, int legs, String favoriteFood) {
		this.setWeightInKilos(weightInKilos);
		this.setLengthInMeters(lengthInMeters);
		this.setLegs(legs);
		this.setFavoriteFood(favoriteFood);
	}

	public abstract String sound();
	
	@Override
	public String toString() {
		return "Lion" + "\n" +
				"Weight in kilos = " + getWeightInKilos() + "\n" +
				"Length in meters = " + getLengthInMeters() + "\n" +
				"Legs = " + getLegs() + "\n" +
				"Favorite food = " + getFavoriteFood() + "\n";
	};
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((favoriteFood == null) ? 0 : favoriteFood.hashCode());
		result = prime * result + Float.floatToIntBits(legs);
		return result;
	}
	
	public String sleep() {
		return "Zzzz";
	}

	public double getWeightInKilos() {
		return weightInKilos;
	}

	public void setWeightInKilos(double weightInKilos) {
		this.weightInKilos = weightInKilos;
	}

	public double getLengthInMeters() {
		return lengthInMeters;
	}

	public void setLengthInMeters(double lengthInMeters) {
		this.lengthInMeters = lengthInMeters;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

}
