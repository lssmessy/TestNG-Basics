package src;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

	@Test
	// this indicates that the following function is a test case
	public void test1() {
		System.out.println("===Day1 Testcase===");
	}

	@BeforeMethod
	public void beforeTest() {
		System.out.println("===Before test===");
		throw new SkipException("Skkiped due to some reason");
	}

}
