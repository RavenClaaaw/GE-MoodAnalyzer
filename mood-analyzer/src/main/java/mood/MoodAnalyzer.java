package mood;

import mood.MoodAnalyzerException.ExceptionType;

public class MoodAnalyzer {
    public String text;

    public MoodAnalyzer(){}
    public MoodAnalyzer(String text){
        this.text = text;
    }

    public String getMood(String text) throws MoodAnalyzerException{
        if(text == null) throw new MoodAnalyzerException("ERROR: NULL VALUE", ExceptionType.NULL);
        else if(text.isEmpty()) throw new MoodAnalyzerException("ERROR: EMPTY VALUE", ExceptionType.EMPTY);
        else{
            if(text.toLowerCase().contains("sad")) return "SAD";
            else return "HAPPY";
        }
    }

    public String getMood() throws MoodAnalyzerException{
        if(this.text == null) throw new MoodAnalyzerException("ERROR: NULL VALUE", ExceptionType.NULL);
        else if(this.text.isEmpty()) throw new MoodAnalyzerException("ERROR: EMPTY VALUE", ExceptionType.EMPTY);
        else{
            if(this.text.toLowerCase().contains("sad")) return "SAD";
            else return "HAPPY";
        }
    }
}
