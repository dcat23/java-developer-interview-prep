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
}
