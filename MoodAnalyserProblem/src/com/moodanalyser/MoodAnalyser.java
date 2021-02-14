package com.moodanalyser;

public class MoodAnalyser {
	
	public String AnalyseMood(String message) throws MoodAnalyserException {
		try {
			if(message.length() == 0)
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"Please Enter Mood Properly");
			if(message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch(NullPointerException e) {
			System.out.println(" In Catch Block Null pointer Exception");
			throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Entered Invalid Mood");
		} 
	}
}
