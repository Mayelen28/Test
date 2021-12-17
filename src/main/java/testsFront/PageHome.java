package testsFront;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageHome {
	@Test
	public void testNavegarPaginaHome() {
		System.setProperty("webdriver.chrome.driver",System.getenv("Driver"));
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.className("gLFyf")).sendKeys("Senai");
		driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
		driver.findElement(By.className("LC201b")).click();
		
		driver.close();
	}

}
