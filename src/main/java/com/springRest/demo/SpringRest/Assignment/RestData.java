package com.springRest.demo.SpringRest.Assignment;


import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.demo.SpringRest.Assignment.service.RestServiceEnd;


@RestController
@RequestMapping("/api")
public class RestData {
	
	@Autowired
	RestServiceEnd restServiceEnd;

	
	@GetMapping(value="/Fibonacci")
	public ResponseEntity<Integer> getNthFibonacci(@PathParam(value="n")Long n, HttpServletResponse response) {
		if(n instanceof Long && n > 0){
			     response.setHeader("pragma", "no-cache");
		         response.setHeader("expires", "-1");
		         response.setContentLength(122);
			return new ResponseEntity<Integer>(restServiceEnd.getNthFebbonic(n),HttpStatus.OK);
		}else if(n == null) {
			return new ResponseEntity<Integer>(HttpStatus.BAD_REQUEST);
		} else{
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			return new ResponseEntity<Integer>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value="/ReverseWords")
	public ResponseEntity<String> getReverse(@PathParam(value="sentence")String sentence, HttpServletResponse response) {
		if(sentence instanceof String && sentence != null){
		     response.setHeader("pragma", "no-cache");
	         response.setHeader("expires", "-1");
	         response.setContentLength(131);
		       return new ResponseEntity<String>(restServiceEnd.getReverse(sentence),HttpStatus.OK);
	      }else {
	    	  return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
	      }
	}
	
	@GetMapping(value="/TriangleType")
	public String getTriangle(@PathParam(value="a")int a,
						@PathParam(value="b") int b,
						@PathParam(value="c")int c,
						HttpServletResponse response) {
		
		return "Triangle";	
	}
	
}
