package frmWrk1_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frmWrk1_Utility.FrmWrk1_Base;

public class FrmWrk1_ProfilePageLocator extends FrmWrk1_Base{
	
	
	
	//CONSTRUCTOR STARTS>
	public FrmWrk1_ProfilePageLocator () {
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="nameofuser")
	public WebElement FrmWrk1Profile;
	
	@FindBy(id="")
	public WebElement FrmWrk1;
	
	@FindBy(xpath="")
	public WebElement FrmWrk1LogIn;
	
	@FindBy(id="")
	public WebElement FrmWrk1User4;
	
	@FindBy(id="")
	public WebElement FrmWrk1User5;
	
	//<CONSTRUCTOR ENDS


}
