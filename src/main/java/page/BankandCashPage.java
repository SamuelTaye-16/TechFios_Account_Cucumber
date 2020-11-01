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

public class BankandCashPage {
	
WebDriver driver;
	
	public BankandCashPage(WebDriver driver) {
		this.driver = driver;
		
	}
		
	//Element Library
	
	//WebElement USER_NAME_LOCATOR_WEBLEMENT = driver.findElement(By.xpath("//*[@id='username'];"));
	//By USER_NAME_LOC_WEBLEMENT = By.xpath("//*[@id=\\\"username\\\"]");
	//@FindBy(how = How.XPATH,using = "//*[@id=\"username\"]") WebElement USERNAME_FIELD;
	//@FindBy(how = How.XPATH,using = "//*[@id=\"password\"]") WebElement PASSWORD_FIELD;
	//@FindBy(how = How.XPATH,using = "//button[@name='login']") WebElement SIGNIN_BUTTON_FIELD;
	@FindBy(how =How.XPATH,using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]") WebElement BANK_AND_CASH_ELEMENT_LOCATOR;
	@FindBy(how =How.XPATH,using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a") WebElement NEW_ACCOUNT_ELEMENT_LOCATOR;
	@FindBy(how = How.XPATH,using = "//input[@name='account']")WebElement ACCOUNT_TITLE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH,using = "//*[@id=\"description\"]")WebElement DESCRIPTION_FIELD_LOCATOR;

	@FindBy(how = How.XPATH,using = "//*[@id=\"balance\"]")WebElement INITIAL_BALANCE_FOELD_LOCATOR;

	@FindBy(how = How.XPATH,using = "//*[@id=\"account_number\"]")WebElement ACCOUNT_NUMBER_FIELD_LOCATOR;

	@FindBy(how = How.XPATH,using = "//*[@id=\"contact_person\"]")WebElement CONTACT_PERSON_FIELD_LOCATOR;
	@FindBy(how = How.XPATH,using = "//*[@id=\"contact_phone\"]")WebElement PHONE_NUMBER_FIELD_LOCATOR;

	@FindBy(how = How.XPATH,using = "//*[@id=\"ib_url\"]")WebElement INTERNET_BANKING_URL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH,using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")WebElement SUBMIT_BUTTON_LOCATOR;




	
	  
	/*
	 * public void enteUserName(String userName) {
	 * USERNAME_FIELD.sendKeys(userName);
	 * 
	 * } public void enterPassword(String password) {
	 * PASSWORD_FIELD.sendKeys(password); }
	 * 
	 * 
	 * public void clickSigninButton() { SIGNIN_BUTTON_FIELD.click();
	 * 
	 * }
	 */
	 
	/*
	 * public void login(String userName,String password) throws
	 * InterruptedException { USERNAME_FIELD.sendKeys(userName);
	 * PASSWORD_FIELD.sendKeys(password); SIGNIN_BUTTON_FIELD.click();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * }
	 */
	   public void bankAndCashButton() throws InterruptedException { 
		  BANK_AND_CASH_ELEMENT_LOCATOR.click();
		  Thread.sleep(3000);
		  
	  }
		  public void newAccountButton() { 
			  NEW_ACCOUNT_ELEMENT_LOCATOR.click(); 
			  
		  }
	   
	  
	  public void NewAccountDetails(String accountTitleField, String descriptionField, String initialBalanceField, String accountNumberField, String contactPersonField, String phoneNumberField, String internetBankingUrlField) {
		  ACCOUNT_TITLE_FIELD_LOCATOR.sendKeys(accountTitleField); 
		  DESCRIPTION_FIELD_LOCATOR.sendKeys(descriptionField);
		  INITIAL_BALANCE_FOELD_LOCATOR.sendKeys(initialBalanceField);
		  ACCOUNT_NUMBER_FIELD_LOCATOR.sendKeys(accountNumberField);
		   CONTACT_PERSON_FIELD_LOCATOR.sendKeys(contactPersonField);
		   PHONE_NUMBER_FIELD_LOCATOR.sendKeys(phoneNumberField);
		   INTERNET_BANKING_URL_FIELD_LOCATOR.sendKeys(internetBankingUrlField);

	  }
	  
		
		  public void submitbutton() {
			  SUBMIT_BUTTON_LOCATOR.click();
		  
		  }
		 
	  
	  public void takeScreenShotAtTheEndOfTheTest(WebDriver driver) throws IOException {
		  TakesScreenshot ts = ((TakesScreenshot) driver);
		  File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(sourceFile, new File("user" + "/screenshots/" + System.currentTimeMillis() + ".png"));



		  
	  }
	 

	  
		/*
		
		 * public void accountTitleField() {
		 * ACCOUNT_TITLE_FIELD_LOCATOR.sendKeys("Saving Account"); }
		 * 
		 * public void descriptionField() {
		 * DESCRIPTION_FIELD_LOCATOR.sendKeys("NewAccount"); }
		 * 
		 * public void initialBalanceField() {
		 * INITIAL_BALANCE_FOELD_LOCATOR.sendKeys("15000"); }
		 * 
		 * public void accountNumberField() {
		 * ACCOUNT_NUMBER_FIELD_LOCATOR.sendKeys("098765111111"); } public void
		 * contactPersonField() { CONTACT_PERSON_FIELD_LOCATOR.sendKeys("Salem T"); }
		 * 
		 * public void phoneNumberField() {
		 * PHONE_NUMBER_FIELD_LOCATOR.sendKeys("2118967360"); }
		 * 
		 * public void internetBankingUrlField() {
		 * INTERNET_BANKING_URL_FIELD_LOCATOR.sendKeys("www.capitalonebank.com"); }
		 * public void submitFieldLocator() { SUBMIT_BUTTON_LOCATOR.click(); }
		 */
	
	 

}
