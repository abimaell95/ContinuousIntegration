package IntegracionJenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class RelationalOperatorTest {

	@Test
	public void isGreaterTest1() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isGreater(2, 3));
	}
	
	@Test
	public void isGreaterTest2() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.isGreater(2, 1));
	}
	
	@Test
	public void TestGreat() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isGreater(25, 25));
	}

	@Test
	public void isLessTest1() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.isLess(3, 4));
	}
	
	@Test
	public void isLessTest2() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isLess(5, 1));
	}
	
	@Test
	public void TestLess() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isLess(5, 5));
	}
}
