package depends;

import org.testng.annotations.Test;

public class DependsOnGroupTest {

	@Test(groups = "GroupOne")
	public void GroupOnetestCase() {
		System.out.println("Im from GroupOne testCase");
	}

	@Test(groups = "GroupTwo")
	public void GroupTwotestCase() {
		System.out.println("Im from GroupTwo testCase");
	}

}
