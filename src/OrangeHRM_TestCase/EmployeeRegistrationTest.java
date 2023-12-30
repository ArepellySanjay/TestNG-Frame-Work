package OrangeHRM_TestCase;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AppUtils.UtilsDemo;
import OrangeHRM_Libreary.AdminUtils;
import OrangeHRM_Libreary.EmpRegistration;



public class EmployeeRegistrationTest extends AdminUtils
{
	@Parameters({"fname","lname"})
     @Test
	public void CheckEmpReg(String fname, String lname) 
	{
	
    	 EmpRegistration sun = new EmpRegistration();
    	boolean res = sun.addemployee(fname,  lname);
		
    	Assert.assertTrue(res);
    	
	}
	
	
	
	
}
