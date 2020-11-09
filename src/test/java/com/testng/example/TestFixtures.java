package com.testng.example;

import org.testng.annotations.*;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc
 */
public class TestFixtures {

	@BeforeSuite
	public void beforeSuite(){
		System.out.println("before suite...");
	}

	@AfterSuite
	public void afterSuite(){
		System.out.println("after suite...");
	}

	@BeforeClass
	public void beforeClass(){
		System.out.println("before class");
	}

	@AfterClass
	public void afterClass(){
		System.out.println("after class");
	}

	@BeforeMethod
	public void beforeMethod(){
		System.out.println("beforeMethod...");
	}

	@AfterMethod
	public void afterMethod(){
		System.out.println("afterMethod");
	}

	@Test
	public void testMethod1(){
		System.out.println("testMethod1...");
	}

	@Test
	public void testMethod2(){
		System.out.println("testMethod2...");
	}
}
