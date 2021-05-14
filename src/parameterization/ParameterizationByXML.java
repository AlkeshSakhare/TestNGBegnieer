package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationByXML {

	@Test
	@Parameters("browser")
	public void getBrowser(String browser) {

		if (browser.equals("chrome")) {
			System.out.println("browser: " + browser);
		} else {
			System.out.println("browser: " + browser);
		}
	}
}
