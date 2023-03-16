package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.BankCashPage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	LoginPage loginPage;
	BankCashPage bankcashPage;

	@Before
	public void BeforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		bankcashPage = PageFactory.initElements(driver, BankCashPage.class);
	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {

		driver.get("https://techfios.com/billing/?ng=admin/");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {

		loginPage.enterUserName(username);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {

		loginPage.enterPassword(password);
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {

		loginPage.clickSignInButton();
	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {

		takeScreenshot(driver);
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@Then("User clicks on bankCash")
	public void user_clicks_on_Bank_Cash() {
		bankcashPage.user_clicks_on_Bank_Cash();
	}

	@Then("User clicks on newAccount")
	public void user_clicks_on() {
		bankcashPage.user_clicks_on_new_account();
	}

	@Then("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_element(String userinfo, String field) {
		switch (field) {
		case "accountTitle" : 
			BankCashPage.user_enters_in_the_field_in_accounts_element(userinfo + generateRandomNumber(99));
			break;
		case "description" :
			bankcashPage.user_enters_in_the_field_in_description_element(userinfo);
			break;
		case "initialBalance":
			bankcashPage.user_enters_in_the_field_in_initialbalance_element(userinfo + generateRandomNumber(999));
			break;
		case "accountNumber":
			bankcashPage.user_enters_in_the_field_in_accountNumber_element(userinfo + generateRandomNumber(999));
			break;
		case "contactPerson":
			bankcashPage.user_enters_in_the_field_in_contactperson_element(userinfo);
			break;
		case "Phone":
			bankcashPage.user_enters_in_the_field_in_phonenumber_element(userinfo + generateRandomNumber(999));
			break;
		case"internetBankingURL":
			bankcashPage.user_enters_in_the_field_in_BankURL_element(userinfo);
			break;
			default:System.out.println("field not found");
		}
		
	}
//		bankcashPage.user_enters_in_the_field_in_accounts_element(accountTitle);
//	}
//
//	@Then("User enters {string} in the {string} field in description page")
//	public void user_enters_in_the_field_in_description_element(String description, String Description) {
//		bankcashPage.user_enters_in_the_field_in_description_element(description);
//	}
//
//	@Then("User enters {string} in the {string} field in innitial balance page")
//	public void user_enters_in_the_field_in_initialbalance_element(String initialbalance, String InitialBalance) {
//		bankcashPage.user_enters_in_the_field_in_initialbalance_element(initialbalance);
//	}
//
//	@Then("User enters {string} in the {string} field in account number page")
//	public void user_enters_in_the_field_in_accountNumber_page(String accountnumber, String AccountNumber) {
//		bankcashPage.user_enters_in_the_field_in_accountNumber_element(accountnumber);
//	}
//
//	@Then("User enters {string} in the {string} field in contact person page")
//	public void user_enters_in_the_field_in_contactperson_element(String contactperson, String ContactPerson) {
//		bankcashPage.user_enters_in_the_field_in_contactperson_element(contactperson);
//	}
//
//	@Then("User enters {string} in the {string} field in phone number page")
//	public void user_enters_in_the_field_in_phonenumber_element(String phonenumber, String PhoneNumber) {
//		bankcashPage.user_enters_in_the_field_in_phonenumber_element(phonenumber);
//	}


	@Then("User clicks on submit")
	public void user_clicks_on_submit_in_button() {
		bankcashPage.user_clicks_on_submit_in_button();
	}

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {

		takeScreenshot(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expectedTitle = "Accounts- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}