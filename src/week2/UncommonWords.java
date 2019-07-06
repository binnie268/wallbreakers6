package week2;

import java.util.*;

public class UncommonWords {

    public static void main(String[] args) {
        System.out.println(uncommonFromSentences("fd kss fd", "fd fd kss"));
    }

    public static String[] uncommonFromSentences(String A, String B) {
        String[] arrayA = A.split(" ");
        String[] arrayB = B.split(" ");

        Map<String, Integer> countMap = new HashMap<>();
        getWordCount(arrayA, countMap);
        getWordCount(arrayB, countMap);
        String words = "";
        for(Map.Entry<String,Integer> entry: countMap.entrySet()) {
            if(entry.getValue() == 1) {
                words += entry.getKey() + " ";
            }
        }

        if(words.isEmpty())
            return new String[0];
        return words.split(" ");
    }

    private static void getWordCount(String[] arrayA, Map<String, Integer> countMap) {
        for(int i = 0; i < arrayA.length; i++) {
            if(countMap.get(arrayA[i]) == null) {
                countMap.put(arrayA[i],1);
            } else {
                int count2 = countMap.get(arrayA[i]);
                countMap.put(arrayA[i], ++count2);
            }
        }
    }
}
