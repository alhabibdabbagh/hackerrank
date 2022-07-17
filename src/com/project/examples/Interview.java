package com.project.examples;

import java.util.HashMap;

/**
 * @author Habib
 * @on 7/17/22 - 11:13 AM
 */
public class Interview {
    public static void main(String[] args) {
        HashMap<Integer,Integer> integerIntegerHashMap=new HashMap<>();
        int[] ints= {1,2,3,4,5,6,1,2,3,42,2,2,2,21};
        java.util.Arrays.sort(ints);
        int countsss=0;
        for (int i = 0; i <ints.length ; i++) {
            for (int j = i; j <ints.length && ints[i] == ints[j]  ; j++) {

                countsss++;

            }
            integerIntegerHashMap.put(ints[i],countsss);
            i=i+countsss-1;
            countsss=0;

        }
        System.out.println(integerIntegerHashMap);
    }

}
