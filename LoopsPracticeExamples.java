package com.ControlStatements;

public class LoopsPracticeExamples {
	
	public void printCubeOfNumbers(int intCubeCount) {
		
		int intCubeResult;
		System.out.println("***Cubes of first "+intCubeCount+" Numbers***");
		
		for(int intNum=1; intNum<=intCubeCount; intNum++) {
			intCubeResult = intNum*intNum*intNum;
			System.out.println("Cube of  "+intNum+" is : "+intCubeResult);
		}
		
		System.out.println("\n");
	}
	
	public void printTableOfNumber(int intNumber) {
		
		int intTableCount=1;
		int intTableResult;
		
		System.out.println("Table of "+intNumber);
		System.out.println("----------------------");
		
		while(intTableCount<=10) {
			intTableResult = intNumber * intTableCount;
			System.out.println(intNumber+" * "+intTableCount+" = "+intTableResult);
			intTableCount++;
		}
		
	}
	
	public void printPattern(int intRowCount) {
		
		int intRow, intColumn;
		
		for(intRow=1; intRow<=intRowCount; intRow++) {
			for(intColumn=1; intColumn<=intRow; intColumn++) {
				System.out.print("*");				
			}
			System.out.print("\n");
		}
	}

}
