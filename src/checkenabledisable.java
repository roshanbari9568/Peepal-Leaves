// This program is to check if element is enable or disabled present in a html document

// https://soshace.com/top-12-string-programs-for-your-next-java-interview/

package RS7Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnableDisableElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse_parent\\eclipse_resources\\ChromePath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Invoking Webdriver
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize(); // This will maximize the driver window
		
		// Get Attribute used to fetch the attribute of element
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); // Not selected value
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); // Selected Value
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Element is Enabled !! ");
		}
		else if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Element is Disabled !!");
		}
		else
		{
			Assert.assertTrue(false); // Failing the script
			//System.out.println(" Something went wrong !!");
		}
		
		

	}

}
