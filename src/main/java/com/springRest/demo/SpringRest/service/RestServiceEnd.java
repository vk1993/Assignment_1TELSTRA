package com.springRest.demo.SpringRest.service;

import java.util.Map;

import org.springframework.stereotype.Component;

public interface RestServiceEnd {
	public int getNthFebbonic(long n);

	public String getReverse(String word);

	public String getTriangle(int a, int b, int c);

	public Map<String, Integer[]> getArray(Map<String, Integer[]> array);
}
