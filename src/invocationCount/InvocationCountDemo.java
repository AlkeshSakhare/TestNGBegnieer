package invocationCount;

import org.testng.annotations.Test;

public class InvocationCountDemo {

	@Test(invocationCount = 5)
	public void testCaseOne() {

		System.out.println("Im running testCaseOne");
	}
}
