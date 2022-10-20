package com.project.hackerrank.java.subarray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Habib
 * @on 10/20/22 - 11:46 AM
 */
public class Subarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int result=0;
        int control;
     /*   int x =in. nextInt();

        while (in.hasNextInt()){
            arrayList.add(in.nextInt());
        }*/
        arrayList.add(1);
        arrayList.add(-2);
        arrayList.add(4);
        arrayList.add(-5);
        arrayList.add(1);


        Integer y = 0;
        int isNegativeOrPositive = arrayList.stream().collect(java.util.stream.Collectors.summingInt(Integer::intValue));

        System.out.println("done");
        System.out.println(isNegativeOrPositive);

        if (isNegativeOrPositive > 0) {
            // positive
            for (int i = 0; i < arrayList.size() ; i++) {
                for (int j = i+1; j < arrayList.size() ; j++) {
                    control=arrayList.get(i)+arrayList.get(j);
                    if(control>0){
                        result++;
                    }
                }
            }

        } else {
            //negative
            for (int i = 0; i < arrayList.size() ; i++) {
                for (int j = i+1; j < arrayList.size() ; j++) {
                    control=arrayList.get(i)+arrayList.get(j);
                    if(control<0){
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
