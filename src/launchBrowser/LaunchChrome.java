package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bisho\\OneDrive\\Desktop\\Selenium june2021\\1st_selenium_project\\driver\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//get web site
		driver.get("https://www.google.com/");
		////identify web element and perform action
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("selenium");
	
		driver.findElement(By.name("btnk")).click();
		
		//wait
		Thread.sleep(3000);
		driver.close();
		
		
		
	}
	
}
