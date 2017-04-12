package com.oodp.plateoffire;

import com.oodp.plateoffire.Character;
import com.oodp.plateoffire.CaptainAmerica;
import com.oodp.plateoffire.Batman;
import com.oodp.plateoffire.Ironman;;

public class CharacterFactory {
	public static Character getCharacter(String character) {
		if (character.equalsIgnoreCase("captainAmerica")) {
			return CaptainAmerica.getCharacter();
		}
		if (character.equalsIgnoreCase("batman")) {
			return Batman.getCharacter();
		}
		if (character.equalsIgnoreCase("ironman")) {
			return Ironman.getCharacter();
		}
		return null;
	}
}
