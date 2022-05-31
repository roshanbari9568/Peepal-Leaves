import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse_parent\\eclipse_resources\\ChromePath\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // Invoking Webdriver
		
		driver.get("https://www.youtube.com/");
		
		
		
		String Title = driver.getTitle();
		
		if(Title.equals("YouTube"))
		{
			System.out.println(Title +" is genuine website");
		}
		
		//driver.close(); // It closes the window
		//driver.quit(); // It closes the driver
		
		

	}

}
