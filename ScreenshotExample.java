package feb28;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {

	public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "D:\\Browser\\ChromeDriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			
			TakesScreenshot  ts    =  (TakesScreenshot)driver;
		File file =	ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("./ScreenshotFeb28/FacebookMorning930.png"));
		
		FileUtils.copyFile(file, new File("D:\\FacebookFeb28Morning930.png"));
		
		                                 

	}

}
