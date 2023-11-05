package frmWrk1_PageAction;

import frmWrk1_PageLocator.FrmWrk1_LoginPageLocator;
import frmWrk1_Utility.FrmWrk1_Base;

public class FrmWrk1_LoginPageAction extends FrmWrk1_Base{

	FrmWrk1_LoginPageLocator frmWrk1_LoginPageLocator = new FrmWrk1_LoginPageLocator();
	
	public void TypeUserNamePassWordandclickLogin(String Use, String Pas) throws Exception {
		
		Thread.sleep(3000);
		frmWrk1_LoginPageLocator.FrmWrk1User.sendKeys(Use);
		Thread.sleep(3000);
		frmWrk1_LoginPageLocator.FrmWrk1Password.sendKeys(Pas);	
		Thread.sleep(3000);		
		frmWrk1_LoginPageLocator.FrmWrk1LogIn.click();
		
	}	
}
