package com.glx.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ControllerJunitTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHome() {
		System.out.println("In Home");
	}

	@Test
	public void testLogin() {
		System.out.println("In Login");
	}

	@Test
	public void testRegister() {
		System.out.println("In Register");
	}

	@Test
	public void testGetRandomId() {
		fail("Not yet implemented");
	}

	@Test
	public void testReg() {
		System.out.println("In Reg");
	}

	@Test
	public void testLogin1() {
		System.out.println("In Login 1");
	}

	@Test
	public void testLoginAgain() {
		fail("Not yet implemented");
	}

	@Test
	public void testMed() {
		System.out.println("In Med");
	}

}
