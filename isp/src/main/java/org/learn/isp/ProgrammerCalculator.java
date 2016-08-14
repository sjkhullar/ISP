package org.learn.isp;

public class ProgrammerCalculator implements ProgrammerDisplay, BasicDisplay {

	@Override
	public void basicView() {
		System.out.println("ProgrammerCalculator: implemented basic view");
	}

	@Override
	public void programmerView() {
		System.out.println("ProgrammerCalculator: implemented programmer view");
	}
}
