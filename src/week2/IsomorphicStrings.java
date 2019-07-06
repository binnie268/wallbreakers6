package week2;

import java.util.*;

public class IsomorphicStrings {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("aba","baa"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, List<Integer>> characterMap = new HashMap<>();
        Map<Character, List<Integer>> characterMap2 = new HashMap<>();
//        Set<Character> lettersSet2 = new HashSet<>();

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


        for(int i = 0; i < t.length(); i++) {
            if(characterMap2.get(t.charAt(i)) == null) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                characterMap2.put(t.charAt(i), list);
            } else {
                List<Integer> list = characterMap2.get(t.charAt(i));
                list.add(i);
                characterMap2.put(t.charAt(i), list);
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
