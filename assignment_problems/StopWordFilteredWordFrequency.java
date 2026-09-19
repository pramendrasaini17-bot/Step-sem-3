import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StopWordFilteredWordFrequency {

    public static void printFilteredWordFrequency(String feedback) {
        List<String> stopWords = Arrays.asList("the", "was", "and", "a", "is", "of", "in");

        String normalized = feedback.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "");
        String[] words = normalized.split("\\s+");

        HashMap<String, Integer> freqMap = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty()) continue;
            boolean isStopWord = false;
            for (String sw : stopWords) {
                if (word.equals(sw)) {
                    isStopWord = true;
                    break;
                }
            }
            if (!isStopWord) {
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter feedback paragraph: ");
        String feedback = sc.nextLine();

        printFilteredWordFrequency(feedback);

        sc.close();
    }
}