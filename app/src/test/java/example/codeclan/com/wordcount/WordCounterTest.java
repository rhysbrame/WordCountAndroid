package example.codeclan.com.wordcount;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;


public class WordCounterTest {

    WordCounter wordCounter;

    @Test
    public void emptyCount(){
        WordCounter wordCounter = new WordCounter();
        assertEquals( 0 , wordCounter.getWordCount("balls"));
    }

    @Test
    public void countWords(){
        WordCounter wordCounter = new WordCounter();
        int sentence = wordCounter.countWords("this is one long sentence");
        assertEquals( 5 , sentence);
    }

}
