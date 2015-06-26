package src;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderExample {
  @Test(dataProvider = "dp")
  public void f(String username, String password) {
	  
	  System.out.println("username"+username+"=="+"password=="+password);
  }

  @DataProvider
  public Object[][] dp() {
	  
   Object[][] data=new Object[3][2]; 
   // 3 indicates number of rows and our @Test will execute that many times
   // 2 indicates number of columns and it indicates the number of parameters which will be passed to the @Test method
   
   data[0][0]="pritesh";
   data[0][1]="pritesh@123";
   
   data[1][0]="vivek";
   data[1][1]="vivek@123";
   
   data[2][0]="kevin";
   data[2][1]="kevin@123";
   
    return data;
  }
}
