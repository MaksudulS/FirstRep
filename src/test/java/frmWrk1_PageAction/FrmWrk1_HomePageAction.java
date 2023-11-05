package frmWrk1_PageAction;

import frmWrk1_PageLocator.FrmWrk1_HomePageLocator;
import frmWrk1_Utility.FrmWrk1_Base;

public class FrmWrk1_HomePageAction extends FrmWrk1_Base{
	
	FrmWrk1_HomePageLocator frmWrk1_HomePageLocator =new FrmWrk1_HomePageLocator();
	
	public void ClickLogIn() throws Exception {
		
		Thread.sleep(3000);
		frmWrk1_HomePageLocator.FrmWrk1LogInLink1.click();
		
	}
}
