package begineer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SequenceAnnotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Im in @BeforeSuite");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("Im in @BeforeTest");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("Im in @BeforeClass");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Im in @BeforeMethod");
	}

	@Test
	public void Test1() {
		System.out.println("Im in @Test1");
	}

	@Test
	public void Test2() {
		System.out.println("Im in @Test2");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("Im in @AfterMethod");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("Im in @AfterClass");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("Im in @AfterTest");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("Im in @AfterSuite");
	}

}
