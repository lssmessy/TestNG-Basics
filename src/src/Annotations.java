package src;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void f() {
	  System.out.println("This is just a test case");
  }
  @Test
  public void test2(){
	  System.out.println("Second test case");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before any method");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After any method");
  }

  @BeforeTest
  public void initilizeBrowser() {
	  System.out.println("Opening browser");
  }

  @AfterTest
  public void destroyBrowser() {
	  System.out.println("Closing browser");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Objects are initilized");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Objects are destoyed");
  }

}
