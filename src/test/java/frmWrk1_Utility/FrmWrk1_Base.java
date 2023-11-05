package frmWrk1_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class FrmWrk1_Base {

	public static WebDriver driver;	
	public static Properties PROPobj;
	

	//CONSTRUCTOR STARTS>
	public FrmWrk1_Base() {
		
		try {
			FileInputStream FISobj = new FileInputStream(System.getProperty("user.dir") + ("//src//test//java//frmWrk1_Config//FrmWrk1_Config.Properties"));
			
			PROPobj = new Properties();
			PROPobj.load(FISobj);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Please, check your code!");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			
	}	//<CONSTRUCTOR ENDS
	
	//METHOD FOR BROWSER STARTS>
	
	public void FrmWrk1Browser() {
		
		String FrmWrk1AllBrowser = PROPobj.getProperty("FrmWrk1_Browser1");
		
		if (FrmWrk1AllBrowser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir") + ("//FrmWrk1_ChromeDriver//chromedriver.exe"));
			ChromeOptions obj1 = new ChromeOptions();
			obj1.addArguments("--remote-allow-origins=*");			
			driver = new ChromeDriver();
			//driver.get("https://demoblaze.com/");			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(FrmWrk1_Utility.pageLoadTimeout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(FrmWrk1_Utility.implicitlyWait));			
			driver.manage().window().maximize();
		}	

		else if (FrmWrk1AllBrowser.equalsIgnoreCase("Edge")) {
			
			System.setProperty("WebDriver.edge.driver",System.getProperty("user.dir") + ("//FrmWrk1_EdgeDriver//msedgedriver.exe"));
			EdgeOptions obj2 = new EdgeOptions();
			obj2.addArguments("--remote-allow-origins=*");			
			driver = new EdgeDriver();
			//driver.get("https://demoblaze.com/");			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(FrmWrk1_Utility.pageLoadTimeout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(FrmWrk1_Utility.implicitlyWait));			
			driver.manage().window().maximize();
					
		}
				
	}	//<METHOD FOR BROWSER ENDS
	
	//METHOD FOR URL STARTS>
	
	public static void FrmWrk1LaunchURL (String URL) {
		
		driver.get(PROPobj.getProperty("FrmWrk1_URL"));
	}	
}
	

