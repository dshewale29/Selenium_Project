package testNGAnnotations_Flags;

import org.testng.annotations.Test;

public class Flag5 {
  @Test(description = "performs login")
  public void loginMethod() {
	  System.out.println("loginMethod");
  }
  
  @Test(description = "performs create user", dependsOnMethods = "loginMethod")
  public void createUserMethod() {
	  System.out.println("createUserMethod");
  }
  
  @Test(description = "performs logout", dependsOnMethods = "createUserMethod" )
  public void logoutMethod() {
	  System.out.println("logoutMethod");
  }
}
