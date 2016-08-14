package org.learn.without.isp;

import org.apache.commons.lang3.NotImplementedException;

public class ProgrammerCalculator implements CalculatorDisplay {

	@Override
	public void basicView() {
		System.out.println("ProgrammerCalculator: implemented basic view");
	}

	@Override
	public void programmerView() {
		System.out.println("ProgrammerCalculator: implemented programmer view");
	}

	@Override
	public void scientificView() {
		throw new NotImplementedException("ProgrammerCalculator: scientificView not implemented");
	}
}
