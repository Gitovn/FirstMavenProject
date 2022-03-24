package dependenttestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentClass {
	
	@Test
	public void verifyNewUserCanBeAdded() {
		System.out.println("verifyNewUserCanBeAdded");
		Assert.assertTrue(true);
	}
	
	@Test (dependsOnMethods = {"verifyNewUserCanBeAdded"})
	public void verifyExistingUserCanBeEdited() {
		System.out.println("verifyExistingUserCanBeEdited");
		Assert.assertTrue(false);
	}
	
	@Test (dependsOnMethods = {"verifyExistingUserCanBeEdited"})
	public void verifyExistingUserCanBeDeleted() {
		System.out.println("verifyExistingUserCanBeDeleted");
	}

}
