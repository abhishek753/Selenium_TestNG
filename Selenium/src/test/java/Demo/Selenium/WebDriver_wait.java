package Demo.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_wait {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","C:/Users/abhishek/eclipse-workspace/Selenium/Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id='gsr']/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/div/table/tbody/tr/td[1]")).click();

	}

}
