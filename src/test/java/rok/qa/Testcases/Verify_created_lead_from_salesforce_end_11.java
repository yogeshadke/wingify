package rok.qa.Testcases;

import org.testng.annotations.Test;

import rok.qa.Utilities.BaseClass;
import rok.qaPageObject.Convert_Lead_into_account;
import rok.qaPageObject.Create_lead_from_salesforce_end;

public class Verify_created_lead_from_salesforce_end_11 extends BaseClass {

	@Test(groups = { "group1" })
	public void Create_lead_from_Salesforce_end() throws Exception {
		// openUrl

		Thread.sleep(8000);
		Create_lead_from_salesforce_end sfcrtlead = new Create_lead_from_salesforce_end(driver);
		sfcrtlead.leadcreatedfromSF();
		

	}

}
