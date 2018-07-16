package com.springRest.demo.springRest.AssignmentTest;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.configuration.MockAnnotationProcessor;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springRest.demo.SpringRest.Assignment.RestData;
import com.springRest.demo.SpringRest.Assignment.service.RestServiceEnd;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestDataTest {
	
	@Mock
	private RestServiceEnd restServiceEnd;
	private RestData restData;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		
	}

	@Test
	public void testGetNthFibonacci() {
		
	}

	@Test
	public void testGetReverse() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTriangle() {
		fail("Not yet implemented");
	}

	@Test
	public void testMakeOneArray() {
		fail("Not yet implemented");
	}

}

	


