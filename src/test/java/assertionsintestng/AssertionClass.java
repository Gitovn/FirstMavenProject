package assertionsintestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionClass {

	@Test
	public void A() {
		System.out.println("Method A");
		boolean flag = true;
		Assert.assertTrue(true, "Compose button is not displayed");
		Assert.assertTrue(flag, "Logged is user name is not displayed");
		System.out.println("after assertion");
	}

	@Test
	public void B() {
		System.out.println("Method B");
		Assert.assertTrue(false, "User is not found");
		Assert.assertFalse(false);
		Assert.assertTrue(isUserDisplayed("suraj"));
		//user display zalyver suppose to user delete kela tr to ata nkoy display hoyla
		Assert.assertFalse(isUserDisplayed("suraj"));
		System.out.println("After assertion");
	}

	@Test
	public boolean isUserDisplayed(String name) {

		WebDriver driver = new ChromeDriver();
		boolean flag = false;

		try {
			flag = driver.findElement(By.xpath("kjsfhssjk" + name + "jsk")).isDisplayed();
		} catch (Exception e) {

		}
		return flag;
	}

}
