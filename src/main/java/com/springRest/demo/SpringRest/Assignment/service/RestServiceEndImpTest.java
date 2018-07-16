package com.springRest.demo.SpringRest.Assignment.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RestServiceEndImpTest {

	RestServiceEndImp restServiceEndImp;
	@Before
	public void setUp() throws Exception {
		restServiceEndImp = new RestServiceEndImp();
	}

	@Test
	public void testGetNthFebbonic() throws Exception{
		assertEquals(55,restServiceEndImp.getNthFebbonic(10));
	}

	@Test
	public void testGetReverse() throws Exception{
		String test = "india is";
		assertEquals("aidni si ", restServiceEndImp.getReverse(test));
	}

	@Test
	public void testGetTriangle() throws Exception{
		fail("Not yet implemented");
	}

	@Test
	public void testGetArray()throws Exception{
		fail("Not yet implemented");
	}

}
