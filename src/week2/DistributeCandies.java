package week2;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public static void main(String[] args) {
        int[] candies = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candies));
    }

    public static int distributeCandies(int[] candies) {

        Set<Integer> candiesMap = new HashSet<>();

        for(int i = 0; i < candies.length; i++) {
            if(!candiesMap.contains(candies[i])) {
                candiesMap.add(candies[i]);
            }
        }

        if(candiesMap.size() > candies.length/2) {
            return candies.length/2;
        } else {
            return candiesMap.size();
        }
    }
}
