package OrangeHRM_TestCase;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OrangeHRM_Libreary.AdminUtils;
import OrangeHRM_Libreary.UserRegistration;

public class UserRegistrationTest extends AdminUtils
{
	
	@Parameters({"role","empname","uname","pword"})
	@Test
    public void CheckUserRegistration(String role, String empname ,String uname, String pword) throws InterruptedException 
    {
		
    	UserRegistration san = new UserRegistration();
    	 boolean sanju =	san.addUser(role , empname ,uname ,pword);
    Assert.assertTrue(sanju);
    
    	
    	
    	
	}
	
	
	
	
	
}
