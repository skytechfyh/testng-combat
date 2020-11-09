package com.testng.example;

import org.testng.annotations.*;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc
 */
public class TestFixturesExtend extends TestFixtures {

	@BeforeSuite
	public void beforeChildSuite(){
		System.out.println("child before suite...");
	}

	@AfterSuite
	public void afterChildSuite(){
		System.out.println("child after suite...");
	}

	@BeforeClass
	public void beforeChildClass(){
		System.out.println("child before class");
	}

	@AfterClass
	public void afterChildClass(){
		System.out.println("child after class");
	}

	@BeforeMethod
	public void beforeChildMethod(){
		System.out.println("child beforeMethod...");
	}

	@AfterMethod
	public void afterChildMethod(){
		System.out.println("child afterMethod");
	}

	@Test
	public void testChildMethod1(){
		System.out.println("child testMethod1...");
	}

	@Test
	public void testChildMethod2(){
		System.out.println("child testMethod2...");
	}

}
