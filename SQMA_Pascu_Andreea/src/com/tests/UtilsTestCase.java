package com.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Tag;

import com.utils.Utils;

public class UtilsTestCase {
	private Utils utils;
	
	@Before
	public void setUp(){
		utils = new Utils();
	}

	@Test
	@Tag("NumberProcessing")
	public void testIsPalindromicTrue() {
		boolean result = utils.isPalindromic(12321);
		assertTrue(result);
		result = utils.isPalindromic(0);
		assertTrue(result);
		result = utils.isPalindromic(-121);
		assertTrue(result);
	}
	
	@Test
	@Tag("NumberProcessing")
	public void testIsPalindromicFalse() {
		boolean result = utils.isPalindromic(123);
		assertFalse(result);
	}
	
	@Test
	@Tag("NumberProcessing")
	public void testSumOfDigitsGTThresholdTrue() {
		boolean result = utils.sumOfDigitsGTThreshold(0, 0);
		assertTrue(result);
		result = utils.sumOfDigitsGTThreshold(123, 5);
		assertTrue(result);
	}
	
	@Test
	@Tag("NumberProcessing")
	public void testSumOfDigitsGTThresholdFalse() {
		boolean result = utils.sumOfDigitsGTThreshold(123, 10);
		assertFalse(result);
		result = utils.sumOfDigitsGTThreshold(123, 6);
		assertFalse(result);
	}
	
	@Test
	@Tag("StringProcessing")
	public void testStringToIntArray() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		ArrayList<Integer> actual = utils.stringToIntArray("1-2-3", "-");
		assertArrayEquals(expected.toArray(), actual.toArray());
	}
	
	@Test(expected = NumberFormatException.class)
	@Tag("StringProcessing")
	public void testStringToIntArrayException1() {
		ArrayList<Integer> array = utils.stringToIntArray("abc-1-2", "-");
	}
	
	@Test(expected = NumberFormatException.class)
	@Tag("StringProcessing")
	public void testStringToIntArrayException2() {
		ArrayList<Integer> array = utils.stringToIntArray("0-1-2", ":");
	}
	
	@Test
	@Tag("StringProcessing")
	public void testCountLetterOccurence1() {
		int actual = utils.countLetterOccurence("character", 'c');
		assertEquals(2, actual);
	}
	
	@Test
	@Tag("StringProcessing")
	public void testCountLetterOccurence2() {
		int actual = utils.countLetterOccurence("Character", 'c');
		assertEquals(1, actual);
	}
	
	@Test
	@Tag("StringProcessing")
	public void testCountLetterOccurence3() {
		int actual = utils.countLetterOccurence("character", 'x');
		assertEquals(0, actual);
	}

}
