package org.animals.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.animals.Animal;
import org.animals.Lion;
import org.animals.Raven;
import org.animals.Snake;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AnimalsTests {
	
	private static Lion babyLion;
	private static Snake babySnake;
	private static Raven babyRaven;
	
	@BeforeAll
	static void beforeAll() {
		babyLion = new Lion("Benjamin", 10.0, 0.4, (byte)4, "milk")
				.hasPartner(false);
		
		babySnake = new Snake(true, 0.2, 0.2, (byte)0, "insects")
				.withColour("green");
		
		babyRaven = new Raven(0.1, 0.1, (byte)2, "worms")
				.hasEggs(false);
	}
	
	@Test
	public void testNotEqualsAnimals() {
		assertNotEquals(babyLion, babySnake);
	}

	@Test
	public void testEqualsAnimals() {
		Animal babyLionCopy = new Lion("Benjamin", 10.0, 0.4, (byte)4, "milk");
		assertEquals(babyLion, babyLionCopy);
	}
	
	@Test
	public void testToStringBabyRavenEquals() {
		String actual = babyRaven.toString();
		String expected = "Raven\n" +
				"Has eggs = false\n" +
				"Weight in kilos = 0.1\n" +
				"Length in meters = 0.1\n"+
				"Legs = 2\n" +
				"Favorite food = worms\n";
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void testToStringBabyRavenNotEquals() {
		String actual = babyRaven.toString();
		String unexpected = "Snake\n" +
				"Has hole = true\n" +
				"Weight in kilos = 0.2\n" +
				"Length in meters = 0.2\n"+
				"Legs = 0\n" +
				"Favorite food = insects\n";
		
		assertNotEquals(unexpected, actual);
	}

}
