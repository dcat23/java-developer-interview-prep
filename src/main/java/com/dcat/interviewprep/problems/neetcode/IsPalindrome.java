package com.dcat.interviewprep.problems.neetcode;

public class IsPalindrome {

    public static boolean isPalindrome(String s) {
        String phrase = s.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        int N = phrase.length();

        for (int start = 0, end = N - 1; start <= end; start++, end--) {
            if(phrase.charAt(start) != phrase.charAt(end)) {
                return false;
            }
        }

        return true;
    }


}
