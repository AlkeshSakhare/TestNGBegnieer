package begineer;

import org.testng.annotations.Test;

public class IgnoreTest {

	@Test
	public void testCase1() {
		System.out.println("Im testCase1");
	}

	@Test(enabled = false)
	public void testCase2() {
		System.out.println("Im testCase2");
	}
}
