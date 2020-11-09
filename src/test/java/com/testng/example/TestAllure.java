package com.testng.example;

import com.util.Calculator;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc
 */
@Epic("测试allure")
public class TestAllure {

	/**
	 * 测试加法
	 */
	@Description("测试加法")
	@Issue("https://www.baidu.com")
	@Link(name = "社区贴", type = "my link", url = "https://ceshiren.com/t/topic/7611")
	@Test
	public void testAdd(){
		int result = Calculator.add(4, 2);
		Allure.addAttachment("pic", "image/jpg", this.getClass().getClassLoader().getResourceAsStream("aa.jpg"), ".jpg");
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
