package assertionsintestng;

import static org.testng.Assert.assertNull;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionClass3 {
	AssertionClass3 obj;
	AssertionClass2 obj2 = new AssertionClass2();

	@Test
	public void A() {
		System.out.println("Method A");
		Assert.assertNull(obj);
		// Assert.assertNull(obj2, "Object is not null");
		System.out.println("after assertion method A");
	}

	@Test
	public void B() {
		System.out.println("Method B");
		// Assert.assertNotNull(obj, "Object is not initialized");
		Assert.assertNotNull(obj2);
		System.out.println("After assertion method B");
	}

}
