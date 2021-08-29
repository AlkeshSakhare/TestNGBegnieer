package begineer;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = -1)
	public void testCaseNegativeOne() {
		System.out.println("This is testCaseNegativeOne");
	}
	@Test(priority = 0)
	public void testCasePriority0() {
		System.out.println("This is testCasePriority0");
	}

	@Test(priority = 1)
	public void testCasePriority1() {
		System.out.println("This is testCasePriority1");
	}

	@Test(priority = 2)
	public void testCasePriority2() {
		System.out.println("This is testCasePriority2");
	}

	@Test(priority = 3)
	public void testCasePriority3() {
		System.out.println("This is testCasePriority3");
	}
}
