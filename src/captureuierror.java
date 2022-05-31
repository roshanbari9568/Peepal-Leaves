import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class captureuierror {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse_parent\\eclipse_resources\\ChromePath\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // Invoking Webdriver
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize(); // This will maximize the driver window
		
		driver.findElement(By.id("inputUsername")).sendKeys("standard_user");; // Sending Username
		driver.findElement(By.name("inputPassword")).sendKeys("secret_sauce");; // Sending Password
		driver.findElement(By.className("signInBtn")).click(); // Clicking Login Button
		
		Thread.sleep(3000);
		
		
		System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText()); // Here p is input type and error is class

		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); // Here p is input type and error is class
		

	}

}
