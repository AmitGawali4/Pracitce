package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test1 {
	
	public static void  main(String args[]) {
		
		/*System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		Capability= DesiredCapabilities.chrome();
		Capability.setBrowserName("chrome");
		*/
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\C10232C\\Desktop\\Seleniumworkspace\\DemoMavenEclipseProject\\drivers\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement keys = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("btnK")));
	
		keys.click();
	
	}

}
