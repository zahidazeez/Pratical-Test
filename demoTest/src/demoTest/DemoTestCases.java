package demoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.Constants;
import function.Login;

import org.junit.Assert;
import org.junit.Test;
import org.testng.asserts.SoftAssert;
public class DemoTestCases {

	
	public static void main(String[] args) throws InterruptedException {
		
		Login.beforeTest();
		verifyRegisterUser();
		verifyCheckoutProduct();
		Login.afterTest(); 
	
	}
	
	@Test
	 public static void verifyRegisterUser() throws InterruptedException{
		    SoftAssert softAssert =new SoftAssert();
			Login.clickSignIn();
			Login.enterEmail();
			Login.clickCreateAccount();
			Login.selectGender();
			Login.enterFirstName();
			Login.enterLastName();
			Login.enterPassword();
			Login.enterFirstNameForAddress();
			Login.enterLastNameForAddress();
			Login.enterAaddress();
			Login.enterCity();
			Login.selectState();
			Login.enterZip();
			Login.enterMobilePhone();
			Login.enterAddressAlias();
			Login.clickRegister();
			softAssert.assertEquals(Login.getLoggedInUserName(),"testZahid lastZahid");
		
	    }
	 
	@Test
	 public static void verifyCheckoutProduct() throws InterruptedException{
		SoftAssert softAssert =new SoftAssert();
		    Login.clickTshirts();
			Login.addProduct();
			softAssert.assertEquals(Login.getShoppingCartSummary(),"Faded Short Sleeve T-shirts");
	    }

}
