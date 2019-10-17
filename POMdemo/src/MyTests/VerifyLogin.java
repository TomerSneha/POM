package MyTests;

import myPOMpackage.LoginPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyLogin {

	@Test
	public void checklogin(){
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");		
		driver.manage().window().maximize();
		
		
		LoginPOM login=new LoginPOM(driver);
		login.enterusername("rekha");
		login.enterpassword("rekha");
		login.clicksignin();
		
	}
	
}
