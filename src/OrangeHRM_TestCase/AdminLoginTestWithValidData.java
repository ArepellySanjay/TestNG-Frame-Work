package OrangeHRM_TestCase;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AppUtils.UtilsDemo;
import OrangeHRM_Libreary.Login;

public class AdminLoginTestWithValidData extends UtilsDemo
{
	
	@Parameters({"adminui","adminpwd"})
	@Test
	public void CheckAdminLogin(String ui ,String pwd) 
	{
		
		 Login ram = new Login();
		 ram.login(ui, pwd);
	     
	     boolean res =	ram.isdisplayed();
	     Assert.assertTrue(res);
	     ram.logout();
	
	
	
	}
	
	
	
	
	
	
	

}
