import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class invokebrowser {
	public static void main(String[] args) throws InterruptedException  {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Varun.Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://agent-os.preprod.portal.charter.com/#/");
		driver.get("admin:admin@https://login.esso-uat.charter.com:8443/");
		driver.get("https://login.esso-uat.charter.com:8443/nidp//app/login?sid=0&option=credential");
		driver.findElement(By.id("username")).sendKeys("vsharma");
		driver.findElement(By.name("Ecom_Password")).sendKeys("West123!@#");
		driver.findElement(By.name("loginButton2")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".MuiButton-label")).click();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("8347100016292677");

	
	}

}
