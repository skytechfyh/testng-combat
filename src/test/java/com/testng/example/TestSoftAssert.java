package com.testng.example;

import com.util.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc
 */
public class TestSoftAssert {

	/**
	 * 测试加法
	 */
	@Test
	public void testAdd(){
		int result = Calculator.add(4, 2);
//		Assert.assertEquals(6, result);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(6, result);

		int result2 = Calculator.add(5, 3);
//		Assert.assertEquals(8, result2);
		softAssert.assertEquals(7, result2);

		int result3 = Calculator.add(4, 5);
//		Assert.assertEquals(8, result3);
		softAssert.assertEquals(8, result3);
		softAssert.assertAll();
	}
}
