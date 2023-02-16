package Assignment;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	        
	        driver.findElement(By.name("q")).sendKeys("Ipad");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//Pop-Up Close
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
	        Thread.sleep(3000);
	        
	      //Program for Windows Handler 
	        Set<String> WindowsHandler = driver.getWindowHandles();
	        System.out.println(WindowsHandler);
	        
	              Iterator<String> iterator = WindowsHandler.iterator();
	                               String ParentWindow = iterator.next();
	                               String Childwindow = iterator.next();
	                               
	                               driver.switchTo().window(Childwindow);
	                               Thread.sleep(10000);
	                        driver.findElement(By.xpath("//button[@type='button']")).click();
	                        Thread.sleep(2000);
	                        driver.findElement(By.xpath("//input[@maxlength='auto']")).sendKeys("123456789");
	                        Thread.sleep(1000);
	        		       driver.close();
	        		       driver.quit();

	}

}
