package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;
import pkgCore.Roll;

public class RollTest {

	@Test
	public void TestRoll() {

		for (int a = 0; a < 10000; a++) {
			Roll r = new Roll();
			assertTrue(2 <= r.getScore() && r.getScore() <= 12);
			
		}

	}

}
