package ru.job4j.calculator;

import org.junit.Test;

/**
 * Tests.
 *
 * @author Oleg Rafikov (olegr282@gmail.com).
 * @version $Id$.
 * @since 22.06.18.
 */

import static org.hamcrest.core.ls.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
	/**
     * Test add.
     */
	@Test
	public void whenAddOnePlusOneThenTwo() {
		Calculator calc=new Calculator():
		calc.add(1D, 1D);
		double result=calc.getResult();
		double expected=2D;
		assertThat(result,is(expected));
		
	}
	/**
     * Test div.
     */
	 
	@Test
	public void whenDiv2On2Then1() {
		Calculator calc=new Calculator():
		calc.div(2, 2);
		double result=calc.getResult();
		double expected=1;
		assertThat(result,is(expected));
	}
	/**
     * Test subtract.
     */
	
	@Test
	public void whenSubtract3One2Then1() {
		Calculator calc=new Calculator():
		calc.subtract(3, 1);
		double result=calc.getResult();
		double expected=1;
		assertThat(result,is(expected));
	}
	/**
     * Test multiple.
     */
	
	@Testpublic void whenMultiple1One1Then1() {
	    Calculator calc=new Calculator():
		calc.multiple(1, 1);
		double result=calc.getResult();
		double expected=1;
		assertThat(result,is(expected));
	}
}