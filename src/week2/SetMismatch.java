package week2;

import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SetMismatch {

    public static void main(String[] args) {
        System.out.println(findErrorNums(new int[]{3,2,3,4,5,6}));
    }

    public static int[] findErrorNums(int[] nums) {

        Map<Integer,Integer> integerMap = new HashMap<>();
        int[] output = new int[2];
        Arrays.sort(nums);
        int dup = -1;
        int missing = -1;
        int count = 1;
        for(int i = 0; i < nums.length; i++) {

            if(integerMap.get(nums[i]) == null) {
                if(count == nums[i]) {
                    integerMap.put(count, 1);
                } else {
                    if(integerMap.get(count) == null) {
                        integerMap.put(count, 0);
                    }
                    integerMap.put(nums[i],1);
                }
                count++;
            } else {
                if(count != nums[i]) {
                    integerMap.put(count, 0);
                }
               int count2 = integerMap.get(nums[i]);
               integerMap.put(nums[i], ++count2);
               count++;
            }

        }

        for(int i = 1; i <= nums.length; i++) {
            if(integerMap.get(i) == 0) {
                missing = i;
            }

            if(integerMap.get(i) == 2) {
                dup = i;
            }
        }

        output[0] = dup;
        output[1] = missing;

        return output;
    }
}
