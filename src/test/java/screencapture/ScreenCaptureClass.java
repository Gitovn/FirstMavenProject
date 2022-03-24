package screencapture;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ScreenCaptureClass {

	@Test
	public void getScreenShot() throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.demo.guru99.com/test/upload/");

		TakesScreenshot ts = (TakesScreenshot)driver;  // driver la jo access ahe tytla thoda access TakesScreenshot la jato
		
		File f = ts.getScreenshotAs(OutputType.FILE);  // screenshot ghetlyver tycha output type File ahe means screenshot chi file create hote
		
		File outFile = new File("C:\\Users\\A\\eclipse-workspace\\FirstMavenProject\\abc.png");  // file save honycha path & file ch name & file konty extension mdhe create hoyla pahije te lihly 
		
		FileUtils.copyFile(f, outFile); // file f mdhe ghetlela screenshot apn file outfile mdhe copy kely
	}
}
