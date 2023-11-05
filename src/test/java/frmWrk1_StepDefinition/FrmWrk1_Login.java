package frmWrk1_StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import frmWrk1_PageAction.FrmWrk1_HomePageAction;
import frmWrk1_PageAction.FrmWrk1_LoginPageAction;
import frmWrk1_PageAction.FrmWrk1_ProfilePageAction;
import frmWrk1_Utility.FrmWrk1_Base;

public class FrmWrk1_Login extends FrmWrk1_Base{
	
	FrmWrk1_HomePageAction frmWrk1_HomePageAction = new FrmWrk1_HomePageAction();
	FrmWrk1_LoginPageAction frmWrk1_LoginPageAction = new FrmWrk1_LoginPageAction();
	FrmWrk1_ProfilePageAction frmWrk1_ProfilePageAction = new FrmWrk1_ProfilePageAction();
	
	
	@Given("^Launch <\"([^\"]*)\">$")
	public void launch(String URL) throws Throwable {
		
		FrmWrk1LaunchURL(URL);

	}

	@Then("^Click LogIn$")
	public void click_LogIn() throws Throwable {
		
		frmWrk1_HomePageAction.ClickLogIn();

	}

	@Then("^Type UserName PassWord and click Login$")
	public void type_UserName_PassWord_and_click_Login() throws Throwable {
		
		frmWrk1_LoginPageAction.TypeUserNamePassWordandclickLogin(PROPobj.getProperty("FrmWrk1_UserName1"),PROPobj.getProperty("FrmWrk1_Password1"));

	}

	@Then("^Verify user can login successfully$")
	public void verify_user_can_login_successfully() throws Throwable {
		
		frmWrk1_ProfilePageAction.Verifyusercanloginsuccessfully();

	}
	
}
