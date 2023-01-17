package begineer;

import org.testng.annotations.Test;

public class ExpeExceptionTest {

	@Test(expectedExceptions = ArithmeticException.class)
	public void getData() {
		System.out.println(10 / 0);
		System.out.println("In getData");
	}

	@Test
	public void showData() {
		System.out.println("In showData");
	}
}
