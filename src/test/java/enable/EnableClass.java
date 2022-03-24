package enable;

import org.testng.annotations.Test;

import annotations.TestBase;

public class EnableClass extends TestBase {

	@Test
	public void sample1() {
		System.out.println("Sample 1");
	}

	@Test(enabled = false)
	public void sample2() {
		System.out.println("Sample 2");
	}

	@Test
	public void sample3() {
		System.out.println("Sample 3");
	}
}
