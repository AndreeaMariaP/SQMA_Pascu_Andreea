package com.utils;

import java.util.ArrayList;

public class Utils {

	public boolean isPalindromic(int number) {
		int copy = number;
		int palindrome = 0;
		while (number != 0) {
			palindrome = palindrome * 10 + number % 10;
			number /= 10;
		}
		if (copy == palindrome) {
			return true;
		}
		return false;
	}
	
	public boolean sumOfDigitsGTThreshold(int number, int threshold) {
		int sumOfDigits = 0;
		if(number == 0) {
			sumOfDigits = 1;
		} else {
			while(number != 0) {
				sumOfDigits += number%10;
				number /=10;
			}
		}
		if(sumOfDigits > threshold) {
			return true;
		}
		return false;
	}

	public ArrayList<Integer> stringToIntArray(String string, String delimitator) throws NumberFormatException {
		String[] stringArray = string.split(delimitator);
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		for (int i = 0; i < stringArray.length; i++) {
			int value = Integer.parseInt(stringArray[i]);
			intArray.add(value);
		}
		return intArray;
	}
	
	public int countLetterOccurence(String string, char letter) {
		int count = 0;
		int fromIndex = 0;
		while(string.indexOf(letter, fromIndex) != -1) {
			count ++;
			fromIndex = string.indexOf(letter, fromIndex)+1;
		}
		return count;
	}

}
