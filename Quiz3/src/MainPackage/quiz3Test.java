package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class quiz3Test {

	@Test
	public void testGetPerimeter() {
		quiz3 tester = new quiz3();
		assertTrue("", tester.getArea() == Math.pow(0.1875,0.5));
	}

	@Test
	public void testGetArea() {
		quiz3 tester = new quiz3();
		assertTrue("",tester.getPerimeter() == 3);
	}

}
