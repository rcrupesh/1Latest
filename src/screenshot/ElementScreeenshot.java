package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ElementScreeenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		    driver.get("https://www.facebook.com/");
		     WebElement element = driver.findElement(By.xpath("//div[@class='_6luv _52jv']"));
		    File scrFile = element.getScreenshotAs(OutputType.FILE);
		    FileHandler.copy(scrFile, new File("D:\\selenium\\Screenshot\\sc1.png"));
		   // FileUtils.copyFile(scrFile, new File("./image.png"));
		    driver.quit();

	}

}
