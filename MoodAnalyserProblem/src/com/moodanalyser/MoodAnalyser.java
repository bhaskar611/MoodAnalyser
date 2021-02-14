package com.moodanalyser;

public class MoodAnalyser {
	
	public String AnalyseMood(String message) {
		try{
			if(message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch(Exception e) {
			System.out.println("In Catch Block");
			return "HAPPY";
		}
	}
}
