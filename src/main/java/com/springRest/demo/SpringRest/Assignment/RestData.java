package com.springRest.demo.SpringRest.Assignment;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springRest.demo.SpringRest.Assignment.service.ArrayClass;
import com.springRest.demo.SpringRest.Assignment.service.BadRequest;
import com.springRest.demo.SpringRest.Assignment.service.RestServiceEnd;


@RestController
@RequestMapping("/api")
public class RestData {
	
	@Autowired
	RestServiceEnd restServiceEnd;

	@GetMapping(value="/Fibonacci")
	@ResponseStatus(value=HttpStatus.OK)
	public int getNthFibonacci(@PathParam(value="n")Long n, HttpServletResponse response) {
		if(n instanceof Long && n > 0){
			     response.setHeader("pragma", "no-cache");
		         response.setHeader("expires", "-1");
		         response.setContentLength(122);
			return restServiceEnd.getNthFebbonic(n);
		} else{
			throw new BadRequest();
		}
	}
	
	@GetMapping(value="/ReverseWords")
	@ResponseStatus(value=HttpStatus.OK)
	public String getReverse(@PathParam(value="sentence")String sentence, HttpServletResponse response) {
		if(sentence instanceof String && sentence != ""){
		     response.setHeader("pragma", "no-cache");
	         response.setHeader("expires", "-1");
	         response.setContentLength(131);
		       return restServiceEnd.getReverse(sentence);
	      }else {
	    	  throw new BadRequest();
	      }
	}
	
	@GetMapping(value="/TriangleType")
	@ResponseStatus(value=HttpStatus.OK)
	public String getTriangle(@PathParam(value="a")int a,
						@PathParam(value="b") int b,
						@PathParam(value="c")int c,
						HttpServletResponse response) {
		//need to be done!!!!
		
		return "Triangle";	
	}
	
	@PostMapping(value="/makeonearray")
	@ResponseStatus(value=HttpStatus.OK)
	public Object makeOneArray(@RequestBody ArrayClass arrays){
         System.out.println();
         
         System.out.println(arrays.getArray1());
		return arrays;
	}
	
}
