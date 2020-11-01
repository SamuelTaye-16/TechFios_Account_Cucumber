package steps;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.BankandCashPage;
import page.LoginPage;

import util.BrowserFactory;

public class StepDef {
	WebDriver driver;
	LoginPage login;
	BankandCashPage bcp;

	@Before
	public void BeforeRun() {
		driver = BrowserFactory.startBrowser();
		login = PageFactory.initElements(driver, LoginPage.class);
		bcp = PageFactory.initElements(driver, BankandCashPage.class);
	}

	@Given("^User is on the Techfios Login Page$")
	public void User_is_on_the_Techfios_Login_Page() {
		driver.get("https://techfios.com/billing/?ng=admin/");

	}

	@When("^User enters the username as \"([^\"]*)\"$")
	public void user_enters_the_username_as(String userName) throws InterruptedException {
		login.enteUserName(userName);
		// driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("demo@techfios.com");
		Thread.sleep(2000);

	}

	@When("^User enters the password as \"([^\"]*)\"$")
	public void user_enters_the_password_as(String password) throws InterruptedException {
		login.enterPassword(password);
		// driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc123");
		// Thread.sleep(4000);
	}

	@When("^User clicks on the Login Button$")
	public void user_clicks_on_the_Login_Button() throws InterruptedException {
		login.clickSigninButton();
		// driver.findElement(By.name("login")).click();

		// Thread.sleep(4000);
	}

	@Then("^User should be able to land on dashBoard page$")
	public void user_should_be_able_to_land_on_dashBoard_page() throws IOException {

		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = login.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		login.takeScreenShotAtTheEndOfTheTest(driver);

	}

	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_and(String userName, String password) throws Throwable {
		login.login(userName, password);
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		Thread.sleep(3000);
	}

	@When("^User clicks on login Button$")
	public void user_clicks_on_login_Button() throws Throwable {
		login.clickSigninButton();

		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);

	}

	@Then("^User clicks on bank and cash$")
	public void user_clicks_on_bank_and_cash() throws Throwable {
		bcp.bankAndCashButton();
		// Write code here that turns the phrase above into concrete actions
		// driver.findElement(By.xpath("//*[@id=\\\"side-menu\\\"]/li[10]/a/span[1]")).click();
		// Thread.sleep(2000);
	}

	@Then("^User clicks on new account$")
	public void user_clicks_on_new_account() throws Throwable {
		bcp.newAccountButton();
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);

	}

	@Then("^User fill up the form entering \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and  \"([^\"]*)\" and \"([^\"]*)\" and clicks on submit$")
	public void user_fill_up_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit(String accountTitleField,
			String descriptionField, String initialBalanceField, String accountNumberField, String contactPersonField,
			String phoneNumberField, String internetBankingUrlField) throws Throwable {
		bcp.NewAccountDetails(accountTitleField, descriptionField, initialBalanceField, accountNumberField,
				contactPersonField, phoneNumberField, internetBankingUrlField);
		Thread.sleep(3000);
		bcp.submitbutton();
		System.out.println("==========Account Created successfully======");
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^User should be able to see validate$")
	public void user_should_be_able_to_see_validate() throws Throwable {
		login.takeScreenShotAtTheEndOfTheTest(driver);
		System.out.println("User Created an Account!!!");
		// Write code here that turns the phrase above into concrete actions

		Thread.sleep(3000);
	}

	@After
	public void afterRun() {
		driver.close();
		driver.quit();
	}

}
