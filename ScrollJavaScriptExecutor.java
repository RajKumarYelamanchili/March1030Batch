package feb28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.JavascriptExecutor;

public class ScrollJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.rediff.com");
		Thread.sleep(2000);
		
		 JavascriptExecutor  js =  (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0,1000)");
		 
		 Thread.sleep(5000);
		
		 js.executeScript("window.scrollBy(0,2000)");
		 
		 Thread.sleep(5000);
		 
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 Thread.sleep(5000);
		

	}

}
