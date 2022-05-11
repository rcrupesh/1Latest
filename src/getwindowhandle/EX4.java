package getwindowhandle;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.id("messageWindowButton")).click();
		Set<String> allids = driver.getWindowHandles();
		Iterator<String> it = allids.iterator();
		String mainpage = it.next();
		String childpage = it.next();
		driver.switchTo().window(childpage);
		driver.manage().window().maximize();
		Thread.sleep(500);
		System.out.println(driver.findElement(By.xpath("//body[contains(text(),'Knowledge')]")).getText());
		
		Thread.sleep(500);
		//driver.close();
		driver.switchTo().window(mainpage);
		 System.out.println(driver.findElement(By.id("windowButton")).getTagName());
		
	}

}
