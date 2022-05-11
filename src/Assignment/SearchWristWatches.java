package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchWristWatches {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Wrist Watches");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//span[text()='Analogue']")).click();//click on analogue
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.xpath("//span[text()='Leather']")).click();  //click on leather
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.xpath("(//span[text()='See more'])[1]")).click();  //click on see more
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.xpath("(//span[text()='Titan'])[2]")).click();//click on Titan
		
		driver.findElement(By.xpath("//span[text()='25% Off or more']")).click();//click on discount
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[5]")).click();  //click on 5th element
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		
		
		
		

	}

}
