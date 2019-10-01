package com.wbl.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.wbl.logic.StringUtil;

public class TestStringUtil {
	StringUtil s ;
	@BeforeClass
	public void setUp() {
	s =new StringUtil(); 
	}
	@Test
	public void positiveString() {
		
		boolean actual = s.findStringIsNumber("123456");
		assertEquals(actual, true);
	}

	@Test
	public void mixedStringValues() {
		
		boolean actual = s.findStringIsNumber("abc123");
		assertEquals(actual, false);
	}

	@Test
	public void stringValues() {
		
		boolean actual = s.findStringIsNumber("whitebox");
		assertEquals(actual, false);
	}
	@Test
	public void nullStringTest() {
		
		boolean actual=s.findStringIsNumber(null);
		assertEquals(actual, false);
	}
	@Test
	public void jumbledStringValues() {
		boolean actual=s.findStringIsNumber("abc123xyz");
		assertEquals(actual, false);
	}
	@Test
	public void sentenceValues() {
		boolean a=s.findStringIsNumber("hello 1234");
		assertEquals(a, false);
	}

}
