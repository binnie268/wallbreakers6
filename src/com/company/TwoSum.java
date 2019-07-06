package com.company;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        System.out.println(twoSum(numbers,9));
    }

    public static int[] twoSum(int[] nums, int target) {

        int count = nums.length-1;
        int[] numbers = new int[2];
        for(int i = 0; i < nums.length; i++) {
            count = nums.length-1;
            while(count > i) {
                if(nums[i] + nums[count] == target) {
                    numbers[0] = i;
                    numbers[1] = count;
                    return numbers;
                }
                count--;
            }

        }

        return numbers;
    }
}
