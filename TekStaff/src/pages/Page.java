package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {

	/*-----------------------------------------------------------------------------------
	Test Form URL:   file:///C:/Users/rayya/workspace/TekStaff/test%20(1).html
	--------------------------------------------------------------------------------------*/

	WebDriver driver;

	public Page(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	///===============================================================================================================///

	//Passing parameter to first name

	@FindBy(xpath = ".//*[@id='fname']")     
	WebElement firstNameValid;

	public void passFirstName(String FirstName){
		this.firstNameValid.sendKeys(FirstName);
	}

	@FindBy(xpath = "html/body/p")     
	WebElement formSubmitted;

	public String validFirstName(){
		String actual = this.formSubmitted.getText();
		return actual;
	}

	@FindBy(xpath = ".//*[@id='fname']")
	WebElement fstName;

	public void firstName(String FirstName){
		this.fstName.sendKeys(FirstName);

	}

	@FindBy(xpath = ".//*[@id='fname-error']")
	WebElement firstNameBlankMsg;


	public String fstBlankMsg(){
		String actual = this.firstNameBlankMsg.getText();
		return actual;
	}

	@FindBy(xpath = ".//*[@id='fname-error']")
	WebElement firstNameMaxMsg;

	//.//*[@id='fname-error']

	public String fstNameMax(){	
		String actual = this.firstNameMaxMsg.getText();
		return actual;
	}

	@FindBy(xpath = ".//*[@id='fname-error']")
	WebElement firstNameSplMsg;

	public String fstNameSpl(){	
		String expected = this.firstNameSplMsg.getText();
		return expected;
	}

	@FindBy(xpath = ".//*[@id='fname']")
	WebElement fstNameClear;

	public String isFstNameFieldClear(){
		String expected = this.fstNameClear.getText();
		return expected;
	}

	@FindBy(xpath = ".//*[@id='fname-error']")
	WebElement firstNameWithSpace;

	public String fstNameWithSpace(){
		String expected = this.firstNameWithSpace.getText();
		return expected;
	}

	//Passing parameter to last name


	@FindBy(xpath = "html/body/p")
	WebElement lastNameValid;

	public void passLasttName(String FirstName){
		this.lastNameValid.sendKeys(FirstName);
	}


	public String validLasttName(){
		String actual = this.lastNameValid.getText();
		return actual;
	}

	@FindBy(xpath = ".//*[@id='lname']")
	WebElement lstName;

	public void lastName(String LastName){
		this.lstName.sendKeys(LastName);

	}

	@FindBy(xpath = ".//*[@id='lname']")
	WebElement lstNameBlank;

	public String isLstNameFieldClear(){
		String expected = this.lstNameBlank.getText();
		return expected;

	}	

	@FindBy(xpath = ".//*[@id='lname-error']")
	WebElement lastNameBlankMsg;

	public String lstBlankMsg(){
		String expected = this.lastNameBlankMsg.getText();
		return expected;
	}

	@FindBy(xpath = ".//*[@id='lname-error']")
	WebElement lastNameMaxMsg;

	public String lstNameMax(){
		String expected = this.lastNameMaxMsg.getText();
		return expected;
	}

	@FindBy(xpath = ".//*[@id='lname-error']")
	WebElement lastNameSplMsg;

	public String lstNameSpl(){	
		String expected = this.lastNameSplMsg.getText();
		return expected;
	}

	@FindBy(xpath = ".//*[@id='lname-error']")
	WebElement lastNameWithSpace;

	public String lstNameWithSpace(){	
		String expected = this.lastNameWithSpace.getText();
		return expected;
	}

	//Passing parameter to phone number

	@FindBy(xpath = "html/body/p")
	WebElement phoneNumberValid;

	public void passPhoneNumber(String FirstName){
		this.phoneNumberValid.sendKeys(FirstName);
	}


	public String validPhoneNumber(){
		String actual = this.lastNameValid.getText();
		return actual;
	}

	@FindBy(xpath = ".//*[@id='phone']")
	WebElement phNumber;

	public void phoneNumber(String PhoneNumber){
		this.phNumber.sendKeys(PhoneNumber);

	}

	@FindBy(id = "phone-error")
	WebElement phoneNumberBlankMsg;


	public String phoneNumberBlankMsg(){
		String expected = this.phoneNumberBlankMsg.getText();
		return expected;
	}

	@FindBy(xpath = ".//*[@id='phone-error']")
	WebElement phoneNumberMaxMsg;

	public String phoneNumberMax(){
		String expected = this.phoneNumberMaxMsg.getText();
		return expected;
	}

	@FindBy(xpath = ".//*[@id='phone']")
	WebElement phNumberBlank;

	public String isPhoneNumberFieldClear(){
		String expected = this.phNumberBlank.getText();
		return expected;
	}	

	@FindBy(xpath = ".//*[@id='phone-error']")
	WebElement phNumberSplMsg;

	public String phoneNumberSplMsg(){
		String expected = this.phNumberSplMsg.getText();
		return expected;
	}	

	@FindBy(xpath = ".//*[@id='phone-error']")
	WebElement phNumberWithSpace;

	public String phoneNumberWithSpace(){
		String expected = this.phNumberWithSpace.getText();
		return expected;
	}	

	@FindBy(xpath = "html/body/p")
	WebElement testFormSubmitted;

	public String formSubmittedPass(){
		String expected = this.testFormSubmitted.getText();
		return expected;
	}

	@FindBy(xpath = ".//*[@id='submit']")
	WebElement submitButton;

	public void submitBtn(){
		this.submitButton.click();

	}

	@FindBy(xpath = "html/body/form/button[2]")
	WebElement clearButton;


	public void clearBtn(){
		this.clearButton.click();

	}


}