package week2;

import java.util.*;

public class GroupsOfSpecialEquivalentStrings {

    public static void main(String[] args) {
        String[] array = {"abcd","cdab","adcb","cbad"};
        System.out.println(numSpecialEquivGroups(array));
    }

    //sort
    public static int numSpecialEquivGroups(String[] A) {

        Set<String> stringSet = new HashSet<>();
        Map<String,Integer> stringIntegerMap = new HashMap<>();

        for(int i = 0; i < A.length; i++) {
            stringIntegerMap.put(A[i], 1);
        }

        for(int i = 0; i < A.length-1; i++) {
            String[] stringArray = A[i].split("");
            for(int j = 0; j < stringArray.length; j++) {

                for(int z = 1; z <stringArray.length-2; z++) {
                    if(j % 2 == z % 2) {
                        String temp = stringArray[j];
                        stringArray[j] = stringArray[z];
                        stringArray[z] = temp;
                    }
                }


                }
            }

            return 1;
        }


    public static int numSpecialEquivGroups2(String[] A) {
        Set<String> set= new HashSet<>();
        for (String s: A){
            int[] odd= new int[26];
            int[] even= new int[26];
            for (int i=0; i<s.length(); i++){
                if (i%2==1) odd[s.charAt(i)-'a']++;
                else even[s.charAt(i)-'a']++;
            }
            String sig= Arrays.toString(odd)+Arrays.toString(even);
            set.add(sig);
        }
        return set.size();
    }

}
