import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordConditions {
    public static Set<String> findUniqueWords(String[]words) {
        Set<String> uniqueWords = new HashSet<>();
    for (String word : words) {
        uniqueWords.add(word);
    }
    return uniqueWords;
    }

    public static Map<String, Integer> countWordCases(String [] words){
        Map<String, Integer> wordCases = new HashMap<>();
        for (String word : words) {
            if (wordCases.containsKey(word)){
                int count = wordCases.get(word);
                wordCases.put(word,count+1);
            }
            else {
                wordCases.put(word,1);
            }
        }
        return wordCases;
    }
}
