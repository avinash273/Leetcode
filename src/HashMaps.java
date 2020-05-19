import java.util.HashMap;

public class HashMaps {
    java.util.HashMap wordCount(String sentence) {
        java.util.HashMap<String, Integer> wordCounter = new java.util.HashMap<String, Integer>();
        String[] tokens = sentence.split(" ");

        for (String token : tokens) {
            String word = token.toLowerCase();
            if (wordCounter.containsKey(word)) {
                int count = wordCounter.get(word);
                wordCounter.put(word, count + 1);
            } else {
                wordCounter.put(word, 1);
            }

        }
        return wordCounter;
    }
}
