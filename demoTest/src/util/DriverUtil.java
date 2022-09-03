package util;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtil {
	
	@Before
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/home/mohamadz/Downloads/browserdriver/chromedriver_linux64/chromedriver");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://gmail.com/");
	driver.manage().window().maximize();
	}
}
