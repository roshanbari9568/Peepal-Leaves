// This program contain Various Selectors 
// It contains Java String Split method execution
// It contains string parsing from Webpage gettext
package RS6Selectors;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class stringcaptnsplit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String username = "Roshan";
		
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse_parent\\eclipse_resources\\ChromePath\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // Invoking Webdriver
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String inputPassword = getPassword(driver);
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		//driver.manage().window().maximize(); // This will maximize the driver window
		
		
		driver.findElement(By.id("inputUsername")).sendKeys(username);; // Sending Username
		driver.findElement(By.name("inputPassword")).sendKeys(inputPassword); // Sending Password
		driver.findElement(By.className("signInBtn")).click(); // Clicking Login Button
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		// The above will fail if it doesnt match
		
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+username+",");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		Thread.sleep(2000);
		
		driver.close(); // Closes the driver browser
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); // Using only class name
		String passwordText = driver.findElement(By.cssSelector("form p")).getText(); // Parent to child in CSS
		
		//Text is -> Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'"); // Split means we are dividing the Text into two halves, from " ' " Single inverted comma
		/* Two halves are as follows  
		 1st halve index[0] = Please use temporary password '
		 2nd halve index[1] = rahulshettyacademy' to Login.
		 */
		String password = passwordArray[1].split("'")[0];
		/* Again spliting from single inverted comma
		 1st halve index[0] = rahulshettyacademy
		 2nd halve index[1] = '
		 We got desired OUTPUT rahulshetty
		 */
		
		return password;
		
		
	}

}
