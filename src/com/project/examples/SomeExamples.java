package com.project.examples;

import java.util.Arrays;

/**
 * @author habib
 * @on 13.05.2021 20:16
 */
public class SomeExamples {

    public static void main(String[] args) {
        //Arrays
String[] myArr={"5","4","5","4","1","8","5","5"};
String[] myArr1={"1","5","5","9","2","1","5","5"};
int[] ssa={4,12,3,4,5,6,7,89,4};
int[] ssa1={4,12,3,4,5,6,7,89,42};
        System.out.println();
      //  Arrays.sort(myArr);// kendisine değiştirir yani Collection gibi
        //System.out.println(myArr[7]);
    /*    for(String s:myArr) System.out.println(s);
        for (int i=0;i<myArr.length;i++){
            System.out.println(myArr[i]);
        }
        System.out.println(myArr[7]);*/

  //boolean s=  Arrays.equals(myArr,0,2,myArr1,5,7);// güzel

        //Arrays.stream(myArr).forEach(System.out::println);

      // int s11 =Arrays.binarySearch(myArr,"5");// indexi döndürüyor , ilk bir tanesi bulduo sonlandırıyor
       Arrays.sort(myArr);
        Arrays.stream(myArr).forEach(System.out::println);//https://www.youtube.com/watch?v=CHCan--pll4
       int s12 =Arrays.binarySearch(myArr,0,4,"5");// indexi döndürüyor , ilk bir tanesi bulduo sonlandırıyor
      //  System.out.println(s11);

        System.out.println(s12);
   //     System.out.println(s);

// binarySearch: first the array must be sorted. second the teknik about thr binary serach is goes to half to array and checked if
// the value is smallest or lagarest  ( is  faster then normal for loops )

        System.out.println(Arrays.toString(ssa)); // the integer array in one String
      Arrays.asList(Arrays.toString(ssa).split("")).forEach(System.out::println); // with parantez

        System.out.println(Arrays.compare(myArr,myArr1)); // 5 -4 = 1    4-5= -1

        System.out.println(Arrays.compareUnsigned(ssa,ssa1)); // for integerS

    }
}
