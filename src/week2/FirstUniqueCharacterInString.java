package week2;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }

    public static int firstUniqChar(String s) {
        Map<Character,Integer> mapCount = new HashMap<>();
        int count = 0;

        if(s.isEmpty())
            return -1;

        for(int i = 0; i < s.length(); i++) {
            if(mapCount.get(s.charAt(i)) == null) {
                mapCount.put(s.charAt(i),1);
            } else {
                count = mapCount.get(s.charAt(i));
                mapCount.put(s.charAt(i), ++count);
            }
        }

        for(int i = 0; i < s.length(); i++) {
            if(mapCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
