package LearningTestNG;

import org.testng.annotations.Test;

public class GroupingTest {
	
	@Test(groups={"performance"})
	public void feature1() {
		System.out.println("Inside Feature 1");
	}
	
	@Test(groups={"Regression"})
	public void feature2() {
		System.out.println("Inside Feature 2");
	}
	
	@Test(groups={"performance","Regression`"})
	public void feature3() {
		System.out.println("Inside Feature 3");
	}

}
