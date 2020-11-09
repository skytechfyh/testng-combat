package com.testng.example;

import com.util.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc
 */
public class TestMixParallel {

	@Test(invocationCount = 10, threadPoolSize = 2)
	public void testAdd(){
		int result = Calculator.add(4, 2);
		Assert.assertEquals(6, result);
	}

	@Test(invocationCount = 10, threadPoolSize = 2)
	public void testSubTract(){
		int result = Calculator.subtract(6, 4);
		Assert.assertEquals(2, result);
	}
}
