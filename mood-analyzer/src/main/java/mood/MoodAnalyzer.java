package mood;

public class MoodAnalyzer {
    public String text;

    public MoodAnalyzer(){}
    public MoodAnalyzer(String text){
        this.text = text;
    }

    public String getMood(String text){
        if(text.toLowerCase().contains("sad")) return "SAD";
        else return "HAPPY";
    }

    public String getMood(){
        if(this.text.toLowerCase().contains("sad")) return "SAD";
        else return "HAPPY";
    }
}
