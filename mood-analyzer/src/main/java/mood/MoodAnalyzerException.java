package mood;

public class MoodAnalyzerException extends Exception {
    enum ExceptionType {EMPTY, NULL}
    
    public ExceptionType type;

    public MoodAnalyzerException(String message, ExceptionType type){
        super(message);
        this.type = type;
    }
}
