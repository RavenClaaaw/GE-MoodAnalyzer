import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import mood.MoodAnalyzer;
import mood.MoodAnalyzerException;

public class Junit {
    // @Test
    // public void test11(){
    //     MoodAnalyzer analyzer = new MoodAnalyzer();
        
    //     String text = "I Am In Sad Mood";
    //     assertEquals(analyzer.getMood(text), "SAD");
    // }

    // @Test
    // public void test12(){
    //     MoodAnalyzer analyzer = new MoodAnalyzer();
        
    //     String text = "I Am In Any Mood";
    //     assertEquals(analyzer.getMood(text), "HAPPY");
    // }

    // @Test
    // public void test21(){
    //     String text = "I Am In Sad Mood";
    //     MoodAnalyzer analyzer = new MoodAnalyzer(text);
        
    //     assertEquals(analyzer.getMood(), "SAD");
    // }

    // @Test
    // public void test22(){
    //     String text = "I Am In Any Mood";
    //     MoodAnalyzer analyzer = new MoodAnalyzer(text);
        
    //     assertEquals(analyzer.getMood(), "HAPPY");
    // }

    // @Test
    // public void testNull(){
    //     String text = null;
    //     MoodAnalyzer analyzer = new MoodAnalyzer(text);
        
    //     assertEquals(analyzer.getMood(), "HAPPY");
    // }

    @Test
    public void testThrow(){
        try {
            String text = null;
            MoodAnalyzer analyzer = new MoodAnalyzer(text);
            String result = analyzer.getMood();
        } catch (MoodAnalyzerException e) {
            System.err.println(e.getMessage());
            assertEquals(e.getMessage(), "ERROR: NULL VALUE");
        }
    }
}
