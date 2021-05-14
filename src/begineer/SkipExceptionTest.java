package begineer;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipExceptionTest {

	@Test
	public void skipExceptionTest() {

		boolean b = 5 == 5;
		if (b) {
			throw new SkipException("I'm Skipped Exception");
		} else {
			System.out.println("Im not skipped ");
		}
		System.out.println("Im test");

	}

}
