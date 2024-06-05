package org.example.exercism.org;

import java.util.HashMap;
import java.util.Map;

public class FindTwoNumberEqualsSomaEqualsLastNumber {
    public static void main(String[] args) {
        var find = new FindTwoNumberEqualsSomaEqualsLastNumber();
        find.two_sum();
    }
    // Gerado por IA
    public void two_sum() {
        int[] arr = {2, 7, 11, 15};
        int target = 18;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                int index1 = map.get(complement);
                int index2 = i;
                System.out.println("Index 1: " + index1 + ", Index 2: " + index2);
                break;
            }
            map.put(arr[i], i);
        }
    }
}
