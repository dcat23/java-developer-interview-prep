package com.dcat.interviewprep.problems.neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeIntegerSum {

    /**
     * The output should not contain any duplicate triplets.
     *
     * You may return the output and the triplets in any order.
     *
     * @param nums integer array
     * @return triplets [nums[i], nums[j], nums[k]] where nums[i] + nums[j] + nums[k] == 0,
     */
    static public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int k = left + 1;

            while (k < right) {
                int sum = nums[left] + nums[k] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[left], nums[k], nums[right]));
                }

                k++;

            }



            left++;
        }


        return res;
    }
}
