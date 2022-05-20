package com.ControlStatements;

public class JavaJumpStatements {
	
	//Use of break Statement
	public void calculateTeamRankFromTable(String strTeamName) {
		
		String strTeamArray[] = {"CSK", "MI", "RCB", "SRH", "GT", "LSG", "DC", "KKR", "PK", "RR"};
		
		for(int intCount=0; intCount<strTeamArray.length; intCount++) {
			System.out.println("Rank "+intCount+" Team : "+strTeamArray[intCount]);
			
			if(strTeamArray[intCount].equals(strTeamName)) {
				System.out.println("Rank of "+strTeamArray[intCount]+" is : "+intCount);
				break;				
			}
		}
	}
	
	
	//Use of continue statement
	public void battingOrder(String strPlayerName) {
		
		String strPlayerArray[] = {"Convoy", "Ruturaj", "Moeen", "Uthappa", "Dhoni", "Rayudu", "Jadeja"};
		System.out.println("-------Batting order of CSK-------");
		
		for(int intPlayerCount=0; intPlayerCount<strPlayerArray.length; intPlayerCount++) {
									
			if(strPlayerArray[intPlayerCount].equals(strPlayerName)) { //If this condn is true, it will skip this and continue to the next
				System.out.println(strPlayerName+" is excluded from batting Order");
				continue;												
			}
			System.out.println("Player Number "+intPlayerCount+" is : "+strPlayerArray[intPlayerCount]);
		}
	}

}
