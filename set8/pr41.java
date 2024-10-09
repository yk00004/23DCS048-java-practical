import java.util.*;

public class pr41 {

    public static void main(String[] args) {
        String text = "your text goes here"; // Replace with your text
        // Convert the text to lower case and split by non-word characters
        String[] words = text.toLowerCase().split("\\W+");

        // Create a Map to store word occurrences
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        // Create a TreeSet to store words in alphabetical order
        Set<String> sortedWords = new TreeSet<>(wordCountMap.keySet());

        // Display the words and their occurrences in alphabetical order
        for (String word : sortedWords) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}