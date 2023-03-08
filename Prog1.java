package ActionClass;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
        driver.manage().window().maximize();
        WebElement contactNoTextbox = driver.findElement(By.xpath("//input[@name='mobile']"));
        contactNoTextbox.sendKeys("9778789809");
        WebElement emailIDBox = driver.findElement(By.xpath("//input[@name='email']"));
        emailIDBox.sendKeys("komal@123gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='irtct-acc-detail']")).click();
        WebElement createUserNameTextbox = driver.findElement(By.xpath("//input[@name='userName']"));
        WebElement passwordTextbox = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement savePasswordHintTextbox = driver.findElement(By.xpath("//input[@name='confirm password']"));
        WebElement fullNameTextbox = driver.findElement(By.xpath("//input[@name='firstName']"));
     
        WebElement dateDropDown = driver.findElement(By.xpath("//div//input[@name='dob']"));
        
        createUserNameTextbox.sendKeys("Komal Gawali");
        
        passwordTextbox.sendKeys("Komal@123");
        savePasswordHintTextbox.sendKeys("Your name and@123");
        fullNameTextbox.sendKeys("Chaitali Gawalli");
        
        WebElement occupationdropDown = driver.findElement(By.xpath("//button[normalize-space(text())='Select Occupation']"));
        Actions  a = new Actions(driver);
        a.moveToElement(occupationdropDown).click().build().perform();
        Thread.sleep(2000);
//        a.sendKeys(Keys.DOWN).build().perform();
//        Thread.sleep(2000);
//        a.sendKeys(Keys.DOWN).build().perform();
//        Thread.sleep(2000);
//        a.sendKeys(Keys.DOWN).build().perform();
//        Thread.sleep(2000);
//        a.sendKeys(Keys.DOWN).build().perform();
//        Thread.sleep(2000);
//        a.sendKeys(Keys.DOWN).build().perform();
        for(int i = 0; i<=5; i++) {
        	Thread.sleep(2000);
        	a.sendKeys(Keys.DOWN).build().perform();
        	 }
          a.sendKeys(Keys.ENTER).build().perform();
        
        Thread.sleep(3000);
       
//       dateDropDown.sendKeys("28/12/1998");
                   for(int j = 0; j<= 15; j++)
                   {
                	   Thread.sleep(1000);
                	   dateDropDown.click();
                   }
       
       
       
       
       driver.findElement(By.xpath("//p[text()='Female']")).click();
        driver.findElement(By.xpath("//p[text()='Unmarried']")).click();
         
        WebElement securityQue = driver.findElement(By.xpath("//button[normalize-space(text())='What is your pet name?']"));
        a.moveToElement(securityQue).click().build().perform();
        for(int j=0; j<2; j++)
        	{Thread.sleep(1000);
        a.sendKeys(Keys.DOWN).build().perform();
        	}
        Thread.sleep(1000);
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='securityAns']")).sendKeys("Pipra Highschool Pipra");
        
        
        File source = ((ChromeDriver)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\workspace-Eclipse\\Automation\\ScreenShot\\photorailyatri.jpeg");
        FileHandler.copy(source, dest);
        
        
          Thread.sleep(3000);
          driver.quit();
	}

}
