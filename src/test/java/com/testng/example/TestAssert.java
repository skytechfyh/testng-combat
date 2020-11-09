package com.testng.example;

import com.util.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc
 */
public class TestAssert {

	/**
	 * 测试加法
	 */
	@Test
	public void testAdd(){
		int result = Calculator.add(4, 2);
		Assert.assertEquals(result, 6);
	}

	/**
	 * 测试减法
	 */
	@Test
	public void testSubTract(){
		int result = Calculator.subtract(4, 2);
		Assert.assertEquals(result, 2);
	}

	/**
	 * 测试乘法
	 */
	@Test
	public void testMultiply(){
		int result = Calculator.multiply(4, 2);
		Assert.assertEquals(result, 8);
	}

	/**
	 * 测试除法
	 */
	@Test
	public void testDivide(){
		int result = Calculator.divide(4, 2);
		Assert.assertEquals(2, result);
	}

	/**
	 * 测试累加
	 */
	@Test
	public void testCount() throws InterruptedException {
		int result = Calculator.count(2);
		result = Calculator.count(2);
		result = Calculator.count(2);
		result = Calculator.count(2);
		Assert.assertEquals(8, result);
	}
}
