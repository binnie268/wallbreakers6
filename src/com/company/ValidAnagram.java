package com.company;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        String[] s1 = s.split("");
        String[] s2 = t.split("");

        Arrays.sort(s1);
        Arrays.sort(s2);

        if(Arrays.equals(s1,s2)) {
            return true;

        }
        return false;
    }
}
