package labo3;

import static org.junit.Assert.*;
import org.junit.Test;

public class PetitProjetTest {

	@Test
	public void maMethodeCalculTest() {
		int resultat = PetitProjet.maMethodeCalculAddition(4, 6);
		assertEquals(resultat, 10);
	}
}
