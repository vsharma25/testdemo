import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handlingdropdown {

	

	public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Varun.Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/loginpagePractise/");
			driver.findElement(By.cssSelector("#username")).sendKeys("rahulshettyacademy");
			driver.findElement(By.cssSelector("#password")).sendKeys("learning");
			driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
			WebDriverWait wait =new WebDriverWait(driver,Duration.ofMillis(5000));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#okayBtn")));
			driver.findElement(By.cssSelector("#okayBtn")).click();
		
			WebElement dropdown=driver.findElement(By.cssSelector("select[class='form-control']"));
		
			Select consult= new Select(dropdown);
			consult.selectByVisibleText("Consultant");
			System.out.println(driver.findElement(By.id("terms")).isSelected());
			driver.findElement(By.id("terms")).click();
			System.out.println(driver.findElement(By.id("terms")).isSelected());
			driver.findElement(By.id("signInBtn")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='col-lg-9")));


			String[] itemselect = {"iphone X",  "Blackberry"};
			addtocart(driver,itemselect);			
		
	}

	public static  void addtocart(WebDriver driver, String[] itemselect) {
		
		List<WebElement> product = driver.findElements(By.cssSelector(".card-footer .btn-info"));;
		System.out.println(product.size());
		for(int i = 0;i<product.size();i++){
			
			product.get(i).click();
			
			List<String> itemselectList = Arrays.asList(itemselect);
			
			if(itemselectList.contains(product)){
			driver.findElement(By.cssSelector(".card-footer .btn-info")).click();
			
			}
		driver.findElement(By.partialLinkText("Checkout")).click();
			
		}
	}
}
	
	


