package com.dcat.interviewprep.problems.neetcode;

public class TwoIntegerSumII {

    /**
     * Leetcode: #167
     * such that they add up to a given target number target and index1 < index2.
     *
     * Note that index1 and index2 cannot be equal,
     * therefore you may not use the same element twice.
     *
     * @param numbers sorted in non-decreasing order
     * @param target sum of
     * @return the indices (1-indexed) of two numbers, [index1, index2]
     */
    static public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;

        while (start < end) {
            int one = numbers[start];
            int two = numbers[end];

            if (one + two == target) {
                break;
            }

            if (one + two > target) end--;
            if (one + two < target) start++;
        }

        return new int[]{start + 1, end + 1};
    }
}
