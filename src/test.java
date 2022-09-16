import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class test {

	
public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Varun.Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.makemytrip.com");//Launch the make my trip app
	
	/*Searching flight from delhi to goa with following loactors*/
	driver.findElement(By.cssSelector("ul[class*='fswTabs'] li[data-cy='roundTrip']")).click();
	WebDriverWait Exwait = new WebDriverWait(driver,Duration.ofSeconds(50));
	Exwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='From']")));
	driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin '] //p[normalize-space()='Mumbai, India']")).click();
	//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Delhi");
	//driver.findElement(By.xpath("(//p[normalize-space()='New Delhi, India'])[1]")).click();
	Exwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='To']")));
	driver.findElement(By.xpath("//input[@placeholder='To']")).click();
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Goa");
	driver.findElement(By.cssSelector("li[id='react-autowhatever-1-section-0-item-0'] p[class='font14 appendBottom5 blackText']")).click();
	
	
}
}
