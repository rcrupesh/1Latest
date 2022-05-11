package getwindowhandle;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		Set<String> allids = driver.getWindowHandles();
		System.out.println(allids);
//        Iterator<String> it = allids.iterator();
//        String idmainpage = it.next();
//        System.out.println(idmainpage);
//        driver.switchTo().window(idmainpage);
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
       
       
        
	}

}
