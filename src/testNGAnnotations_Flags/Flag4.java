 package testNGAnnotations_Flags;

import org.testng.annotations.Test;

public class Flag4 {
  @Test(priority = -1)
  public void a() {
	  System.out.println("a");
  }
  
  @Test(priority = 1)
  public void d() {
	  System.out.println("d");
  }
  
  @Test(priority = 2)
  public void c() {
	  System.out.println("c");
  }
  
  @Test(priority = 2)
  public void h() {
	  System.out.println("h");
  }
  
  @Test(priority = 3)
  public void e() {
	  System.out.println("e");
  }
  
  @Test(priority = 4)
  public void w() {
	  System.out.println("w");
  }
  
  @Test(priority = 3)
  public void x() {
	  System.out.println("x");
  }
}