package com.dcat.interviewprep.problems;

import org.junit.jupiter.api.Test;

import static com.dcat.interviewprep.problems.LeetCode.removeDuplicates;
import static org.junit.jupiter.api.Assertions.*;

class LeetCodeTest {

    @Test
    void removeDuplicatesTest() {
        int[] case1 = {1,1,2};
        int[] case2 = {0,0,1,1,1,2,2,3,3,4};


        assertEquals(removeDuplicates(case1), 2);
        assertEquals(removeDuplicates(case2), 5);

    }
}