package day21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

	@Test
    public void givenSadMessageShouldReturnSadMessage() throws MoodAnalysisExceptionMain {
        
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Hello am in sad mood");
        
        String mood = moodAnalyzer.analyzeMood();
        
        Assertions.assertEquals("SAD", mood);
    }
    
    @Test
    public void givenHappyMassageShouldReturnHappyMessage() throws MoodAnalysisExceptionMain {
        
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Hello am in happy mood");
        
        String mood = moodAnalyzer.analyzeMood();
        
        Assertions.assertEquals("HAPPY", mood);
    }
    
    @Test
    public void givenAnyMassageShouldReturnHappyMessage() throws MoodAnalysisExceptionMain {
        
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Hello am not in mood");
        
        String mood = moodAnalyzer.analyzeMood();
        
        Assertions.assertEquals("HAPPY", mood);
    }
    
    @Test
    public void givenNullMassageShouldReturnHappyMessage(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyzeMood(null);
        } catch (MoodAnalysisExceptionMain e) {
            Assertions.assertEquals(MoodAnalysisExceptionMain.ExceptionType.ENTERED_NULL, e.getMessage());
        }
    }
    @Test
    public void givenEmptyMessageShouldReturnThrowCustomException() {
        
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(" ");
        
        try {
            
            moodAnalyzer.analyzeMood(" ");
            
        }
        catch (MoodAnalysisExceptionMain e) {
            
            Assertions.assertEquals(MoodAnalysisExceptionMain.ExceptionType.ENTERED_EMPTY, e.getMessage());
            
            System.out.println(e.type);
            
            System.out.print(e.getMessage());

        }
    }

}
