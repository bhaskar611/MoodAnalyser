package com.moodanalyser;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	
	@Test 
	public void Test1() {
		MoodAnalyser moodAnalyser= new MoodAnalyser();
		
		String mood = moodAnalyser.AnalyseMood("I am in a Sad Mood");
		Assert.assertEquals("SAD", mood);
	}

	@Test 
	public void Test2() {
		MoodAnalyser moodAnalyser= new MoodAnalyser();
		
		String mood = moodAnalyser.AnalyseMood("I am in a Happy Mood");
		Assert.assertEquals("HAPPY", mood);
	}
	@Test 
	// Handle exception if user provide invalid input
	public void Test3() {
		MoodAnalyser moodAnalyser= new MoodAnalyser();
		String mood = moodAnalyser.AnalyseMood(null);
		Assert.assertEquals("HAPPY", mood);
	}

}
