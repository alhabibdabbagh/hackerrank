package com.project.hackerrank.eighth;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author habib
 * @on 9.05.2021 10:47
 */
public class SubstringAndSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String largest1 = "";
        String[] array=s.split("");
     //   List<String> ss=new ArrayList<>();


int z=k;
int count=0;
        for (int i=0;i<s.length();){
            if(s.length()-3>k) {
           //    ss.add(s.substring(i, k));
                array[count]=s.substring(i, k);
             /*   i = k;
                //k += k;
                k+=z;*/
                count++;
            }else {
               // ss.add(s.substring(i, k));
                array[count]=s.substring(i, s.length());
         /*       i = k;
                k += z;*/
                count++;
            }
        }
     // for (int i=0;i<ss.size();i++){
         // ss.get(i).compareTo()
     // }
        for (int i=0;i<count-1;i++){
           if( array[i].compareTo(array[i+1])>0 ){
               largest=array[i];
           }else {
               smallest=array[i+1];
           }
        }
        /*largest= Collections.max(ss);
        smallest= Collections.min(ss);*/
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }
}
