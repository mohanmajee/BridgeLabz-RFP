package day21;

public class MoodAnalysisExceptionMain extends Exception {

    enum ExceptionType {ENTERED_NULL,ENTERED_EMPTY}

    ExceptionType type;

    public MoodAnalysisExceptionMain(ExceptionType type, String message) {

        super(message);
        
        this.type = type;
    }

}
