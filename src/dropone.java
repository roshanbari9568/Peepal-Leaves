import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class dropone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://www.selenium.dev/selenium/docs/api/java/overview-summary.html
		
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse_parent\\eclipse_resources\\ChromePath\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // Invoking Webdriver
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize(); // This will maximize the driver window
		
		WebElement ddown = driver.findElement(By.id("dropdown-class-example"));
		Select selectobject = new Select(ddown);
		
		selectobject.selectByValue("option1");
		selectobject.selectByVisibleText("Option2");
		selectobject.selectByIndex(2);
	}

}
