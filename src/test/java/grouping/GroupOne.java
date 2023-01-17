package grouping;

import org.testng.annotations.Test;

public class GroupOne {
	@Test
	public void GroupOnetestCase1() {
		System.out.println("Im from GroupOne testCase1");
	}

	@Test(groups = "smoke")
	public void GroupOnetestCase2() {
		System.out.println("Im from GroupOne testCase2");
	}
}
