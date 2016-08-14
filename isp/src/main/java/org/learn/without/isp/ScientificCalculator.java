package org.learn.without.isp;

import org.apache.commons.lang3.NotImplementedException;

public class ScientificCalculator implements CalculatorDisplay {

	@Override
	public void basicView() {
		System.out.println("ScientificCalculator: implemented basic view");
	}

	@Override
	public void scientificView() {
		System.out.println("ScientificCalculator: implemented scientific view");
	}

	@Override
	public void programmerView() {
		throw new NotImplementedException("ScientificCalculator: programmerView not implemented");
	}
}
