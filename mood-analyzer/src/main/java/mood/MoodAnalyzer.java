package mood;

public class MoodAnalyzer {
    public String text;

    public MoodAnalyzer(){}
    public MoodAnalyzer(String text){
        this.text = text;
    }

    public String getMood(String text){
        try {
            if(text.toLowerCase().contains("sad")) return "SAD";
            else return "HAPPY";
        } catch (NullPointerException e) {
            System.out.println("ERROR: " + e.getMessage());
            return "HAPPY";
        }
    }

    public String getMood(){
        try {
            if(this.text.toLowerCase().contains("sad")) return "SAD";
            else return "HAPPY";
        } catch (NullPointerException e) {
            System.out.println("ERROR: " + e.getMessage());
            return "HAPPY";
        }
    }
}
