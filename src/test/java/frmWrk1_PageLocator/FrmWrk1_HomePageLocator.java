package frmWrk1_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frmWrk1_Utility.FrmWrk1_Base;

public class FrmWrk1_HomePageLocator extends FrmWrk1_Base{

	//CONSTRUCTOR STARTS>
	public FrmWrk1_HomePageLocator () {
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="login2")
	public WebElement FrmWrk1LogInLink1;
	
	@FindBy(id="")
	public WebElement FrmWrk1LogInLink2;
	
	@FindBy(id="")
	public WebElement FrmWrk1LogInLink3;
	
	@FindBy(id="")
	public WebElement FrmWrk1LogInLink4;
	
	@FindBy(id="")
	public WebElement FrmWrk1LogInLink5;
	
	//<CONSTRUCTOR ENDS
}
 