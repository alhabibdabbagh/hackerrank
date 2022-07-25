package com.project.examples;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Habib
 * @on 7/17/22 - 11:13 AM
 */
public class Interview {
    public static void main(String[] args) { // for sort array and return the dupicate numbers like hashMap


       // serach(21);


    }

    static void hashmap() {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        int[] ints = {1, 2, 3, 4, 5, 6, 1, 2, 3, 42, 2, 2, 2, 21};
        java.util.Arrays.sort(ints);
        int countsss = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = i; j < ints.length && ints[i] == ints[j]; j++) {

                countsss++;

            }
            //for rebase
            integerIntegerHashMap.put(ints[i], countsss);
            i = i + countsss - 1;
            countsss = 0;

        }
        System.out.println(integerIntegerHashMap);
    }

    static void serach(int val) {
        int[] ints = {1, 2, 3, 4, 5, 6, 1, 2, 3, 42, 2, 2, 2, 21};
        Arrays.sort(ints);
        int start;
        int end;
        start = 0;
        end = ints.length - 1;
        while (start < end) {
            int mid = (end + start) / 2;   // 10 11 12 13 14
            if (ints[mid] == val) {
                System.out.println("foun");
                break;
            }
            if (ints[mid] < val) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

    }

}
