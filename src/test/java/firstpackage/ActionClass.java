package firstpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/buttons");

		Actions act = new Actions(driver);

		// act.click(driver.findElement(By.xpath("//*[starts-with(text(),'Click
		// Me')]"))).build().perform();

		act.moveToElement(driver.findElement(By.xpath("//*[starts-with(text(),'Click Me')]"))).click().build()
				.perform();

		act.contextClick(driver.findElement(By.xpath("//*[@id ='rightClickBtn' ]"))).build().perform();

		act.doubleClick(driver.findElement(By.xpath("//*[@id ='doubleClickBtn' ]"))).build().perform();

		driver.close();

	}

}
