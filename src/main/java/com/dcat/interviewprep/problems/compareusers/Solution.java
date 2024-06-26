package com.dcat.interviewprep.problems.compareusers;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Example usage
        List<User> list1 = Arrays.asList(new User("Alice", 1), new User("Bob", 2));
        List<User> list2 = Arrays.asList(new User("Bob", 2), new User("Charlie", 3));

        List<List<User>> result = compareUsers(list1, list2);

        System.out.println("In first list but not in second:");
        for (User user : result.get(0)) {
            System.out.println(user.name);
        }

        System.out.println("In second list but not in first:");
        for (User user : result.get(1)) {
            System.out.println(user.name);
        }
    }

    public static List<List<User>> compareUsers(List<User> list1, List<User> list2) {
        List<User> inFirstNotSecond = new ArrayList<>();
        List<User> inSecondNotFirst = new ArrayList<>();

        Set<User> set1 = new HashSet<>(list1);
        Set<User> set2 = new HashSet<>(list2);

        for (User user : list1) {
            if (!set2.contains(user)) {
                inFirstNotSecond.add(user);
            }
        }

        for (User user : list2) {
            if (!set1.contains(user)) {
                inSecondNotFirst.add(user);
            }
        }

        return Arrays.asList(inFirstNotSecond, inSecondNotFirst);
    }
}
