package com.springRest.demo.SpringRest.Assignment;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.springRest.demo.SpringRest.Assignment.service.BadRequest;

@ControllerAdvice
public class RestExceptionAdvise extends ResponseEntityExceptionHandler {


	@ExceptionHandler(BadRequest.class)
	public ResponseEntity<Object> handellerNotFoundException(Exception exception,WebRequest request ){
		
		return new ResponseEntity<Object>("Bad Request!!",new HttpHeaders(),HttpStatus.BAD_REQUEST);
	}

}
