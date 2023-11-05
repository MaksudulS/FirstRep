package frmWrk1_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frmWrk1_Utility.FrmWrk1_Base;

public class FrmWrk1_LoginPageLocator extends FrmWrk1_Base{
	
	//CONSTRUCTOR STARTS>
	public FrmWrk1_LoginPageLocator () {
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="loginusername")
	public WebElement FrmWrk1User;
	
	@FindBy(id="loginpassword")
	public WebElement FrmWrk1Password;
	
	@FindBy(xpath="//button[text()=\"Log in\"]")
	public WebElement FrmWrk1LogIn;
	
	@FindBy(id="")
	public WebElement FrmWrk1User4;
	
	@FindBy(id="")
	public WebElement FrmWrk1User5;
	
	//<CONSTRUCTOR ENDS

}
