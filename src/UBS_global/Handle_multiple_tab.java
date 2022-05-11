package UBS_global;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Handle_multiple_tab 
{
	WebDriver driver;
	WebElement DashBoard;
	@BeforeClass
	public void LaunchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\R_Rupesh\\selenium\\chromedriver.exe");
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver=new ChromeDriver(option);
		driver.get("https://kite.zerodha.com/");
		
	}
	@BeforeMethod
	public void LoginToApp() throws InterruptedException
	{
		driver.findElement(By.id("userid")).sendKeys("NNB285");
		driver.findElement(By.id("password")).sendKeys("Rupesh44@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(3000));
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("pin")));
		driver.findElement(By.id("pin")).sendKeys("909699");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='app-nav']/a[1]")));
	}
	@Test
	public void test() throws InterruptedException
	{
		
		
//		WebElement DashBoard = driver.findElement(By.xpath("//div[@class='app-nav']/a[1]"));
//		DashBoard.click();
//		System.out.println(DashBoard.getTagName());
		
		
		
		
		
		
		
		
		
		List<WebElement> VariousTabs = driver.findElements(By.xpath("//div[@class='app-nav']/a"));
		
	//	Iterator it=VariousTabs.iterator();
//		while (it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		
		
		
		for(WebElement w:VariousTabs)
		{
			w.click();
			System.out.println(w.getText());
			Thread.sleep(1000);
		}
		 List<WebElement> AllLink = driver.findElements(By.xpath("//a"));
		 System.out.println("size of link is "+AllLink.size());
			for(WebElement w:AllLink)
			{
				System.out.println(w);
				
			}
			
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@class='user-id']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//a[text()=' Logout']")).click();
		
	}
	@AfterClass
	public void closeBrowser(){
		{
			driver.close();
		}
	}
//	@Test
//	public void GetAllLink()
//	{
////		 List<WebElement> AllLink = driver.findElements(By.xpath("//a"));
////		for(WebElement w:AllLink)
////		{
////			System.out.println(w);
////			System.out.println("size of link is "+w.getSize());
////			
////		}
//	}
  
}
