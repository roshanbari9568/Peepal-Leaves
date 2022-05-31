import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathnlinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "E:\\eclipse_parent\\eclipse_resources\\ChromePath\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // Invoking Webdriver
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize(); // This will maximize the driver window
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		

	}

}
