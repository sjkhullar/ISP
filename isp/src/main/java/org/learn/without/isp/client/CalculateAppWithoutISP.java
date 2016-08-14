package org.learn.without.isp.client;

import org.apache.commons.lang3.NotImplementedException;
import org.learn.without.isp.BasicCalculator;
import org.learn.without.isp.CalculatorDisplay;
import org.learn.without.isp.ProgrammerCalculator;
import org.learn.without.isp.ScientificCalculator;

public class CalculateAppWithoutISP {

	public static void main(String[] args) {
		try {
			BasicCalculator();
		} catch (NotImplementedException noe) {
			System.out.println(noe.getMessage());
		}
		try {
			ScientificCalculator();
		} catch (NotImplementedException noe) {
			System.out.println(noe.getMessage());
		}
		try {
			ProgrammerCalculator();
		} catch (NotImplementedException noe) {
			System.out.println(noe.getMessage());
		}
	}

	private static void BasicCalculator() {
		System.out.println("1. Methods of Basic display:");
		CalculatorDisplay basicDisplay = new BasicCalculator();
		basicDisplay.basicView();
		//Calling Scientific view 
		//Similarly we can call programmer view
		basicDisplay.scientificView();
	}

	private static void ScientificCalculator() {
		System.out.println("\n2. Methods of Scientific display:");
		CalculatorDisplay scientificDisplay = new ScientificCalculator();
		scientificDisplay.basicView();
		scientificDisplay.scientificView();
		scientificDisplay.programmerView();
	}

	private static void ProgrammerCalculator() {
		System.out.println("\n3. Methods of Programmer display:");
		CalculatorDisplay programmerDisplay = new ProgrammerCalculator();
		programmerDisplay.basicView();
		programmerDisplay.programmerView();
		programmerDisplay.scientificView();
	}
}
