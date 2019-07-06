package week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("","dog cat cat fish"));
    }

    public static boolean wordPattern(String s, String t) {
        Map<Character, List<Integer>> characterMap = new HashMap<>();
        Map<String, List<Integer>> characterMap2 = new HashMap<>();

        if(s.isEmpty()) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            if(characterMap.get(s.charAt(i)) == null) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                characterMap.put(s.charAt(i), list);
            } else {
                List<Integer> list = characterMap.get(s.charAt(i));
                list.add(i);
                characterMap.put(s.charAt(i), list);
            }
        }

        String[] tList = t.split(" ");
        for(int i = 0; i < tList.length; i++) {
            if(characterMap2.get(tList[i]) == null) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                characterMap2.put(tList[i], list);
            } else {
                List<Integer> list = characterMap2.get(tList[i]);
                list.add(i);
                characterMap2.put(tList[i], list);
            }
        }


        for(Map.Entry<Character,List<Integer>> result: characterMap.entrySet()) {
            if(characterMap2.containsValue(result.getValue())) {
                continue;
            }
            return false;
        }

        return true;
    }
}
