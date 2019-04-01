package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(2, calc.add(1, 1));
	}
	
	@Test
	public void testSubtract() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(2, calc.subtract(5, 3));
	}
	
	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(2, calc.multiply(2, 1));
	}
	
	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(2, calc.divide(2, 1));
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivideByZero() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(2, calc.divide(2, 0));
	}
	
	Test
	public void testSquare() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(4, calc.square(2));
	}
}
