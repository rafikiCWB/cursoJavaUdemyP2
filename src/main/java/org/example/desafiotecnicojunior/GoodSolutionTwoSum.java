package org.example.desafiotecnicojunior;

import java.util.*;

public class GoodSolutionTwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return nums;
    }

    public int[] minhaSoma(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(nums[i] + " " + nums[j]);
                    System.out.println(nums[i] + nums[j]);
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {11, 7, 2, 15};
        int target = 9;

        GoodSolutionTwoSum twoSum = new GoodSolutionTwoSum();
        int[] result = twoSum.twoSum(nums, target);
        if (result != null) {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found");
        }

        System.out.println("====================\n");

        twoSum.minhaSoma(nums, target);

    }


}
