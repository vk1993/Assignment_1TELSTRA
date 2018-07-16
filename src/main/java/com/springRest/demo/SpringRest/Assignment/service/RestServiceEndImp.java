package com.springRest.demo.SpringRest.Assignment.service;

import java.util.Arrays;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

@Service
public class RestServiceEndImp implements RestServiceEnd {

	@Override	
	public int getNthFebbonic(long n) {
		int n1 = 1;
		int n2 = 1;
		int n3 = 0;
		int i;
		if (n <= n1) {
			return n1;
		}
		for (i = 2; i < n; ++i)// loop starts from 2 because 1 and 1 are already printed
		{
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		return n3;
	}

	@Override
	public String getReverse(String inputString) {

		String[] words = inputString.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
		   {
			reverseWord = reverseWord + word.charAt(j);
		   }
		   reversedString = reversedString + reverseWord + " ";
		}
		return reversedString;
	}

	@Override
	public String getTriangle(int a, int b, int c) {

		return null;
	}

	@Override
	public int[] getArray(int[] arr1, int[] arr2, int[] arr3) {

		return IntStream.concat(Arrays.stream(arr1), 
				IntStream.concat(Arrays.stream(arr2), Arrays.stream(arr3)))
				.sorted().distinct().toArray();
	}
}
