package org.learn.isp.client;

import org.learn.isp.BasicCalculator;
import org.learn.isp.BasicDisplay;
import org.learn.isp.ProgrammerCalculator;
import org.learn.isp.ProgrammerDisplay;
import org.learn.isp.ScientificCalculator;
import org.learn.isp.ScientificDisplay;

public class CalculateApp {
	public static void main(String[] args) {
		BasicCalculator();		
		ScientificCalculator();
		ProgrammerCalculator();
	}
	
	private static void BasicCalculator() {
		System.out.println("1. Methods of Basic display:");
		BasicDisplay basicDisplay = new BasicCalculator();
		basicDisplay.basicView();		
	}

	private static void ScientificCalculator() {
		System.out.println("\n2. Methods of Scientific display:");
		ScientificDisplay scientificDisplay = new ScientificCalculator();		
		scientificDisplay.scientificView();		
		((BasicDisplay)scientificDisplay).basicView();
	}
	
	private static void ProgrammerCalculator() {
		System.out.println("\n3. Methods of Programmer display:");
		ProgrammerDisplay programmerDisplay = new ProgrammerCalculator();
		programmerDisplay.programmerView();
		((BasicDisplay)programmerDisplay).basicView();
	}
}
