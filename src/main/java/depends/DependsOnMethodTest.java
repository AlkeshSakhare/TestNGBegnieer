package depends;

import org.testng.annotations.Test;

public class DependsOnMethodTest {
	@Test
	public void testCase1() {
		System.out.println(5 / 0);
		System.out.println("Im from testCase1");
	}

	@Test(dependsOnMethods = "testCase1")
	public void testCase2() {
		System.out.println("Im testCase2 depends on testCase1 ");
	}
}
