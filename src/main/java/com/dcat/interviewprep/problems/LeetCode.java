package com.dcat.interviewprep.problems;

public class LeetCode {

    /**
     * <h1>
     *    <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/">
     *      26. Remove Duplicates from Sorted Array
     *    </a>
     * </h1>
     *
     *
     *
     * Given an integer array nums sorted in non-decreasing order,
     * remove the duplicates in-place such that each unique element
     * appears only once.

     * Change the array nums such that the first k elements of nums contain the
     * unique elements in the order they were present in nums initially.
     * The remaining elements of nums are not important as well as the size of nums.
     *
     *
     * @param nums integers
     * @return k The number of unique elements of nums
     */
    static public int removeDuplicates(int[] nums) {
        int nonDupeIdx = 0;

        for (int i=1; i<nums.length; i++)
        {
            if (nums[nonDupeIdx] != nums[i])
            {
                nums[++nonDupeIdx] = nums[i];
            }
        }
        return nonDupeIdx + 1;
    }


    /**
     * You are climbing a staircase. It takes `n` steps to reach the top.
     *
     * Each time you can either climb 1 or 2 steps.
     * In how many distinct ways can you climb to the top?
     *
     * @param n
     * @return
     */
    static public int climbStairs(int n) {
        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;
        double psi = (1 - sqrt5) / 2;

        // Using Binet's formula for Fibonacci number
        double fib_n = (Math.pow(phi, n + 1) - Math.pow(psi, n + 1)) / sqrt5;

        return (int) Math.round(fib_n); // Round to the nearest integer
    }
}
