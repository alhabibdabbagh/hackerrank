package com.project.hackerrank.dArray;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author habib
 * @on 26.06.2021 17:04
 */
public class Questions {
    public static void main(String[] args) {

int[] arr={12,9,4,99,12,1,3,10};
HashMap<Integer,Integer> hashMap=new HashMap();

        for (int i = 0; i <arr.length-1 ; i++) {

            for (int j = i+1; j <arr.length; j++) {
                if(arr[i] == arr[j]  ){
                    int value=hashMap.getOrDefault(arr[i],0);
                    hashMap.put(arr[i],++value);
                }
            }

        }



    }
    public static int[] insertionSort(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
        return arr;
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }





















/*
    String[] s ={"-100","50","0","56.6","90","0.12",".12","02.34","000.000"};
    List<String> list=Arrays.asList(s);
    List<BigDecimal> ss =list.stream().map(s1 -> {

        BigDecimal bigDecimal=BigDecimal.valueOf(Float.parseFloat((s1)));


        return bigDecimal ;
    }).sorted().collect(java.util.stream.Collectors.toList());
Collections.reverse(ss);
        for(int i=0;i<ss.size();i++){
        s[i]=String.valueOf(ss.get(i));
    }

        ss.stream().forEach(System.out::println);
    double d =0.3d;
    double d1 =0.1d;
    BigDecimal bigDecimal=BigDecimal.valueOf(d);
    BigDecimal bigDecimal1=BigDecimal.valueOf(d1);
    BigDecimal bigDecimal2=bigDecimal.add(bigDecimal1);

        System.out.println(bigDecimal2);
*/

}
