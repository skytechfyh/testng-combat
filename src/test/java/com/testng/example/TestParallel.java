package com.testng.example;

import com.util.Calculator;
import org.testng.annotations.Test;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc 测试并发执行
 */
public class TestParallel {

	/**
	 * 并发执行  会产生线程安全问题
	 */
	@Test(invocationCount = 10, threadPoolSize = 3)
	public void testCount() throws InterruptedException {
		int result = Calculator.count(1);
		System.out.println(result);
	}

	/**
	 * 测试使用synchronized解决线程安全问题
	 */
	@Test(invocationCount = 10, threadPoolSize = 3)
	public void testSynCount() throws InterruptedException {
		int result = Calculator.synCount(1);
		System.out.println(result);
	}

	/**
	 * 测试使用AtomicInteger解决线程安全问题
	 */
	@Test(invocationCount = 10, threadPoolSize = 3)
	public void testAtomicCount() throws InterruptedException {
		int result = Calculator.atomicCount(1);
		System.out.println(result);
	}

	/**
	 * 使用使用Lock解决线程安全问题
	 */
	@Test(invocationCount = 10, threadPoolSize = 3)
	public void testLockCount() {
		int result = Calculator.lockCount(1);
		System.out.println(result);
	}

//	@RepeatedTest(10)
//	@Execution(ExecutionMode.CONCURRENT)
//	public void testAnnotation() throws InterruptedException {
//		int result = Calculator.synCount(1);
//		System.out.println(result);
//	}

}
