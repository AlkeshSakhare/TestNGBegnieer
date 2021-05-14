package grouping;

import org.testng.annotations.Test;

public class GroupTwo {
	@Test(groups = "smoke")
	public void GroupTwotestCase1() {
		System.out.println("Im from GroupTwo testCase1");
	}

	@Test
	public void GroupTwotestCase2() {
		System.out.println("Im from GroupTwo testCase2");
	}
}
