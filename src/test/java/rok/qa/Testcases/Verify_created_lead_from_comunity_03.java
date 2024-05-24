//package rok.qa.Testcases;
//
//import org.apache.poi.ss.formula.ptg.Ptg;
//import org.testng.annotations.Test;
//
//import rok.qaPageObject.Dashboad_Lead;
//import rok.qaPageObject.IndexPage;
//import rok.qaPageObject.NewLeads;
//
//public class CreateLeads_Testcase_03 extends BaseClass {
//	@Test(groups = "group1")
//	public void VerfyLead() throws InterruptedException {
//		// openUrl
//		driver.get(url);
//		logger.info("Url opened");
//		Thread.sleep(5000);
//		IndexPage pg =new IndexPage(driver);
//		pg.passdata(username,password);
//		Dashboad_Lead Dl = new Dashboad_Lead(driver);
//		Dl.clickonlead();
//		Thread.sleep(5000);
//		NewLeads newleads = new NewLeads(driver);
//		newleads.creatnewlead();
//
//	}
//
//}

package rok.qa.Testcases;

import org.testng.annotations.AfterMethod;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import rok.qa.Utilities.BaseClass;
import rok.qaPageObject.Add_BF_New_Lead_From_Community;
import rok.qaPageObject.Community_Login;

public class Verify_created_lead_from_comunity_03 extends BaseClass {

	@Test(groups = { "group1" })
	public void Create_new_BF_lead_from_community() throws InterruptedException {
		// openUrl
		driver.get(url);
		//logger.info("Url opened");
		Thread.sleep(5000);
		Community_Login pg = new Community_Login(driver); // Pass the driver instance to the constructor
		pg.passdata(username, password);
		Thread.sleep(5000);
		Add_BF_New_Lead_From_Community newleads = new Add_BF_New_Lead_From_Community(driver);
		newleads.creatnewlead();
	}
}
