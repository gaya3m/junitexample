package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class FirstJunitTest {
	
	
	@BeforeAll
	public static void beforeAllMethod() {
		System.out.println("Before all method");
	}
	
	@BeforeEach
	public void beforeEachMethod() {
		System.out.println("Before each method");
	}
	
	@Test
	public void testcase1() {
		
		boolean flag=false;
		
		Assert.assertTrue(flag);
	}
	
	@AfterEach
	public void afterEachMethod() {
		System.out.println("After each method");
	}
	
	@AfterAll
	public static void afterAllMethod() {
		System.out.println("Before all method");
	}

}
