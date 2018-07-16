package com.springRest.demo.SpringRest.Assignment.service;

import org.springframework.stereotype.Component;

@Component
public interface RestServiceEnd {
	public int getNthFebbonic(long n);
	public String getReverse(String word);
	public String getTriangle(int a,int b,int c);
	public int[] getArray(int[] arr1,int[] arr2,int[] arr3);
}
