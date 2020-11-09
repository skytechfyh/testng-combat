package com.testng.example2;

import org.testng.annotations.Test;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc
 */
public class TestGroup1 {

	@Test(groups = "aa")
	public void test1(){
		System.out.println("test1...");
	}

	@Test(groups = "bb")
	public void test2(){
		System.out.println("test2...");
	}

	@Test(groups = "aa")
	public void test3(){
		System.out.println("test3...");
	}
}
