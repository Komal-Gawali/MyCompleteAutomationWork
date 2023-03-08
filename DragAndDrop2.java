package ActionClass;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        
        driver.findElement(By.xpath("//li[@id='Accepted Elements']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@id='Propagation']")).click();
        Thread.sleep(2000);
       
//        WebElement sortableBtn = driver.findElement(By.xpath("//span[text()='Sortable']"));
//        sortableBtn.click();
//        WebElement sortPopup = driver.findElement(By.xpath("//span[text()='Close']"));
//       
//        WebElement dragDowm = driver.findElement(By.xpath("(//span[text()='DropDown Menu'])[3]"));
//        dragDowm.click();
        List<WebElement> list = driver.findElements(By.xpath("//div[@id='nav_menu-6']//li"));
        
        System.out.println(list.size());
        
       
      
        driver.close();
	}

}
