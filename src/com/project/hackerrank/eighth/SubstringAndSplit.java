package com.project.hackerrank.eighth;


import java.util.*;

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
        String smallest = "~";
        String largest = "";
        String[] array = s.split("");//welcometojavaz => wel,elc,lco,com,ome,..... finf the smallest and largest

        int z = k;
        int count = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.length() - 1 > z) {
                z = i + k;
                array[count] = s.substring(i, z);
                count++;

            } else {

                array[count] = s.substring(i, s.length());
                count++;
                break;
            }
        }
        for (int i = 0; i < count; i++) {
            if (i + 1 < count) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    if (array[i].compareTo(largest) > 0)
                        largest = array[i];
                } else {
                    if (smallest.compareTo(array[i]) > 0)
                        smallest = array[i];
                }
            } else {
                if (smallest.compareTo(array[i]) > 0)
                    smallest = array[i];
                if (array[i].compareTo(largest) > 0)
                    largest = array[i];
            }
        }

        // another Solution
   /*     String smallest = s.substring(0,k);
        String largest  = "";
        for(int i=0;i<s.length()-k+1;i++){
            if(s.substring(i,i+k).compareTo(smallest) <0) smallest = s.substring(i,i+k);
            if(s.substring(i,i+k).compareTo(largest) >0) largest = s.substring(i,i+k);
        }*/


        // another Solution
/*        SortedSet<String> sets=new TreeSet<String>();
        for(int i=0;i<=s.length()-k;i++){
            sets.add(s.substring(i,i+k));
        }
        System.out.println(sets.first());
        System.out.println(sets.last());
        return sets.last() + "\n" + sets.first();*/

        return smallest + "\n" + largest;
    }
}
