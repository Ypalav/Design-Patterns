package com.plateonfire;

public class CharacterFactory {

	public static Character getCharacter(String character) {
		if (character.equalsIgnoreCase("spiderman")) {
			return SpiderMan.getCharcter();
		}
		if (character.equalsIgnoreCase("superman")) {
			return SuperMan.getCharcter();
		}
		if (character.equalsIgnoreCase("flash")) {
			return Flash.getCharcter();
		}
		return null;
	}
}
