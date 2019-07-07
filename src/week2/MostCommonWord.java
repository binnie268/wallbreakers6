package week2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {

    public static void main(String[] args) {

        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",new String[]{"hit"}));
}

    public static String mostCommonWord(String paragraph, String[] banned) {

        int maxCount = Integer.MIN_VALUE;

        String newParagraph = paragraph.replaceAll("[!?';.']","");
        String newParagraph2 = newParagraph.replaceAll(" ",",");
        String[] strings = newParagraph2.split(",");
        Map<String, Integer> countMap = new HashMap<>();
        String maxWord = "";

        for(int i = 0; i < strings.length; i++) {
            if(Arrays.asList(banned).contains(strings[i].toLowerCase()) || strings[i].isEmpty()) {
                continue;
            }
            if(countMap.get(strings[i].toLowerCase()) == null) {
                countMap.put(strings[i].toLowerCase(), 1);
                if (maxCount < 1) {
                    maxCount = 1;
                    maxWord = strings[i].toLowerCase();
                }
            } else {
                int count = countMap.get(strings[i].toLowerCase());
                countMap.put(strings[i].toLowerCase(), ++count);
                if (maxCount < count) {
                    maxCount = count;
                    maxWord = strings[i].toLowerCase();
                }
            }
        }
        return maxWord;
    }
}
