package com.dcat.interviewprep.problems.neetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.dcat.interviewprep.problems.neetcode.IsPalindrome.isPalindrome;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeTest {


    @Test
    @DisplayName("true: \"Was it a car or a cat I saw?\"")
    void givenCase1_when_then() {
        /* Given - palindrome */
        String s = "Was it a car or a cat I saw?";

        /* When -  */
        boolean palindrome = isPalindrome("Was it a car or a cat I saw?");

        /* Then -  */
        assertThat(palindrome).isTrue();
    }


    @Test
    @DisplayName("false: \"tab a cat\"")
    void givenCase2_when_then() {
        /* Given - case2 */
        String s = "tab a cat";

        /* When -  */
        boolean palindrome = isPalindrome(s);

        /* Then -  */
        assertThat(palindrome).isFalse();
    }


}