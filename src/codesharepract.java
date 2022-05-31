import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

public class codesharepract {

	// Test Steps - 1. Open url 2. Click on button 3. Enter editor 4. Entering #include <stdio.h> 5. Copying Strings
	@Test
	public void firstcase() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse_parent\\eclipse_resources\\ChromePath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Invoking Webdriver
		driver.get("https://codeshare.io"); // This get Method is to get url address
		Thread.sleep(4000); // Waiting here
		//driver.findElement(By.linkText("Share Code Now")).click();
		driver.findElement(By.cssSelector(".btn-primary")).click();
		Thread.sleep(4000); // Waiting
	
		((WebElement) driver).findElement(By.xpath("//pre[@role='presentation']")).click(); // Element is still not located WIP
		((WebElement) driver).findElement(By.xpath("//pre[@role='presentation']")).sendKeys("#include <stdio.h>"); // Element is still not located WIP
		
		// Here Copying the Keyword "#include <stdio.h>"
		((WebElement) driver).sendKeys(Keys.CONTROL); 
		((WebElement) driver).sendKeys("A");
		((WebElement) driver).sendKeys(Keys.CONTROL);
		((WebElement) driver).sendKeys("C");
		
	}
	
	
	// Test Steps - 1. Open Window two incognito 2. Enter url 3. Click on button 4. Enter editor 5. Paste copied strings 6. Entering Editor 7. Adding Additional String #include <conio.h> 8. Copying both line #include <stdio.h> #include<conio.h>
	@Test
	public void secondcase() throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions(); // Inheriting new Chrome Driver
		options.addArguments("--incognito"); // Defining Incognito
		options.setAcceptInsecureCerts(true);
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		WebDriver idriver = new ChromeDriver(options); // Specifying second chrome Driver = idriver
		idriver.get("https://codeshare.io");
		Thread.sleep(4000); // Waiting here
		idriver.findElement(By.cssSelector(".btn-primary")).click();
		Thread.sleep(4000); // Waiting
		
		// Pasting the copied keyword using selenium keys
		idriver.findElement(By.xpath("//pre[@role='presentation']")).click(); // Element is still not located WIP
		((WebElement) idriver).sendKeys(Keys.CONTROL);
		((WebElement) idriver).sendKeys("V");
		
		//Adding additional String
		idriver.findElement(By.xpath("//pre[@role='presentation']")).click(); // Element is still not located WIP
		idriver.findElement(By.xpath("//pre[@role='presentation']")).sendKeys("#include <conio.h>"); // Element is still not located WIP
		
		// Here Copying the Keyword "#include <stdio.h> && #include<conio.h>"
		((WebElement) idriver).sendKeys(Keys.CONTROL); 
		((WebElement) idriver).sendKeys("A");
		((WebElement) idriver).sendKeys(Keys.CONTROL);
		((WebElement) idriver).sendKeys("C");
		
	}
	
	//Test Steps - 1. Open default chrome 2. Enter URL 3. Click on button 4. Enter Editor 5. Paste copied strings to this tab
	@Test
	public void thirdcase() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver(); // Invoking Webdriver
		driver.get("https://codeshare.io"); // This get Method is to get url address
		Thread.sleep(4000); // Waiting here
		((WebElement) driver).findElement(By.cssSelector(".btn-primary")).click(); 
		((WebElement) driver).findElement(By.xpath("//pre[@role='presentation']")).click(); // Element is still not located WIP
		// Pasting the copied keyword using selenium keys
		((WebElement) driver).sendKeys(Keys.CONTROL);
		((WebElement) driver).sendKeys("V");
		
	}
	
	

}
