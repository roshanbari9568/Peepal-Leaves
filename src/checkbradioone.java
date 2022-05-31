

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class checkbradioone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse_parent\\eclipse_resources\\ChromePath\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // Invoking Webdriver
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize(); // Maximize the screen
		
		WebElement Drag = driver.findElement(By.id("mousehover"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Drag); // Here we are dragging Drag "mousehover" ID
		actions.perform(); // Performing move To Element
		
		driver.findElement(By.xpath("//input[@value='radio1']")).click(); // Relative Path
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/fieldset[1]/label[2]/input[1]")).click(); // Absolute Path
		Thread.sleep(2000);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkBoxOption2")).click();
		Thread.sleep(2000);
		
		
		

	}

}
