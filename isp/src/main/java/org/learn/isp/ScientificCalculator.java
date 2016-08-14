package org.learn.isp;

public class ScientificCalculator implements ScientificDisplay,BasicDisplay {

	@Override
	public void basicView() {
		System.out.println("ScientificCalculator: implemented basic view");
	}
	@Override
	public void scientificView() {
		System.out.println("ScientificCalculator: implemented scientific view");
	}
}
