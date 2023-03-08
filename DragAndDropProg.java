package ActionClass;

import java.awt.Desktop.Action;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.google.common.annotations.VisibleForTesting;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropProg {
@VisibleForTesting
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
//		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\workspace-Eclipse\\Automation\\ScreenShot\\photoDD.jpeg");
//		FileHandler.copy(source, dest);
		
    	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
     	Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[@id='Photo Manager']")).click();
     	WebElement trashBox = driver.findElement(By.xpath("//div[@id='trash']"));
     	WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
     	WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
     	WebElement img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
     	WebElement img4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
     	
     	Actions a = new Actions(driver);
     	Thread.sleep(2000);
//     	a.moveToElement(img1).clickAndHold().moveToElement(trashBox).release().build().perform();
     	a.dragAndDrop(img1, trashBox).build().perform();
     	Thread.sleep(2000);
     	a.moveToElement(img2).clickAndHold().moveToElement(trashBox).release().build().perform();
     	Thread.sleep(2000);
     	a.moveToElement(img3).clickAndHold().moveToElement(trashBox).release().build().perform();
     	Thread.sleep(2000);
     	a.moveToElement(img4).clickAndHold().moveToElement(trashBox).release().build().perform();
     	a.dragAndDrop(img3, trashBox).build().perform();    
     	
     	Thread.sleep(2000);
     	
//     	driver.switchTo().defaultContent();
     	
//     	WebElement notDragable = driver.findElement(By.xpath("//div[@id='draggable-nonvalid']"));
//     	WebElement dragMe = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
//     	WebElement dropPlace = driver.findElement(By.xpath("//div[@id='droppable']"));
//     	Thread.sleep(2000);
//     	driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]")));
//     	driver.findElement(By.xpath("//li[text()='Accepted Elements']")).click();
//    	Thread.sleep(2000);
//     	
//     	Actions b = new Actions(driver);
//     	
//     	b.moveToElement(notDragable).clickAndHold(notDragable).moveToElement(dropPlace).release().build().perform();
     	
//     	File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest1 = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\workspace-Eclipse\\Automation\\ScreenShot\\photoDragD.jpeg");
//		FileHandler.copy(source1, dest1);
		Thread.sleep(3000);
		driver.close();
	}

}
