package com.dcat.interviewprep.problems.neetcode;

public class TwoIntegerSumII {

    /**
     *
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
        int index1 = 0, index2 = 1;

        while (index2 < numbers.length) {
            int one = numbers[index1];
            int two = numbers[index2];

            if (one + two == target) {
                break;
            }

            index2++;
        }

        return new int[]{index1 + 1, index2 + 1};
    }
}
