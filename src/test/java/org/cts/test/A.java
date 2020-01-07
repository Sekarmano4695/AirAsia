package org.cts.test;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class A {

	@Test
	public void tc11() {
		System.out.println("test11");
		Assert.assertTrue(false);
	}

	@Test
	public void tc22() {
		System.out.println("test22");
	}

	@Ignore
	@Test
	public void tc44() {
		System.out.println("test44");
	}

	@Test
	public void tc33() {
		System.out.println("test33");
	}
}
