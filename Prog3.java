package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//  Home - qavalidation
public class Prog3 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://qavalidation.com/");
		
		WebElement btn1 = driver.findElement(By.xpath("//span[text()='Selenium']"));
		
		Actions a = new Actions(driver);
//		Thread.sleep(200);
		a.moveToElement(btn1).build().perform();
		
		  WebElement dropList = driver.findElement(By.xpath("(//ul[@class='sub-nav hover-style-bg level-arrows-on'])[1]"));
		Actions b = new Actions(driver);
		b.moveToElement(dropList).build().perform();
//		Thread.sleep(2000);
		b.sendKeys(Keys.DOWN).build().perform();
		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
		b.sendKeys(Keys.DOWN).build().perform();
		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
		b.sendKeys(Keys.DOWN).build().perform();
		System.out.println(driver.getTitle());
		
//		Thread.sleep(2000);
		driver.close();
	}

}
