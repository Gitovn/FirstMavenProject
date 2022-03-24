package assertionsintestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionClass2 {

	@Test
	public void A() {
		System.out.println("Method A");
		String data = "1 file uploaded successfully";
		// Assert.assertEquals(data, "1 file uploaded", "file upload message is not as per expectation");
		Assert.assertEquals(data, "1 file uploaded successfully");
		System.out.println("after assertion method A");
	}

	@Test
	public void B() {
		System.out.println("Method B");
		String data = "500";
		// Assert.assertEquals(data, 500);
		Assert.assertNotEquals("HI", "HELLO");
		Assert.assertNotEquals("HI", "HI");
		System.out.println("After assertion method B");
	}

}
