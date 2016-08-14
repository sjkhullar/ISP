package org.learn.without.isp;

import org.apache.commons.lang3.NotImplementedException;

public class BasicCalculator implements CalculatorDisplay {

	@Override
	public void basicView() {
		System.out.println("BasicCalculator: Implemented basic view");
	}

	@Override
	public void programmerView() {
		throw new NotImplementedException("BasicCalculator: programmerView not implemented");
		
	}

	@Override
	public void scientificView() {
		throw new NotImplementedException("BasicCalculator: scientificView not implemented");
	}
}
