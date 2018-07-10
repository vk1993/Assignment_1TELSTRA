package com.springRest.demo.SpringRest.Assignment;


import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.demo.SpringRest.Assignment.service.RestServiceEnd;


@RestController
@RequestMapping("/api")
public class RestData {
	
	@Autowired
	RestServiceEnd restServiceEnd;
	 private static final String SUCCESS_STATUS = "success";
	 private static final String ERROR_STATUS = "error";
	 private static final int CODE_SUCCESS = 100;
	 private static final int AUTH_FAILURE = 102;
	
	@GetMapping(value="/Fibonacci")
	public int getNthFibonacci(@PathParam(value="n")long n) {
		return restServiceEnd.getNthFebbonic(n);
	}
	
//	"pragma": "no-cache",
//	"date": "Mon, 11 Dec 2017 04:25:03 GMT",
//	"content-encoding": "gzip",
//	"vary": "Accept-Encoding",
//	"content-type": "application/json; charset=utf-8",
//	"cache-control": "no-cache",
//	"content-length": "131",
//	"expires": "-1"
	
	@GetMapping(value="/ReverseWords")
	public String getReverse(@PathParam(value="sentence")String sentence) {
		return restServiceEnd.getReverse(sentence);
	}
	
	@GetMapping(value="/TriangleType")
	public void getTriangle(@PathParam(value="a")int a,@PathParam(value="b") int b,@PathParam(value="c")int c) {
		
		
		
	}
}
