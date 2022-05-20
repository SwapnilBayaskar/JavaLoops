package com.ControlStatements;

public class JavaLoops {
	
	//For Loop: When no of iterations are known. It allows to initialize variable, add condition and incre/decre.
	//While: When we don't know the exact no of iterations. 
	//do while: It checks the condition at the end of loop. Means it will execute atleast once.
	
	//For Loop
	public void sumOfEvenNumbers(int intCount) {
		
		int intSum = 0;		
		for(int intEvenNum=2; intEvenNum<=intCount*2; intEvenNum = intEvenNum+2) {			
			intSum = intSum + intEvenNum;			
		}
		System.out.println("Sum of First "+intCount+" Even Numbers is : "+intSum);		
	}
	
	//While Loop
	public void sumOfOddNumbers(int intOddCount) {
		
		int intOddSum = 0;
		int intOddNum = 1;
		while(intOddNum<=(intOddCount*2)-1) {
			intOddSum = intOddSum + intOddCount;
			intOddNum=intOddNum+2;			
		}
		System.out.println("Sum of First "+intOddCount+" Odd Numbers is : "+intOddSum);
	}
	
	//do while loop
	public void sumOfNaturalNumbers(int intNaturalCount) {
		
		int intNaturalSum = 0;
		int intNaturalNum = 1;
		do {
			intNaturalSum = intNaturalSum + intNaturalNum;
			intNaturalNum++;
		} while (intNaturalNum <= intNaturalCount);
		System.out.println("Sum of First "+intNaturalCount+" Natural Numbers is : "+intNaturalSum);
	}

}
