package testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependacyVsPriotiseTestInTestNG {

	@Test(priority = 0)
	public void test1() {
		System.out.println("test1() ");
		Assert.assertTrue(false);
	}

	@Test(priority = 0)
	public void test2() {
		System.out.println("test2() ");
		Assert.assertTrue(true);
	}

	
	@Test
	public void test5() {
		System.out.println("test5() ");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test3() {
		System.out.println("test3() ");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = { "test3" })
	public void test4() {
		System.out.println("test4() ");
		Assert.assertTrue(true);
	}

}