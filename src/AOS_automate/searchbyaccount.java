package AOS_automate;

import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchbyaccount {

	public static void main(String[] args) {
		
		
/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Varun.Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://agent-os.preprod.portal.charter.com/#/");
		driver.get("admin:admin@https://login.esso-uat.charter.com:8443/");
		driver.get("https://login.esso-uat.charter.com:8443/nidp//app/login?sid=0&option=credential");
		driver.findElement(By.id("username")).sendKeys("vsharma");
		driver.findElement(By.name("Ecom_Password")).sendKeys("West123!@#");
		driver.findElement(By.name("loginButton2")).click();
		driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();*/
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Varun.Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://agent-os.preprod.portal.charter.com/#/");
		driver.get("admin:admin@https://login.esso-uat.charter.com:8443/");
		driver.get("https://login.esso-uat.charter.com:8443/nidp//app/login?sid=0&option=credential");
		driver.findElement(By.id("username")).sendKeys("vsharma");
		driver.findElement(By.name("Ecom_Password")).sendKeys("Nest123!@#");
		driver.findElement(By.name("loginButton2")).click();
		
		WebDriverWait Exwait = new WebDriverWait(driver,Duration.ofSeconds(20));
		Exwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Search']")));
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
		
		driver.findElement(By.id("billerAccountNumber")).sendKeys("8245123914176563");
		driver.findElement(By.cssSelector("button[class='styles__button-primary___3lyeZ']")).click();
		driver.findElement(By.cssSelector("button[value='VerifyCaller']")).click();
		
		
      /* WebElement GWHeader= driver.findElement(By.cssSelector(".jss17"));
       List<WebElement> Tab= (List<WebElement>) ((Collection<WebElement>) GWHeader).stream().filter(header->header.findElement(By.cssSelector(".MuiTab-wrapper jss25")).
        		getText().equals("Device Management")).findFirst().orElse(null);*/
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter tab name:");
          String name = sc.nextLine();
          
         WebElement header=driver.findElement(By.cssSelector(".jss17"));
         List<WebElement> AgentTabs= header.findElements(By.cssSelector(".MuiTab-wrapper.jss25"));
         
        for(int i=1; i<AgentTabs.size(); i++)
        {
           String tabText= AgentTabs.get(i).getText();
           if(tabText.equalsIgnoreCase(name))
           {
               AgentTabs.get(i).click();
           }
           
        }
		
}
}
