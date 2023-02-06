package org.example.quickSort;

import java.util.ArrayList;
import java.util.List;

public class QuickSortList {

    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(List.of(5, 2, 9, 1));
        lists.add(List.of(3, 4, 6, 8));
        lists.add(List.of(7, 10, 11, 12));
        quickSort(lists, 0, lists.size() - 1);
        System.out.println(lists);
    }

    public static void quickSort(List<List<Integer>> lists, int low, int high) {
        if (low < high) {
            int pivot = partition(lists, low, high);
            quickSort(lists, low, pivot - 1);
            quickSort(lists, pivot + 1, high);
        }
    }

    private static int partition(List<List<Integer>> lists, int low, int high) {
        List<Integer> pivot = lists.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (lists.get(j).get(0) <= pivot.get(0)) {
                i++;
                List<Integer> temp = lists.get(i);
                lists.set(i, lists.get(j));
                lists.set(j, temp);
            }
        }
        List<Integer> temp = lists.get(i + 1);
        lists.set(i + 1, lists.get(high));
        lists.set(high, temp);
        return i + 1;
    }
}
