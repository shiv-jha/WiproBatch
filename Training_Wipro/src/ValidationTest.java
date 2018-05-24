import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTest {
	
  @Test
  public void mobNoLength() {
	  boolean returnval1=Validate.validateMobileNo("1234");
	  Assert.assertEquals(returnval1,false);
	  boolean returnval2=Validate.validateMobileNo("1234567890");
	  Assert.assertEquals(returnval2,true);
	  
	  boolean returnval3=Validate.validateMobileNo("abcdefghqw");
	  Assert.assertEquals(returnval3,false);
	 // System.out.println(returnval);
  }
}
