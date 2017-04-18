package example.codeclan.com.wordcount;

public class WordCounter {

    public int getWordCount (String sentence){
        return 0;
    }

    public static int countWords(String sentence){

        int wordCount = 0;

        boolean word = false;
        int endOfLine = sentence.length() - 1;

        for (int i = 0; i < sentence.length(); i++) {

            if (Character.isLetter(sentence.charAt(i)) && i != endOfLine) {
                word = true;
            } else if (!Character.isLetter(sentence.charAt(i)) && word) {
                wordCount++;
                word = false;
            } else if (Character.isLetter(sentence.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }





}
