package com.tst;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {
	@BeforeSuite
	public void test1() {
	System.out.println("test1");
	}
	
	@AfterSuite
	private void test2() {
		System.out.println("test2");

	}
	
	@BeforeTest
	private void test3() {
		System.out.println("test3");

	}
	
	@AfterTest
	private void test4() {
		System.out.println("test4");

	}
	
	@BeforeClass
	private void tset5() {
		System.out.println("test5");

	}
	
	@AfterClass
	private void tset6() {
		System.out.println("test6");

	}
	@BeforeMethod
	private void tset7() {
		System.out.println("test7");
		
	}
	@AfterMethod
	private void tset8() {
		System.out.println("Test8");

	}	
	@Test
	private void tset9() {
		System.out.println("Test9");

	}	
	@Test
	private void tset10() {
		System.out.println("Test10");

	}
	
	

}
