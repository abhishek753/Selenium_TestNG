package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void loginWithEmail() {
		System.out.println("Inside Test login with Email.");
	}
	
	@Test
	public void loginWithFacebook() {
		System.out.println("Inside Test login with Facebook.");
		Assert.assertEquals("Test", "Test1");
	}

}
