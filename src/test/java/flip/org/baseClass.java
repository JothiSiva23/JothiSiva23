package flip.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	
	public static WebDriver driver;
	public static WebDriver chromebrowser() {
		WebDriverManager.chromedriver().setup();
		return driver=new ChromeDriver();
		
	}

	public static void urllaunch(String url) {
	driver.get(url);	
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void current(String url) {
		driver.getCurrentUrl();

	}
	
	public static void sendKeys(WebElement f, String text) {
		f.sendKeys(text);
		

}
public static void click(WebElement e) {
	e.click();
}
	
public static void max() {
	driver.manage().window().maximize();
}

public static void wait1(long secs) {
	driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
}

public static void enter() throws AWTException {
	Robot r = new Robot();
	
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

}



}	
	

	
	
