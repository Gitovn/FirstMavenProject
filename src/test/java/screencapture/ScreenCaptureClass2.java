package screencapture;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScreenCaptureClass2 {
	WebDriver driver;

	@Test(priority = 2)
	public void getScreenShot() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.demo.guru99.com/test/upload/");

		driver.findElement(By.id("uploadfile_0")).sendKeys(System.getProperty("user.dir") + "\\KTCTC.xlsx");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		String txt = driver.findElement(By.xpath("//*[@id='res']/center")).getText();

		Assert.assertEquals(txt, "1 file uploaded successfully");

	}

	@Test(priority = 1, enabled = false)
	public void sampleTestCase() {
		System.out.println("Hello");
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		
		// !result.isSuccess()
		if (result.FAILURE == 2) {

			TakesScreenshot ts = (TakesScreenshot) driver;

			File f = ts.getScreenshotAs(OutputType.FILE);

			File outFile = new File("C:\\Users\\A\\eclipse-workspace\\FirstMavenProject\\abc.png");

			FileUtils.copyFile(f, outFile);

		} else if (result.SUCCESS == 1) {
			System.out.println("Test case is passed");
		}

		else {
			System.out.println("Test case is skipped");
		}
	}
}
