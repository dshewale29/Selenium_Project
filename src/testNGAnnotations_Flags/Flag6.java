package testNGAnnotations_Flags;

import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups = "Functional TC")
  public void ft1() {
	  System.out.println("Functional TC1");
  }
  
  @Test(groups = "Integration TC1")
  public void it1() {
	  System.out.println("IntegrationSmoke TC1");
  }
  
  @Test(groups = "Smoke TC")
  public void st1() {
	  System.out.println("Smoke TC1");
  }
  
  //-------------------------------------------------
  
  @Test(groups = "Functional TC")
  public void ft2() {
	  System.out.println("Functional TC2");
  }
  
  @Test(groups = "Integration TC")
  public void it2() {
	  System.out.println("IntegrationSmoke TC2");
  }
  
  @Test(groups = "Smoke TC")
  public void st2() {
	  System.out.println("Smoke TC2");
  }
  
  //---------------------------------------------------
  
  @Test(groups = "Functional TC")
  public void ft3() {
	  System.out.println("Functional TC3");
  }
  
  @Test(groups = "Integration TC")
  public void it3() {
	  System.out.println("IntegrationSmoke TC3");
  }
  
  @Test(groups = "Smoke TC")
  public void st3() {
	  System.out.println("Smoke TC3");
  }
  
//---------------------------------------------------
  
  @Test(groups = "Functional TC")
  public void ft4() {
	  System.out.println("Functional TC4");
  }
  
  @Test(groups = "Integration TC")
  public void it4() {
	  System.out.println("IntegrationSmoke TC4");
  }
  
  @Test(groups = "Smoke TC")
  public void st4() {
	  System.out.println("Smoke TC4");
  }
  
//---------------------------------------------------
  
  @Test(groups = "Functional TC")
  public void ft5() {
	  System.out.println("Functional TC5");
  }
  
  @Test(groups = "Integration TC")
  public void it5() {
	  System.out.println("IntegrationSmoke TC5");
  }
  
  @Test(groups = "Smoke TC")
  public void st5() {
	  System.out.println("Smoke TC5");
  }
}
