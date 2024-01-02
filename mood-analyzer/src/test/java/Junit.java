import org.junit.jupiter.api.Test;

import mood.MoodAnalyzer;

public class Junit {
    @Test
    public void testMood(){
        MoodAnalyzer analyzer = new MoodAnalyzer();
        
        String text = "";
        analyzer.getMood(text);
    }
}
