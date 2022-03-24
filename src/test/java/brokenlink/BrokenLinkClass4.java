package brokenlink;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinkClass4 {

	@Test
	public void testLink() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/links");
		String baseUrl = "https://demoqa.com/";
		String actualLink = null;

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());

		for (WebElement each : allLinks) {

			String link = each.getAttribute("href");

			if (link != null) {
				if (link.contains("javascript:")) {
					actualLink = baseUrl + each.getAttribute("id");
					System.out.println(actualLink);
				} else {
					actualLink = link;
					System.out.println(actualLink);
				}
			}

		}

		driver.close();

	}

}
