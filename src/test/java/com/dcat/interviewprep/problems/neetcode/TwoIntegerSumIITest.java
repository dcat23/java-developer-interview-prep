package com.dcat.interviewprep.problems.neetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.dcat.interviewprep.problems.neetcode.TwoIntegerSumII.twoSum;
import static org.assertj.core.api.Assertions.assertThat;

class TwoIntegerSumIITest {


    @Test
    @DisplayName("numbers = [1,2,3,4], target = 3")
    void givenExample1_when_then() {
        /* Given - example1 */
        int[] numbers = {1, 2, 3, 4};
        int target = 3;

        /* When -  */
        int[] ints = twoSum(numbers, target);

        /* Then -  */
        assertThat(ints).isEqualTo(new int[]{1,2});
    }


    @Test
    @DisplayName("numbers=[-5,-3,0,2,4,6,8], target=5")
    void givenCase5_when_then() {
        /* Given - case5 */
        int[] numbers = {-5, -3, 0, 2, 4, 6, 8};
        int target = 5;

        /* When -  */
        int[] ints = twoSum(numbers, target);

        /* Then -  */
        assertThat(ints).isEqualTo(new int[]{2,7});
    }


}