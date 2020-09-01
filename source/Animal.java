package org.animals;

public abstract class Animal {
	
	private double weightInKilos;
	private double lengthInMeters;
	private byte legs;
	private String favoriteFood;
	
	public Animal(double weightInKilos, double lengthInMeters, byte legs, String favoriteFood) {
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

	public void setWeightInKilos(double weightInKilos) throws IllegalArgumentException {
		if (weightInKilos > 0) {
			this.weightInKilos = weightInKilos;
		} else {
			throw new IllegalArgumentException("Incorrect value: " + weightInKilos);
		}
	}

	public double getLengthInMeters() {
		return lengthInMeters;
	}

	public void setLengthInMeters(double lengthInMeters) throws IllegalArgumentException {
		if (lengthInMeters > 0) {
			this.lengthInMeters = lengthInMeters;
		} else {
			throw new IllegalArgumentException("Incorrect value: " + legs);
		}
	}

	public byte getLegs() {
		return legs;
	}

	public void setLegs(byte legs) throws IllegalArgumentException {
		if (legs >= 0) {
			this.legs = legs;
		} else {
			throw new IllegalArgumentException("Incorrect value: " + legs);
		}
		
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

}
