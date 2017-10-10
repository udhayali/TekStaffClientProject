package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Page;

	public class ValidateForm {
	
	
	WebDriver driver;
			
	@BeforeMethod
	
	public void SetBrowser() throws InterruptedException{
		
	/*System.setProperty("webdriver.gecko.driver", "C:/geckodriver-v0.16.1-win32/geckodriver.exe");
		WebDriver driver  = new FirefoxDriver();
		driver.get("file:///C:/Users/rayya/workspace/Tekstaff/test.html");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.10000)
	}*/

		// Instanatiate Chrome Browser
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rayya/workspace/TekStaff/test%20(1).html");
		
	}
	
	@Test ( priority = 1,enabled = true)
	
	public void firstNameBlank(){
		
		Page objPage1 = new Page(driver);
		objPage1.firstName("");
		objPage1.submitBtn();
				
		String actual = objPage1.fstBlankMsg();
		String expected = "First name is a required field";
		System.out.println("First Name field must be filled  :  "+  expected);
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
				
	}	
	
	@Test ( priority = 2,enabled = true)
	
		public void lastNameBlank(){
		Page objPage1 = new Page(driver);
		objPage1.lastName("");
		objPage1.submitBtn();
				
		String actual= objPage1.lstBlankMsg();
		String  expected= "Last name is a required field";
		System.out.println("Last Name field must be  filled:   "+  expected);	
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
					
		}
		
	@Test ( priority = 3,enabled = true)
	
		public void phoneNumberBlank(){
		Page objPage1 = new Page(driver);
		objPage1.phoneNumber("");
		objPage1.submitBtn();
			
		String actual= objPage1.phoneNumberBlankMsg();
		String expected = "Phone number is a required input";
		System.out.println("Phone Number field must be filled :    "+  expected);
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
		
		}
		
	@Test ( priority = 4,enabled = true)
	
		public void passNegativeDataFirstName() throws Throwable{
		Page objPage1 = new Page(driver);
		Thread.sleep(5000);
		objPage1.firstName("abcdefghijklmnopqrstuvwxyz");
		Thread.sleep(5000);
		objPage1.submitBtn();
						
		String actual = objPage1.fstNameMax();
		String expected = "The max length of first name is 20";
		System.out.println("First Name text box tested with more than 20 charactors :  "+  expected);
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
		
		}
		
	@Test ( priority = 5,enabled = true)
	
		public void passNegativeDataLastName(){
		Page objPage1 = new Page(driver);
		objPage1.lastName("zyxwvutsrqponmlkjijgfedcba");
		String expected = "The max length of first name is 20";
		objPage1.submitBtn();
		
		String actual = objPage1.lstNameMax();
		System.out.println("Last Name text box tested with more than 20 charactors  :  "+  expected);
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
		
		}
			
	@Test ( priority = 6,enabled = true)
	
		public void phoneNumberMax(){
		Page objPage1 = new Page(driver);
		objPage1.phoneNumber("12346789645678");
		objPage1.submitBtn();
			
		String actual= objPage1.phoneNumberMax();
		String expected = "Phone is incorrect";
		System.out.println(" Phone Number text box tested with more than 10 digits :  "+  expected);
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
		
		}
		
	@Test ( priority = 7,enabled = true)
	
		public void FirstNameSplMsg(){
		Page objPage1 = new Page(driver);
		objPage1.firstName("$%dfree#");
		objPage1.submitBtn();
		
					
		String actual = objPage1.fstNameSpl();
		String expected = "First name can only be characters";
		System.out.println("First Name text box tested with special charactors :     "+  expected);
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
		
		}
	
	@Test ( priority = 8,enabled = true)
		
		public void LastNameSplMsg(){
		Page objPage1 = new Page(driver);
		objPage1.lastName("askdj674%$32");
		objPage1.submitBtn();
		
		String actual = objPage1.lstNameSpl();
		String expected = "Last name can only be characters";
		System.out.println("Last Name text box tested with special charactors :    "+  expected);
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
		
		}
		
		@Test ( priority = 9,enabled = true)
		
		public void phoneNumberSplMsg(){
		Page objPage1 = new Page(driver);
		objPage1.phoneNumber("asd123467896");
		objPage1.submitBtn();
			
		String actual= objPage1.phoneNumberSplMsg();
		String expected = "Phone is incorrect";
		System.out.println("Phone Number text box tested with special charactors :    "+  expected);
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
		
		}
		
		@Test ( priority = 10,enabled = true)
		
		public void firstNameWithSpace() throws Throwable{
		Page objPage1 = new Page(driver);
		objPage1.firstName("adam  dj  t");
		Thread.sleep(2000);
		
		objPage1.submitBtn();
					
		String actual = objPage1.fstNameWithSpace();
		String expected = "First name can only be characters";
		Assert.assertEquals(actual, expected);
		System.out.println("First Name text box tested with space :    "+  expected);
		driver.navigate().refresh();
		
		}
		
		@Test ( priority = 11,enabled = true)
		
		public void lastNameWithSpace () throws Throwable{
		Page objPage1 = new Page(driver);
		objPage1.lastName("albert kdj nm");
		Thread.sleep(2000);
		objPage1.submitBtn();
		
		String actual = objPage1.lstNameWithSpace();
		String expected = "Last name can only be characters";
		Assert.assertEquals(actual, expected);
		System.out.println("Last Name text box tested with space  :     "+  expected);
		driver.navigate().refresh();
		
		}
		
		@Test ( priority = 12,enabled = true)
		
		public void phoneNumberWithSpace(){
		Page objPage1 = new Page(driver);
		objPage1.phoneNumber("kjhfhf6578");
		objPage1.submitBtn();
			
		String actual= objPage1.phoneNumberWithSpace();
		String expected = "Phone is incorrect";
		Assert.assertEquals(actual, expected);
		System.out.println("Phone Number text box tested with AlphaNumerics :    "+  expected);
		driver.navigate().refresh();
		}
		
		@Test ( priority = 13,enabled = true)
		
		public void FstNameFieldClear(){
		Page objPage1 = new Page(driver);
		objPage1.firstName("adam  dj  t");
		objPage1.clearBtn();
							
		String actual = objPage1.isFstNameFieldClear();
		String expected = "";
		Assert.assertEquals(actual, expected);
		System.out.println("First Name text box Cleared :    "+    expected);
		driver.navigate().refresh();
		}
		
		@Test ( priority = 14,enabled = true)
		
		public void LstNameFieldClear(){
		Page objPage1 = new Page(driver);
		objPage1.lastName("albert kdj nm");
		objPage1.clearBtn();
		
		String actual = objPage1.isLstNameFieldClear();
		String expected = "";
		Assert.assertEquals(actual, expected);
		System.out.println("Last Name text box Cleared :   "+   expected);
		
		driver.navigate().refresh();
		}
		
		@Test ( priority = 15,enabled = true)
		
		public void PhoneNumberFieldClear() throws Throwable{
		Page objPage1 = new Page(driver);
		objPage1.phoneNumber("kjhfhf");
		objPage1.clearBtn();
		
		Thread.sleep(10000);
	
		String actual= objPage1.isPhoneNumberFieldClear();
		String expected = "";
		Assert.assertEquals(actual, expected);
		System.out.println("Phone Number  text box Cleared  :  "+    expected);
		driver.navigate().refresh();
		}
		
		@Test ( priority = 16,enabled = true)
		
		public void PositiveTest() throws Throwable{
				
		Page objPage1 = new Page(driver);
		objPage1.firstName("test");
		objPage1.lastName("Pass");
		objPage1.phoneNumber("1234567890");
		objPage1.submitBtn();
		String actual = driver.findElement(By.xpath("html/body/p")).getText();
		String expected = "Form submitted!";
		System.out.println("Expected ="   +  expected);
		System.out.println("Actual = "    +  actual);
		System.out.println("ALL TESTS ARE COMPLETED AND PASSED      : "  +  actual);		
		Assert.assertEquals(actual,expected);
		
		}
		
	@AfterMethod
	
	public void closeBrowser(){
		driver.quit();
	}


}

