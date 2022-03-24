package annotations;

import org.testng.annotations.Test;

public class Annotations2 extends TestBase {

	@Test
	public void A() {
		System.out.println("Method A");
	}

	@Test
	public void B() {
		System.out.println("Method B");
	}

}
