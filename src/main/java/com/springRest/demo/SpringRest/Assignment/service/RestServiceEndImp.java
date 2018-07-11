package com.springRest.demo.SpringRest.Assignment.service;
import org.springframework.stereotype.Service;

@Service
public class RestServiceEndImp implements RestServiceEnd{

	@Override
	public int getNthFebbonic(long n) {
		int n1=1,n2=1,n3=0,i; 
		if(n <= n1) {
			return n1;
		}
		 for(i=2 ;i < n ; ++i)//loop starts from 2 because 1 and 1 are already printed  
		 {  
		  n3=n1+n2;  
		  n1=n2;  
		  n2=n3;  
		 } 
		return n3 ;
	}
	@Override
	public String getReverse(String inputString) {
		
          String[] words = inputString.split(" ");
		  String reverseString = "";
		for (int i = 0; i < words.length; i++) 
		{
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length()-1; j >= 0; j--) 
			{
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		return reverseString;
	}
	@Override
	public String getTriangle(int a, int b, int c) {

		return null;
	}
}
