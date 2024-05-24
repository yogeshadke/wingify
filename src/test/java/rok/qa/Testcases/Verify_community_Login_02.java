package rok.qa.Testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import rok.qa.Utilities.BaseClass;
import rok.qaPageObject.Community_Login;



public class Verify_community_Login_02 extends BaseClass {

	@Test
	public void VerfyLogin() throws InterruptedException {
		// openUrl
		driver.get(url);

		//test.info("Url opened");
		Community_Login pg = new Community_Login(driver);
		pg.passdata(username, password);
		

	}
}