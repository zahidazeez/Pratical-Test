package pages;

import java.util.Random;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
    static ChromeDriver driver;
    static WebDriverWait wait;
	//@BeforeClass
	public static void beforeTest() {
	System.setProperty("webdriver.chrome.driver", "/home/mohamadz/Downloads/browserdriver/chromedriver_linux64/chromedriver");
	driver=new ChromeDriver();
	wait = new WebDriverWait(driver,20);
	}
	
	public void afterTest(){
		driver.quit();
    }
	
	public void clickSignIn(){
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class=\"header_user_info\"]/a")).click();
    }
	
    public void enterEmail(){
    	Random random = new Random();

    	int randomNum = random.nextInt((100000 - 1000) + 1) + 1000;
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_create")));
	    driver.findElement(By.id("email_create")).sendKeys("testZahid"+randomNum+"@qwe.com");
    }

    public void clickCreateAccount(){
    	driver.findElement(By.id("SubmitCreate")).click();
    	
    }
    
    public void selectGender(){
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));
    	driver.findElement(By.id("id_gender1")).click();
    }
    
    public void enterFirstName(){
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_firstname")));
	    driver.findElement(By.id("customer_firstname")).sendKeys("testZahid");
    }
    
    public void enterLastName(){
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_lastname")));
	    driver.findElement(By.id("customer_lastname")).sendKeys("lastZahid");
    }
    
    public void enterEmailAddress(){
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	    driver.findElement(By.id("email")).sendKeys("testZahid@qwe.com");
    }
    
    public void enterPassword(){
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd")));
	    driver.findElement(By.id("passwd")).sendKeys("Test1234#");
    }
    
    public void enterFirstNameForAddress(){
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname")));
	    driver.findElement(By.id("firstname")).sendKeys("mohamad");
    }
    
    public void enterLastNameForAddress(){
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastname")));
	    driver.findElement(By.id("lastname")).sendKeys("zahid");
    }
    
    public void enterAaddress(){
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address1")));
	    driver.findElement(By.id("address1")).sendKeys("15, new street");
    }
    
    public void enterCity(){
    	WebElement element = driver.findElement(By.id("city"));
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    driver.findElement(By.id("city")).sendKeys("Redwood");
    }
    
    public void selectState(){
    	WebElement element = driver.findElement(By.id("id_state"));
    	JavascriptExecutor executor = (JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();", element);
	    driver.findElement(By.xpath("//*[@id=\"id_state\"]")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"id_state\"]/option[2]")));
	    driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[2]")).click();
    }
    
    public void enterZip(){
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postcode")));
	    driver.findElement(By.id("postcode")).sendKeys("90005");
    }
    
    public void enterMobilePhone(){
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone_mobile")));
	    driver.findElement(By.id("phone_mobile")).sendKeys("7656895436");
    }
    
    public void enterAddressAlias(){
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alias")));
	    driver.findElement(By.id("alias")).sendKeys("new road");
    }
    
    public void clickRegister(){
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submitAccount")));
    	driver.findElement(By.id("submitAccount")).click();
    }
    
    public void clickTshirts(){
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@title=\"T-shirts\"])[2]")));
    	driver.findElement(By.xpath("(//*[@title=\"T-shirts\"])[2]")).click();
    }
    
    public void addProduct(){
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"product_img_link\"]")));
    	driver.findElement(By.xpath("//*[@class=\"product_img_link\"]")).click();
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"add_to_cart\"]/button")));
    	driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class=\"button-container\"]/a/span)[1]")));
    	driver.findElement(By.xpath("(//*[@class=\"button-container\"]/a/span)[1]")).click();
    	
    }
    
    public String getLoggedInUserName(){
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"account\"]/span")));
    	return driver.findElement(By.xpath("//*[@class=\"account\"]/span")).getText();
    }
    
    public String getShoppingCartSummary(){
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class=\"product-name\"])[4]/a")));
    	return driver.findElement(By.xpath("(//*[@class=\"product-name\"])[4]/a")).getText();
    }
    
	
}
