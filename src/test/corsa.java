package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class corsa {

	@Test
	void test() {
		corsaSelenium c = new corsaSelenium();
		if(c.test("75", "55") < 5) { // si risparmiano meno di 5 min
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
	}

}
