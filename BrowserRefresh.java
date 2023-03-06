package feb28;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserRefresh {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		driver.navigate().to(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys(Keys.F5);
		Thread.sleep(2000);

	}

}
