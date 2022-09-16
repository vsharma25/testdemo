import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addtocartlogic {
public static void main(String[] args)   {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Varun.Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/shop");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='col-lg-9']")));
		String[] itemselect = {"iphone X",  "Blackberry"};
		addtocart(driver,itemselect);			
	
}

public static void addtocart(WebDriver driver, String[] itemselect) {
	
	List<WebElement> product = driver.findElements(By.cssSelector(".card h-100"));;
	System.out.println(product.size());
	for(int i = 0;i<product.size();i++){
		
		String Name = product.get(i).getText();
		
		List<String> itemselectList = Arrays.asList(itemselect);
		
		if(itemselectList.contains(Name)){
		driver.findElement(By.xpath("//div[@class='card h-100']/button")).click();
		
		}
		
	}
}

}
