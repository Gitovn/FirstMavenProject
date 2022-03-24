package annotations;

import org.testng.annotations.Test;

public class AnnotationsInTestNG extends TestBase{

	@Test
	public void verifyNewUserCanBeAddedInSystem() {
		System.out.println("verify New User Can Be Added In System");
		System.out.println("B");
	}

	@Test
	public void verifyUserCanBeEdited() {
		System.out.println("verify User Can Be Edited");
	}

}
