package rok.qaPageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.awt.event.KeyEvent;
import java.time.Duration;
import rok.qa.Utilities.FileUploadUsingRobot;
import rok.qa.Utilities.Wrappers;
import wrapperforweb.Webwait;

public class Home_page {
	WebDriver ldriver;

	public Home_page(WebDriver rdriver) {
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);
	}

	// 2.identify WebElement
	@FindBy(xpath = "//table[@id="transactionsTable"]//th[@id="amount"]")
	WebElement clickonAmount;
	
//3.create method to operations
	public void verifyhomepage() throws Exception {

		Wrappers.clickJS(clickonAmount);
		Assert.assertTrue(Amount, "Amount");
		

	}

}
