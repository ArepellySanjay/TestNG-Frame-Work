package OrangeHRM_TestCase;

import org.testng.annotations.Test;

import AppUtils.UtilsDemo;
import OrangeHRM_Libreary.Login;

public class test5 extends UtilsDemo
{

	@Test
	public void Test5() 
	{
		
	 Login san = new Login();
    san.login("Admin", "Qedge123!@#");
		
 
 
 
 
	}
}
