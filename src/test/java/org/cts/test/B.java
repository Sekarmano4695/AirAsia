package org.cts.test;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class B {
	@Ignore
	@Test
	public void tc1() {
		System.out.println("test1");
	}
	@Test
	public void tc2() {
		System.out.println("test2");
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void tc4() {
		System.out.println("test4");
	}
	@Test
	public void tc3() {
		System.out.println("test3");
	}

}
