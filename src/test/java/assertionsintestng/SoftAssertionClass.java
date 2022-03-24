package assertionsintestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionClass {
	SoftAssert sAssert = new SoftAssert();
	AssertionClass3 obj;

	@Test
	public void A() {
		System.out.println("Method A");
		boolean flag = true;
		sAssert.assertTrue(true);
		sAssert.assertEquals("HI", "HELLO");
		sAssert.assertAll();
		System.out.println("after assertion method A");

	}
	@Test
	public void B() {
		System.out.println("Method B");
		sAssert.assertNull(obj);
		System.out.println("After assertion method B");
	}
}
