package com.wbl.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.logic.LargestSmallestArray;

public class LargestSmallestTest {
	LargestSmallestArray max;
	@BeforeClass
	public void beforeClass(){
 max=new LargestSmallestArray();
}
	@Test
	public void unSortedTest() {
		int[] arr= {-1,3,10,4};
	int[] actual=	max.findLargestAndSmallestArray(arr);
	int[] expected= {10,-1};
	assertEquals(actual, expected);
	}
}
