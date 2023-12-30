package OrangeHRM_TestCase;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import AppUtils.UtilsDemo;
import OrangeHRM_Libreary.Login;

public class AdminLoginTestWithInvalidData extends UtilsDemo
{
  
	 @Parameters({"ui","pwd"})
	@Test
	public void CheckAdminLogin(String ui , String pwd)
	{
		
		Login sanju = new Login();
		sanju.login(ui,pwd);
		
		    boolean ress = sanju.isErrMsgDisplayed();
		   Assert.assertTrue(ress);
		   
		
		
		
	}
	
	
	
}
