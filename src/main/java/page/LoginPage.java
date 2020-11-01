package page;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
		
	//Element Library
	
	//WebElement USER_NAME_LOCATOR_WEBLEMENT = driver.findElement(By.xpath("//*[@id='username'];"));
	//By USER_NAME_LOC_WEBLEMENT = By.xpath("//*[@id=\\\"username\\\"]");
	@FindBy(how = How.XPATH,using = "//*[@id=\"username\"]") WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH,using = "//*[@id=\"password\"]") WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH,using = "//button[@name='login']") WebElement SIGNIN_BUTTON_FIELD;
	


	  
	  
	public void enteUserName(String userName) {
		USERNAME_FIELD.sendKeys(userName);
		
	}
	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}

	
	  public void clickSigninButton() {
		  SIGNIN_BUTTON_FIELD.click(); 
		  
	  }
	 
	  public void login(String userName,String password) {
	  USERNAME_FIELD.sendKeys(userName); PASSWORD_FIELD.sendKeys(password);
	  SIGNIN_BUTTON_FIELD.click();
	  
	  }
	 
	  
	  public String getPageTitle() {
		  return driver.getTitle();
		 }
	  
	  public void takeScreenShotAtTheEndOfTheTest(WebDriver driver) throws IOException {
		  TakesScreenshot ts = ((TakesScreenshot) driver);
		  File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(sourceFile, new File("user" + "/screenshots/" + System.currentTimeMillis() + ".png"));



		  
	  }
	 

		
	
	
	
	

}



