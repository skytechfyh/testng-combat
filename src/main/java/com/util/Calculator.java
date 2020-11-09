package com.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc 计算器
 */
public class Calculator {

	public static int result;

	public static AtomicInteger atomicInteger = new AtomicInteger();

	public static Lock lock = new ReentrantLock();
	/**
	 * 加法
	 */
	public static int add(int x, int y) {
		int result = x + y;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 累加
	 */
	public static int count(int x) throws InterruptedException {
		int i = result;
		Thread.sleep(1000);
		result = i+x;
		return result;
	}

	/**
	 * 解决线程安全问题：
	 * 	解决方式1：synchronized
	 */
	public synchronized static int synCount(int x) throws InterruptedException {
		int i = result;
		Thread.sleep(1000);
		result = i+x;
		return result;
	}

	/**
	 * 使用AtomicInteger解决线程安全问题
	 */
	public static int atomicCount(int x) throws InterruptedException {
		atomicInteger.set(result);
		Thread.sleep(1000);
		result = atomicInteger.addAndGet(x);
		return result;
	}

	/**
	 * 使用lock解决
	 */
	public static int lockCount(int x){
		lock.lock();
		try {
			int i = result;
			Thread.sleep(1000);
			result = i+x;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
		return result;
	}

	/**
	 * 减法
	 */
	public static int subtract(int x, int y){
		int result = x - y;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 *	乘法
	 */
	public static int multiply(int x, int y){
		result = x * y;
		return result;
	}

	/**
	 * 除法
	 */
	public static int divide(int x, int y){
		result = x / y;
		return result;
	}

	/**
	 * 清理方法
	 */
	public static void clean(){
		result = 0;
		System.out.println("当前结果清零");
	}
}
