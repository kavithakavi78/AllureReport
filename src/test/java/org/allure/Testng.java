package org.allure;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testng {

	@BeforeClass
	public void setup() {
		System.out.println("setup");
		
	}

	@Test
	public void atest() {
		System.out.println("Atest");
	}

	@Test
	public void btest() {
		System.out.println("BTest");
	}

	@AfterClass

	public void ctest() {
		System.out.println("Ctest");
	}
}
