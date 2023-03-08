package ActionClass;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ScrollPage {

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.amazon.in/");
	  WebElement additionalItems = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div[5]"));
	
	JavascriptExecutor jE = ((JavascriptExecutor)driver);
//	jE.executeScript("window.scrollBy(0, 1000)");
//	jE.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	Thread.sleep(200);
	jE.executeScript("arguments[0].scrollIntoView();",	additionalItems);
	Thread.sleep(3000);
//	jE.executeScript("window.scrollBy(0, document.body.scrollHeight)");
	
	driver.close();
	}

}
