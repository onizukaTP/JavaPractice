package com.junitassertion;

import com.javapractice.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessageWhenSadShouldReturnSad() {
        MoodAnalyzer analyzer = new MoodAnalyzer();
        String mood = analyzer.analyzeMood("This is just sad");
        Assert.assertEquals("sad", mood);
    }

    @Test
    public void givenMessageWhenNotSadShouldReturnHappy() {
        MoodAnalyzer analyzer = new MoodAnalyzer();
        String mood = analyzer.analyzeMood("I'm happy");
        Assert.assertEquals("happy", mood);
    }
}
