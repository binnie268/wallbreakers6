package week2;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        isHappy(19);
    }

    public static boolean isHappy(int n){

        Set<Integer> numberSet = new HashSet<>();
        while(n != 1) {
            int sum = 0;
            int[] nArray = String.valueOf(n)
                    .replace("\\D","")
                    .chars()
                    .map(Character::getNumericValue)
                    .toArray();

            for(int i = 0; i < nArray.length; i++) {
                sum += Math.pow(nArray[i],2);
            }

            if(numberSet.contains(sum)) {
                return false;
            }
            numberSet.add(sum);
            n = sum;
        }

        return true;
    }
}
