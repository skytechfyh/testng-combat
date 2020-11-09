package com.testng.example;

import com.util.Calculator;
import org.testng.annotations.Test;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc
 */
public class TestBase {

	/**
	 * 测试加法
	 */
	@Test
	public void testAdd(){
		int result = Calculator.add(4, 2);
		System.out.println(result);
	}

	/**
	 * 测试减法
	 */
	@Test
	public void testSubTract(){
		int result = Calculator.subtract(4, 2);
		System.out.println(result);
	}

	/**
	 * 测试乘法
	 */
	@Test
	public void testMultiply(){
		int result = Calculator.multiply(4, 2);
		System.out.println(result);
	}

	/**
	 * 测试除法
	 */
	@Test
	public void testDivide(){
		int result = Calculator.divide(4, 2);
		System.out.println(result);
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
		System.out.println(result);
	}
}
