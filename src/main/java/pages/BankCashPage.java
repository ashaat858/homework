package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankCashPage extends TestBase {

	WebDriver driver;

	public BankCashPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Bank & Cash')]")
	WebElement BANKCASH_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'New Account')]")
	WebElement NEW_ACCOUNT;
	@FindBy(how = How.XPATH, using = "//input[@name='account']")
	static
	WebElement ACCOUNT_TITLE;
	@FindBy(how = How.XPATH, using = "//input[@name='description']")
	WebElement ACCOUNT_DESCRIPTION;
	@FindBy(how = How.XPATH, using = "//input[@name='balance']")
	WebElement INITIAL_BALANCE;
	@FindBy(how = How.XPATH, using = "//input[@name='account_number']")
	WebElement ACCOUNT_NUMBER;
	@FindBy(how = How.XPATH, using = "//input[@name='contact_person']")
	WebElement CONTACT_PERSON;
	@FindBy(how = How.XPATH, using = "//input[@name='contact_phone']")
	WebElement PHONE_NUMBER;
	@FindBy(how = How.XPATH, using = "//input[@name='ib_url']")
	WebElement BANK_URL;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	WebElement SUBMITBUTTON_ELEMENT;

	public void user_clicks_on_Bank_Cash() {
		BANKCASH_ELEMENT.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void user_clicks_on_new_account() {
		NEW_ACCOUNT.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void user_enters_in_the_field_in_accounts_element(String accountTitle) {
		ACCOUNT_TITLE.sendKeys(accountTitle);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void user_enters_in_the_field_in_description_element(String description) {
		ACCOUNT_DESCRIPTION.sendKeys(description);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void user_enters_in_the_field_in_initialbalance_element(String initialbalance) {
		INITIAL_BALANCE.sendKeys(initialbalance);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void user_enters_in_the_field_in_accountNumber_element(String accountNumber) {
		ACCOUNT_NUMBER.sendKeys(accountNumber);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		}

		public void user_enters_in_the_field_in_contactperson_element(String contactperson) {
			CONTACT_PERSON.sendKeys(contactperson);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
}
		public void user_enters_in_the_field_in_phonenumber_element(String phonenumber)	{
			PHONE_NUMBER.sendKeys(phonenumber);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		}
		public void user_enters_in_the_field_in_BankURL_element(String BankURL) {
			BANK_URL.sendKeys(BankURL);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		}
			public void user_clicks_on_submit_in_button() {
				SUBMITBUTTON_ELEMENT.click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
}