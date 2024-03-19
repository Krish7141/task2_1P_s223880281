package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "F:/software/chromedriver-win64/chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		WebElement firstName = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[1]/div/div/div/input"));
        firstName.sendKeys("Ahsan");
		
        WebElement lastName = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[2]/div/div/div/input"));
        lastName.sendKeys("Habib");
        
        WebElement phoneNumber = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[3]/div/div/div/input"));
        phoneNumber.sendKeys("0454566954");
        
        WebElement email = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[4]/div/div/div/input"));
        email.sendKeys("Ahsan@gmail.com");
        
        WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[5]/div/div/div/input"));
        password.sendKeys("Abc@123456");
        
        WebElement ConfirmPassword = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[7]/div/div/div/input"));
        ConfirmPassword.sendKeys("Xyz@123456");
        
        WebElement submit = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[12]/button"));
        submit.click();
				
		
		// Sleep a while
		sleep(5);
		
		// close chrome driver
		driver.close();	
	}
	public static void hungryjacks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "F:/software/chromedriver-win64/chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		WebElement firstName = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/div[2]/div/div/form/div[1]/label/input"));
        firstName.sendKeys("Ahsan");
		
        WebElement lastName = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/div[2]/div/div/form/div[2]/label/input"));
        lastName.sendKeys("Habib");
        
        WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/div[2]/div/div/form/div[3]/label/input"));
        email.sendKeys("Ahsan@gmail.com");
        
        WebElement phoneNumber = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/div[2]/div/div/form/div[4]/label/input"));
        phoneNumber.sendKeys("0454566954");
        
        WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/div[2]/div/div/form/div[5]/label/input"));
        password.sendKeys("Abc@123456");
        
        WebElement submit = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/div[2]/div/div/form/button"));
        submit.click();
				
		
		// Sleep a while
		sleep(5);
		
		// close chrome driver
		driver.close();	
	}
	
	
}
