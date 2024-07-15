package com.dcat.interviewprep.sorting;

import java.util.List;
import java.util.ArrayList;

public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(5);
        numbers.add(6);

        bubbleSort(numbers);

        System.out.println("Sorted List: " + numbers);
    }

    public static void bubbleSort(List<Integer> list) {
        int n = list.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap list[j] and list[j + 1]
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);

                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, then the list is sorted
            if (!swapped) {
                break;
            }
        }
    }
}

