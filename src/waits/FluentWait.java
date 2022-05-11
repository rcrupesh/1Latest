package waits;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FluentWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Rupesh\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		//Declare and initialise a fluent wait
		//FluentWait wait = new FluentWait(driver);
		FluentWait wait =new FluentWait();
		//Specify the timout of the wait
		wait.withTimeout(5000, TimeUnit.MILLISECONDS);
		//Sepcify polling time
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		
		
		
		
		
		
		
		
		//Specify what exceptions to ignore
		wait.ignoring(NoSuchElementException.class);

		//This is how we specify the condition to wait on.
		//This is what we will explore more in this chapter
		wait.until(ExpectedConditions.alertIsPresent());

	}

	private void until(ExpectedCondition<Alert> alertIsPresent) {
		// TODO Auto-generated method stub
		
	}

	private void ignoring(Class<NoSuchElementException> class1) {
		// TODO Auto-generated method stub
		
	}

	private void pollingEvery(int i, TimeUnit milliseconds) {
		// TODO Auto-generated method stub
		
	}

	private void withTimeout(int i, TimeUnit milliseconds) {
		// TODO Auto-generated method stub
		
	}

}
