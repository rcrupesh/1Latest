package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_validation 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");//system=class
		ChromeOptions option=new ChromeOptions();  //class
		option.addArguments("incognito");
		WebDriver driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("iamrupesh00@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rupesh44@");
		//stale elements exception
		 WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", nextButton);
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(2000));
		WebElement composeButton = driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']"));
		wait.until(ExpectedConditions.visibilityOf(composeButton)).click();
		
		//composeButton.click();//click on compose button
		driver.findElement(By.xpath("(//textarea[@class='vO'])[1]")).sendKeys("iamrupesh00@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Test Mail");
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Test Email Body");
		driver.findElement(By.xpath("(//div[@class='J-J5-Ji J-JN-M-I-JG'])[5]")).click();//click on dots
		driver.findElement(By.xpath("(//div[@class='J-N-Jz'])[9]")).click();//click on label
		driver.findElement(By.xpath("(//div[text()='Social'])[2]")).click();//click on social
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		driver.findElement(By.xpath("(//div[@tabindex='1'])[11]")).click();//click on send
		System.out.println("send message succesfully");
		Thread.sleep(5000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.findElement(By.xpath("//div[text()='Social']")).click();//click on social button
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.findElement(By.xpath("((//div[@class='Cp'])[4]//span)[1]")).click();//click on star
		System.out.println("click on star succeccfullly");
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		driver.findElement(By.xpath("((//div[@class='Cp'])[4]//div)[5]")).click();  //click on message
		System.out.println("open  mail successfully");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		Thread.sleep(3000);
		 String subject = driver.findElement(By.xpath("//h2[@class='hP']")).getText();
		 String Body = driver.findElement(By.xpath("//div[@class='ii gt'][1]")).getText();
		String Expectedsubject="Test Mail";
		String ExpectedBody="Test Email Body";
		
		if(subject.equals(Expectedsubject))
		{
			System.out.println("subject is verified");
		}
		else
		{
			System.out.println("subject not verified");
		}
		
		if(Body.equals(ExpectedBody))
		{
			System.out.println("Body is verified");
		}
		else
		{
			System.out.println("Body not verified");
		}
		
		//ElementClickInterceptedException
		WebElement label = driver.findElement(By.xpath("(//div[@class='asb T-I-J3 J-J5-Ji'])[2]"));
		Actions act=new Actions(driver);
		act.click(label).perform();
		WebElement social = driver.findElement(By.xpath("//div[@class='J-M-Jz aiL']/div[1]"));
		String status = social.getAttribute("aria-checked");
		if(status.equals("true"))
		{
			System.out.println("label as  social");
		}
		else
		{
			System.out.println("label is not social");
		}
		
		
	
	}

}
