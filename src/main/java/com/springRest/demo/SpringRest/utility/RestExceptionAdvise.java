package com.springRest.demo.SpringRest.utility;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
public class RestExceptionAdvise extends ResponseEntityExceptionHandler {

//	@Override
//	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
//			HttpHeaders headers, HttpStatus status, WebRequest request) {
//		return super.handleHttpRequestMethodNotSupported(ex, headers, status, request);
//	}

	@ExceptionHandler(BadRequest.class)
	public ResponseEntity<ApiError> handellerNotFoundException(BadRequest exception, WebRequest request,
			HttpStatus status) {
		ApiError errorDetails = new ApiError(status, new Date(), exception.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ApiError> handleAllExceptions(Exception ex, WebRequest request, HttpStatus status) {
		ApiError errorDetails = new ApiError(status, new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	
	
	

//	@Override
//	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
//			HttpHeaders headers, HttpStatus status, WebRequest request) {
//		String error = "Malformed JSON request";
//		return new ResponseEntity<Object>(new ApiError(HttpStatus.BAD_REQUEST, error, ex));
//	}

}
