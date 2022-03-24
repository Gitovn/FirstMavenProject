package invocation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationClass {
	int count = 0;

	@Test(invocationCount = 5)
	public void sampleTestCase() {

		count++;
		System.out.println("sample test case");
		if (count == 3) {
			Assert.assertTrue(false);
		}
	}

}
