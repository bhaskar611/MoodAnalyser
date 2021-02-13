package com.moodanalyser;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	
	@Test 
	public void Test1() {
		MoodAnalyser moodAnalyser= new MoodAnalyser();
		String mood = moodAnalyser.AnalyseMood("This is a Sad Message");
		Assert.assertEquals("SAD", mood);
	}

	@Test 
	public void Test2() {
		MoodAnalyser moodAnalyser= new MoodAnalyser();
		String mood = moodAnalyser.AnalyseMood("This is a Happy Message");
		Assert.assertEquals("HAPPY", mood);
	}

}
