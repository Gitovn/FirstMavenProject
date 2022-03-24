package brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

public class BrokenLinkClass {

	@Test
	public void testLink() throws IOException {
		String link = "https://demoqa.com/links";

		URL url = new URL(link);

		HttpURLConnection http = (HttpURLConnection) url.openConnection();

		http.setConnectTimeout(15000);

		http.connect();

		System.out.println(http.getResponseCode());
		System.out.println(http.getResponseMessage());
	}

}
