package rok.qaPageObject;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import rok.qa.Utilities.FileUploadUsingRobot;
import rok.qa.Utilities.Wrappers;

public class Create_lead_from_salesforce_end {
	public static String titlesave;
	public WebDriver ldriver;
	WebDriverWait wait;
	Duration timeoutsec;

	public Create_lead_from_salesforce_end(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// 2.identify WebElement
	@FindBy(xpath = "//input[@type='email']")
	WebElement sfemail;
	@FindBy(xpath = "//input[@type='password']")
	WebElement sfpassword;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement sfsubit;
	@FindBy(xpath = "//a[@class='slds-context-bar__label-action dndItem']//span[contains(text(),'Leads')]")
	WebElement ClickonLead;
	@FindBy(xpath = "//li[@class='slds-button slds-button--neutral']//div[contains(text(),'New')]")
	WebElement clickonnew;
	@FindBy(xpath = "//div[@class='forceChangeRecordTypeFooter']//span[contains(text(),'Next')]")
	WebElement clickonnex;
	@FindBy(xpath = "//input[@name='Company']")
	WebElement entercmp;
	@FindBy(xpath = "//input[@name='firstName']")
	WebElement enter1stname;
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement enterlastname;
	@FindBy(xpath = "//input[@name='Email']")
	WebElement enteremailid;
	@FindBy(xpath = "//input[@name='MobilePhone']")
	WebElement entermobileno;
	@FindBy(xpath = "//span[contains(text(),'720+')]")
	WebElement selectscore;
	@FindBy(xpath = "//button[@class=\"slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value\"and@aria-label=\"Credit Score Range (Form) - Current Selection: --None--\"]")
	WebElement clcioncridit;
	@FindBy(xpath = "(//input[@placeholder='Search Accounts...'])[1]")
	WebElement selectRP;
	@FindBy(xpath = "//div[@class='center-align-buttons']//button[@name='SaveEdit']")
	WebElement clickonsave;
	@FindBy(xpath = "//li[@title='Form/Files']")
	WebElement clickonfiles;
	@FindBy(xpath = "//div[@class='slds-align_absolute-center cShowAllfiles']//div[@part='file-selector']")
	WebElement clickonuploadfiles;
	@FindBy(xpath = "//div[@class='modal-footer slds-modal__footer']//span[contains(text(),'Done')]	")
	WebElement clickonsavefiles;
	@FindBy(xpath = "//*[contains(text(),'roktesingRP')]")
	WebElement selectRPfromdp;
	@FindBy(xpath = "//a[@data-label='Notes']")
	WebElement clickonnotes;
	@FindBy(xpath = "(//div[@class='container forceRelatedListSingleContainer']//a[@role='button'])[2]")
	WebElement clickonnotesdrop;
	@FindBy(xpath = "//a[@data-target-selection-name='sfdc:StandardButton.AttachedContentNote.NewNote']")
	WebElement clickonnotesnew;
	@FindBy(xpath = "//input[@placeholder='Untitled Note']")
	WebElement clickonnotestitle;
	@FindBy(xpath = "//div[@aria-label='Compose text']//p")
	WebElement clickonnotesdscrip;
	@FindBy(xpath = "//button[contains(text(),'Done')]")
	WebElement clickonnotesdone;
//	@FindBy(xpath = "//slot[@class='slds-page-header__title slds-m-right--small slds-align-middle clip-text slds-line-clamp']")
//	WebElement title;

	@FindBy(xpath = "//slot[@class='slds-page-header__title slds-m-right--small slds-align-middle clip-text slds-line-clamp']/lightning-formatted-name")
	WebElement title;

	public void leadcreatedfromSF() throws InterruptedException {

		ldriver.get("https://rok--rokcommqa.sandbox.lightning.force.com/");
		sfemail.sendKeys("testaress12july@yopmail.com");
		sfpassword.sendKeys("Aress@123");
		sfsubit.click();
	}

//	public static String getLeadTitle() {
//		titlesave = title.getText();
//			return titlesave;
//		
//	}
	public void createleadfromSF() throws InterruptedException, AWTException {

		Wrappers.clickJS(ClickonLead);
		Wrappers.clickJS(clickonnew);
		Wrappers.clickJS(clickonnex);
		entercmp.sendKeys("roktest123");
		enter1stname.sendKeys(Wrappers.generateUniqueString());
		enterlastname.sendKeys("finance2");
		enteremailid.sendKeys(Wrappers.generateUniqueString() + "@yopmail.com");
		entermobileno.sendKeys("1234567890");
		Wrappers.clickJS(clcioncridit);
		selectRP.sendKeys("roktestingRP");

		Thread.sleep(5000);
		Wrappers.clickJS(selectRPfromdp);
		Wrappers.clickJS(selectscore);
		Wrappers.clickJS(clickonsave);
		Thread.sleep(8000);
		Wrappers.clickJS(clickonfiles);
		Thread.sleep(8000);
		FileUploadUsingRobot obje = new FileUploadUsingRobot();
		String fileP = "D:\\pdf test3.pdf";
		obje.robotfileupload(clickonuploadfiles, fileP);
		Thread.sleep(10000);
		Wrappers.clickJS(clickonsavefiles);
		Thread.sleep(5000);
		Wrappers.clickJS(clickonnotes);
		Thread.sleep(5000);
		Wrappers.clickJS(clickonnotesdrop);
		Thread.sleep(5000);
		Wrappers.clickJS(clickonnotesnew);
		Thread.sleep(6000);
		clickonnotesdscrip.sendKeys(Wrappers.generateUniqueString());
		Thread.sleep(6000);
		clickonnotestitle.sendKeys(Wrappers.generateUniqueString());
		Wrappers.clickJS(clickonnotesdone);
		Thread.sleep(6000);
		titlesave = title.getText();
		System.out.println(titlesave);
	}

}
