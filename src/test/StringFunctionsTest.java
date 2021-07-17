package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringFunctionsTest {
	
	@Test
	public void test1() {
		
		assertTrue(StringFunctions.isPalindrome("madam"));
	}

}
