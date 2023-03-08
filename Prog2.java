package ActionClass;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog2 {
// contextClick() method -> Right click
//	doubleClick(webElement)-> use to double click on the webElement
	
	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
	WebElement doubleClickBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	
	Actions a = new Actions(driver);
	a.moveToElement(rightClickBtn).contextClick().build().perform();
	
	for(int i = 0; i<=3; i++)
		{Thread.sleep(100);
	a.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
	Thread.sleep(100);
	a.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(100);
	Alert al1 = driver.switchTo().alert();
	al1.accept();
	
	Thread.sleep(2000);
	Actions b = new Actions(driver);
//	b.moveToElement(doubleClickBtn).doubleClick().build().perform();
	b.doubleClick(doubleClickBtn).build().perform();
	Thread.sleep(100);
	Alert al2 = driver.switchTo().alert();
	al2.accept();
//	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\workspace-Eclipse\\Automation\\ScreenShot\\photo11Action.jpeg");
//	FileHandler.copy(source, dest);
	
	Thread.sleep(3000);
	driver.quit();
	
	}

}
