package frmWrk1_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import frmWrk1_Utility.FrmWrk1_Base;

@CucumberOptions(features = {"src/test/resource/frmWrk1_Feature"},
plugin = {"json:target/cucumber.json"}, // Generate HTML reports
glue = "frmWrk1_StepDefinition")//tags = {""})

	public class FrmWrk1_TestRunner extends AbstractTestNGCucumberTests{
		
		@BeforeTest // from TestNG
		public void FrmWrk1OpenURL() {
			FrmWrk1_Base FWobj1 = new FrmWrk1_Base();
			FWobj1.FrmWrk1Browser();
			
	}

		@AfterTest // from TestNG
		public void FrmWrk1CloseURL() {
			FrmWrk1_Base FWobj2 = new FrmWrk1_Base();		
			FWobj2.driver.quit();	
	}
}
