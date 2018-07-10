package com.springRest.demo.SpringRest.Assignment.service;

import org.springframework.stereotype.Component;

@Component
public interface RestServiceEnd {
	public int getNthFebbonic(long n);
	public String getReverse(String word);
}
