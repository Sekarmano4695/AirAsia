package org.cts.test;

import org.junit.Ignore;
import org.junit.Test;

public class Sample {
	
	@Test
	public void test4() {
		System.out.println("4");
	}
	@Ignore
	@Test
	public void test6() {
		System.out.println("6");
	}
	@Ignore
	@Test
	public void test7() {
		System.out.println("7");
	}
	@Test
	public void test5() {
		System.out.println("5");
	}

}
