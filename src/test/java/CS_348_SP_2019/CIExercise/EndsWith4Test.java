
package CS_348_SP_2019.CIExercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import CS_348_SP_2019.CIExercise.EndsWith4;

public class EndsWith4Test {

	@Test
	public void testToString() {
		EndsWith4 four = new EndsWith4();
		// add your name to the expected string, after the all the other names in the form John Smith\n
		assertEquals("EndsWith4 [names=Kyle LaPointe\n]", four.toString());
	}

}
