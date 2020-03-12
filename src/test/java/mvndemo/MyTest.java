package mvndemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
	
	@Test
	public void add() {
		
		MyCalculator<Integer, Integer, Integer> calculator = new MyCalculator<Integer, Integer,Integer>(1,2);
		int added = calculator.calculate((x, y) -> x + y);
		Assert.assertEquals(added, 3);
	}
	
	@Test
	public void multiply() {
		
		MyCalculator<Integer, Integer, Integer> calculator = new MyCalculator<Integer, Integer,Integer>(2,2);
		int multiplied = calculator.calculate((x, y) -> x * y);
		Assert.assertEquals(multiplied, 4);
	}
}
