package org.cts.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


public class Runnerclass {
public static void main(String[] args) {
	Result rs = JUnitCore.runClasses(A.class,B.class);
	int failureCount = rs.getFailureCount();
	List<Failure> failures = rs.getFailures();
	long runTime = rs.getRunTime();
	int ignoreCount = rs.getIgnoreCount();
	int runCount = rs.getRunCount();
	System.out.println("ignore count: "+ignoreCount);
	
	System.out.println("Run count: "+runCount);

	System.out.println("Run time: "+runTime);

	System.out.println("Failure count: "+failureCount);
	
	for (Failure f : failures) {
		System.out.println(f);
	}
	
}

}
