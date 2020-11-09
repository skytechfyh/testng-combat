package com.testng.example;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc
 */
public class TestParam {

	@Test
	@Parameters({"add1", "add2", "result"})
	public void test(int a, int b, int result){
		Assert.assertEquals(a+b, result);
	}
}
