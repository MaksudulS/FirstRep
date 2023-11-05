package frmWrk1_PageAction;

import org.testng.Assert;

import frmWrk1_PageLocator.FrmWrk1_ProfilePageLocator;
import frmWrk1_Utility.FrmWrk1_Base;

public class FrmWrk1_ProfilePageAction extends FrmWrk1_Base{
	
	public void Verifyusercanloginsuccessfully() throws Exception {
		
		FrmWrk1_ProfilePageLocator frmWrk1_ProfilePageLocator = new FrmWrk1_ProfilePageLocator();

			Thread.sleep(3000);
			boolean ProfileVerifiaction =  frmWrk1_ProfilePageLocator.FrmWrk1Profile.isDisplayed();
			Assert.assertTrue(ProfileVerifiaction);
			
	}
}
