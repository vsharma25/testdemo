import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class proractorassignment {
	
public static void main(String[] args)   {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Varun.Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//Check if Home is selected or Not
		System.out.println(driver.findElement(By.cssSelector(".nav-item")).isSelected());
		driver.findElement(By.cssSelector(".nav-item")).click();
		System.out.println(driver.findElement(By.cssSelector(".nav-item")).isSelected());
		
		driver.findElement(By.name("name")).sendKeys("ENTER_NAME");
		driver.findElement(By.name("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("ENTER_PASSWORD");
		System.out.println(driver.findElement(By.className("form-check-input")).isSelected());
		driver.findElement(By.className("form-check-input")).click();
		System.out.println(driver.findElement(By.className("form-check-input")).isSelected());
		
		// Handling the Select WebElement
		//WebElement dropdown =(WebElement) driver.findElements(By.cssSelector(".form-control"));
		//Select gender = new Select(dropdown);
		//gender.selectByIndex(1);
		
		//Handling Radio buttons
		driver.findElements(By.cssSelector("input[type='radio']")).size();
		//driver.findElement(By.cssSelector("//div/input[id='inlineRadio1']")).click();
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("05/09/2022");
		driver.findElement(By.className("btn-success")).click();
		System.out.println(driver.findElement(By.className("alert-success")).getText());
	
		
}
}
