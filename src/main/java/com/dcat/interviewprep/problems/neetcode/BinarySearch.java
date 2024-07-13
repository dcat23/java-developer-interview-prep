package com.dcat.interviewprep.problems.neetcode;

public class BinarySearch {

    public static int search(int[] nums, int target) {

        int left  = 0;
        int right = nums.length - 1;


        while (left <= right) {
            int index = (right + left) / 2;
            int value = nums[index];

            if (value == target) {
                return index;
            }

            if (value < target) {
                left = index;
            }

            if (value > target) {
                right = index;
            }
        }

        return -1;
    }

    public static int search2(int[] nums, int target) {

        int left  = 0;
        int right = nums.length - 1;

        if (nums.length == 1) {
            if (nums[0] == target) return 0;
        }

        int index;

        while ((right - left) > 1) {
            index = (right + left) / 2;
            int value = nums[index];

            if (value == target) {


                return index;
            }

            if (value < target) {
                left = index;
            }

            if (value > target) {
                right = index;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int case1 = search(new int[]{-1, 0, 2, 4, 6, 8}, 4);
        System.out.println("case1 = " + case1);
        assert case1 == 3;

        int case2 = search(new int[]{-1,0,2,4,6,8}, 3);
        System.out.println("case2 = " + case2);
        assert case2 == -1;

        int case3 = search(new int[]{5}, 5);
        System.out.println("case3 = " + case3);
        assert case3 == 0;


    }
}
