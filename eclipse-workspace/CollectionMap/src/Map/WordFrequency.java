package Map;

import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String paragraph = "java code java map code hashmap hashmap code";
        String[] words = paragraph.split(" ");

        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        for (String word : frequencyMap.keySet()) {
            System.out.println(word + ": " + frequencyMap.get(word));
        }
    }
}
