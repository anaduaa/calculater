package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTest {

	@Test
	 public void test() {
		add a = new add();
		double output = a.add(5,8);
		assertEquals(13,output);
	}

}
