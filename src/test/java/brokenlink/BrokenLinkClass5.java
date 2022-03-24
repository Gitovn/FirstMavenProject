package brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinkClass5 {

	@Test
	public void testLink() throws IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/links");
		String baseUrl = "https://demoqa.com/";
		String actualLink = null;

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		for (WebElement each : allLinks) {

			String link = each.getAttribute("href");

			if (link != null) {
				if (link.contains("javascript:")) {
					actualLink = baseUrl + each.getAttribute("id");
				} else {
					actualLink = link;
				}
				printInformationAboutLink(actualLink);
			}
		}
		driver.close();

	}

	public static void printInformationAboutLink(String actUrl) throws IOException {

		URL url = new URL(actUrl);

		HttpURLConnection http = (HttpURLConnection) url.openConnection();

		http.setConnectTimeout(15000);

		http.connect();

		if (http.getResponseCode() >= 400) {
			System.out.println(actUrl);
			System.out.println("Above url is broken with status code " + http.getResponseCode()
					+ "  Response message is" + http.getResponseMessage());
		}
	}

}
