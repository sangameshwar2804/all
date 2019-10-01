package com.wbl.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.logic.RemoveDuplicateInArray;

public class RemoveDuplicatesTest {
	public RemoveDuplicateInArray r;

	@BeforeClass
	public void beforeClass() {
		r = new RemoveDuplicateInArray();
	}

	@Test
	public void nonDuplicateTest() {
		int[] ar1 = { 1, 2, 3, 4, 5 };
		int actual = r.getArraySize(ar1);
		assertEquals(actual, 5);
	}

	@Test
	public void withDuplicates() {
		int[] ar1 = { 1, 2, 3, 1, 2, 3 };
		int actual = r.getArraySize(ar1);
		assertEquals(actual, 3);
	}

	@Test
	public void lengthBelow2() {
		int[] ar1 = { 1 };
		int actual = r.getArraySize(ar1);
		assertEquals(actual, 0);
	}

	@Test
	public void zeroArray() {
		int[] ar1 = { 0, 0, 0, 0 };
		int actual = r.getArraySize(ar1);
		assertEquals(actual, 1);
	}

	@Test
	public void mixedValuesTest() {
		int[] ar1 = { 1, 2, 3, 1, 2, 4, 2, 4, 1, 4, 1, 3, 5 };
		int actual = r.getArraySize(ar1);
		assertEquals(actual, 5);
	}

	@Test
	public void negativeNumbers() {
		int[] ar1 = { -1, -1, -2, -3 };
		int actual = r.getArraySize(ar1);
		assertEquals(actual, 3);
	}

	@Test
	public void positiveNegativeZeroTest() {
		int[] ar1 = { 1, -1, 1, -1, 0, 0 };
		int actual = r.getArraySize(ar1);
		assertEquals(actual, 3);
	}

	@Test
	public void emptyArray() {
		int[] ar = {};
		int actual = r.getArraySize(ar);
		assertEquals(actual, 0);
	}

	@Test
	public void length1() {
		int[] arr1 = { 1 };
		int actual = r.getArraySize(arr1);
		assertEquals(actual, 0);
	}

	@Test
	public void duplicatesWithLength2() {
		int[] arr = { 1, 1 };
		int actual = r.getArraySize(arr);
		assertEquals(actual, 1);
	}

	@Test
	public void unsoretdArrayWithDuplicates() {
		int[] ar = { 4, 7, 12, 6, -9, 4, -4 };
		int actual = r.getArraySize(ar);
		assertEquals(actual, 6);
	}

	@Test
	public void sortedArrayWithDuplicates() {
		int[] aar = { 1, 1, 2, 3, 4, 5, 5 };
		int actual = r.getArraySize(aar);
		assertEquals(actual, 5);
	}
	@Test
	public void nullArray() {
		int[] arr=null;
		int actual=r.getArraySize(arr);
		assertEquals(actual, 0);
	}
}
