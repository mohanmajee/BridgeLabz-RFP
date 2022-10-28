package day21;

public class MoodAnalyzer {

	 String message;

	    public MoodAnalyzer(String message) {

	        this.message = message;
	    }

	    public String analyzeMood(String message) throws MoodAnalysisExceptionMain {

	        this.message = message;

	        return analyzeMood();

	    }

	    public String analyzeMood() throws MoodAnalysisExceptionMain {

	        try {

	            if (message.length() == 0) {

	                throw new MoodAnalysisExceptionMain(MoodAnalysisExceptionMain.ExceptionType.ENTERED_EMPTY, "please enter proper message");

	            }

	            if (message.contains("sad")) {

	                return "SAD";

	            }

	            return "HAPPY";
	        }

	        catch (NullPointerException e) {

	            throw new MoodAnalysisExceptionMain(MoodAnalysisExceptionMain.ExceptionType.ENTERED_NULL, "please enter proper message");

	        }
	    }

}
