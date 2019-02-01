package Android;

import static org.junit.Assert.*;

import org.junit.Test;

import Calculate.Addition;
import Calculate.Division;
import Calculate.Multiplication;
import Calculate.Subtraction;

public class JUnitTest {

	@Test
	public void testMultiply() {
		Multiplication test = new Multiplication();
		int multiplication = test.multiplication(2, 5);
		assertEquals(10, multiplication);
	}
	
	@Test
	public void testSubtract() {
		Subtraction test = new Subtraction();
		int subtraction = test.subtraction(2, 2);
		assertEquals(5, subtraction);
	}
	
	@Test
	public void testDivision() {
		Division test = new Division();
		int division = test.division(2,2);
		assertEquals(1, division);
	}
	
	@Test
	public void testAddition() {
		Addition test = new Addition();
		int division = test.addition(2,2);
		assertEquals(4, division);
	}

}
