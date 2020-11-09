package com.testng.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc
 */
public class TestParam2 {

	// 定义对象数组
	@DataProvider(name = "add")
	public Object[][] Users() {
		return new Object[][] {
				{ 3, 2, 5 },
				{ 2, 2, 4 },
				{ 3, 3, 7 },
		};
	}

	@Test(dataProvider = "add")
	public void testAdd(int add1, int add2, int result){
		Assert.assertEquals(add1+add2, result);
	}
}
