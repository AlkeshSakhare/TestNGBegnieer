package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnno {

	@Test(dataProvider = "getData")
	public void showData(String UserName, String Password) {
		System.out.println("UserName: " + UserName);
		System.out.println("Password: " + Password);
	}

	@DataProvider
	public Object[][] getData() {

		Object object[][] = new Object[2][2];
		object[0][0] = "FirstUser";
		object[0][1] = "FirstPass";
		object[1][0] = "SecondUser";
		object[1][1] = "SecondPass";
		return object;
	}
}
