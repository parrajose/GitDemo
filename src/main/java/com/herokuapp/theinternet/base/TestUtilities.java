package com.herokuapp.theinternet.base;

public class TestUtilities extends BaseTest {
	
	// STATIC SLEEP 
	protected void sleep(long millis) {
		try {
			Thread.sleep(millis);
			System.out.println("Sleep");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
