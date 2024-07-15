package com.dcat.interviewprep.problems.neetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.dcat.interviewprep.problems.neetcode.ThreeIntegerSum.threeSum;
import static org.assertj.core.api.Assertions.assertThat;

class ThreeIntegerSumTest {

    @Test
    @DisplayName("nums = [-1,0,1,2,-1,-4]")
    void givenExample1_when_then() {
        /* Given - example 1 */
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};

        /* When -  */
        List<List<Integer>> lists = threeSum(nums);

        /* Then -  */
        assertThat(lists).hasSize(2);
    }

    @Test
    @DisplayName("nums = [0,1,1]")
    void given_when_then() {
        /* Given -  */
        int[] nums = {0, 1, 1};

        /* When -  */
        List<List<Integer>> lists = threeSum(nums);

        /* Then -  */
        assertThat(lists).hasSize(0);
    }


    @Test
    @DisplayName("nums = [0,0,0]")
    void givenExample3_when_then() {
        /* Given - example 3 */
        int[] nums = {0, 0, 0};

        /* When -  */
        List<List<Integer>> lists = threeSum(nums);

        /* Then -  */
        assertThat(lists).hasSize(1);
    }

}