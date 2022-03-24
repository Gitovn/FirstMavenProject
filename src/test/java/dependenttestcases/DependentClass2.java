package dependenttestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentClass2 {
	
	@Test (priority = 2)
	public void verifyNewUserCanBeAdded() {
		System.out.println("verifyNewUserCanBeAdded");
		Assert.assertTrue(true);
	}
	
	@Test (dependsOnMethods = {"verifyNewUserCanBeAdded"} )
	public void verifyExistingUserCanBeEdited() {
		System.out.println("verifyExistingUserCanBeEdited");
		Assert.assertTrue(true);
	}
	
	@Test (priority = 1)
	public void verifyExistingUserCanBeDeleted() {
		System.out.println("verifyExistingUserCanBeDeleted");
	}

}
