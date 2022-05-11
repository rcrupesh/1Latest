package getwindowhandle;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.id("tabButton")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Set<String> allids = driver.getWindowHandles();
		System.out.println(allids);
		Iterator<String> it = allids.iterator();
		String mainpage = it.next();
		String childpage = it.next();
		driver.switchTo().window(childpage);
		Thread.sleep(500);
		
		
		
		
		
		
		
		
		
		
//		driver.switchTo().window(childpage);
		
//		System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
//            driver.close();
//            driver.switchTo().window(mainpage);
//            Thread.sleep(500);
//            System.out.println(driver.findElement(By.id("windowButton")).getTagName());
	}

}
