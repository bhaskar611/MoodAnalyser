package com.moodanalyser;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.moodanalyser.MoodAnalyserException.ExceptionType;
public class MoodAnalyserTest {

	
	// Test case to analyse Sad mood
		@Test 
		public void Test1() {
			MoodAnalyser moodAnalyser= new MoodAnalyser();
			String mood = null;
			try {
				mood = moodAnalyser.AnalyseMood("Im in a Sad Mood");
				Assert.assertEquals("SAD", mood);
			} catch (MoodAnalyserException e) {
				e.printStackTrace();
			}

		}
	//Test case to analyse Happy mood
		@Test 
		public void Test2() {
			MoodAnalyser moodAnalyser= new MoodAnalyser();
			String mood = null;
			try {
				mood = moodAnalyser.AnalyseMood("Im in a any Mood");
				Assert.assertEquals("HAPPY", mood);
			} catch (MoodAnalyserException e) {
				e.printStackTrace();
			}

		}
	// Test case for Null input Exception
		@Test 
		public void Test3() {
			MoodAnalyser moodAnalyser= new MoodAnalyser();
			String mood = null;
			try {
				mood = moodAnalyser.AnalyseMood(null);	
			} catch (MoodAnalyserException e) {
				Assert.assertEquals(ExceptionType.ENTERED_NULL, e.type );
				Assert.assertEquals("Entered Invalid Mood", e.getMessage());
			}

		}
	// Test Case for Empty input Exception	
		@Test 
		public void Test4() {
			MoodAnalyser moodAnalyser= new MoodAnalyser();
			String mood = null;
			try {
				mood = moodAnalyser.AnalyseMood("");	
			} catch (MoodAnalyserException e) {
				Assert.assertEquals(ExceptionType.ENTERED_EMPTY, e.type );
				Assert.assertEquals("Please Enter Mood Properly", e.getMessage());
			}

		}

}
