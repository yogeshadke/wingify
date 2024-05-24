package rok.qa.Testcases;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;



import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import rok.qa.Utilities.BaseClass;




public class Verify_wingify_Login_02 extends BaseClass {

	@Test
	public void VerfyLogin() throws InterruptedException {
		// openUrl
		driver.get(url);

		//test.info("Url opened");
		wingify_Login pg = new wingify_Login(driver);
		pg.Loginpassdata(username, password);
		

	}
}