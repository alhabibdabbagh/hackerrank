package com.project.hackerrank.eleventh;

import java.util.HashMap;
import java.util.Scanner;

import static java.util.Arrays.sort;

/**
 * @author habib
 * @on 13.05.2021 14:37
 */
public class Anagrams { // harfleri yerni değiştirmek

    static boolean isAnagram2(String a, String b) {
   // char aa[] = a.toLowerCase().toCharArray();
   String[] aa=a.toLowerCase().split("");
   String[] bb=b.toUpperCase().split("");
  //  char bb[] = b.toLowerCase().toCharArray();
        if(a.length() != b.length()){
        return false;
    }else{
        sort(aa);
        sort(bb);
        return java.util.Arrays.equals(aa, bb);
    }
    }
    static boolean isAnagram1(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        int sum = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i=0; i<a.length(); i++) {
                if (a.charAt(i) == c) {
                    sum++;
                }
                if (b.charAt(i) == c) {
                    sum--;
                }
            }
            if (sum != 0) {
                return false;
            }
        }
        return true;
    }
    static boolean isAnagram(String a, String b) {

        // Complete the function
        if (a.length() != b.length()) return false;

        String[] firstArr = a.split("");
        String[] secondArr = b.split("");
        HashMap<String, Integer> myMap = new HashMap<>();
        HashMap<String, Integer> myMapSeconde = new HashMap<>();
        int count = 1;
        boolean validStatment;
        boolean validStatment1;
        for (int i = 0; i < firstArr.length; i++) {
            String finalAdd = firstArr[i];
            validStatment = myMap.keySet().stream().anyMatch(s -> s.equalsIgnoreCase(finalAdd));
            // validStatment=myMap.keySet().stream().anyMatch(s -> s.equalsIgnoreCase(firstArr[i])); // kabul etmedi  i hatası verdi final olmalı ya da her sefersinde tamlanması lazım
            if (validStatment) continue;
            myMap.put(firstArr[i].toUpperCase(), count);
            count++;
            for (int j = i + 1; j < firstArr.length; j++) {
                if (firstArr[i].equals(firstArr[j])) {
                    myMap.put(firstArr[i], count);
                    count++;
                }
            }
            count = 1;
        }
      //  System.out.println(myMap);
        for (int i = 0; i < secondArr.length; i++) {
            String finalAdd = secondArr[i];
            validStatment1 = myMap.keySet().stream().anyMatch(s -> s.equalsIgnoreCase(finalAdd));
            validStatment = myMapSeconde.keySet().stream().anyMatch(s -> s.equalsIgnoreCase(finalAdd));

            // validStatment=myMap.keySet().stream().anyMatch(s -> s.equalsIgnoreCase(firstArr[i])); // kabul etmedi  i hatası verdi final olmalı ya da her sefersinde tamlanması lazım
            if (validStatment) continue;
            if (!validStatment1) return false;

            myMapSeconde.put(secondArr[i].toUpperCase(), count);
            count++;
            for (int j = i + 1; j < secondArr.length; j++) {
                if (secondArr[i].equals(secondArr[j])) {

                    myMapSeconde.put(secondArr[i].toUpperCase(), count);
                    count++;
                }
                if(j==secondArr.length-1) {
                    int  firstHashCount =myMap.get(secondArr[i].toUpperCase());
                    if(firstHashCount != count-1) return false;
                }
            }
           // myMap.keySet().stream().anyMatch(s -> s.equalsIgnoreCase(finalAdd));
            count = 1;

        }


        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true) {
            String a = scan.next();
            String b = scan.next();

          //  scan.close();// is importten
            boolean ret = isAnagram(a, b);
            boolean ret1 = isAnagram1(a, b);
            boolean ret2 = isAnagram1(a, b);

            HashMap<String, Integer> myMap = new HashMap<>();
          //  System.out.println((ret) ? "Anagrams" : "Not Anagrams");
           // System.out.println((ret1) ? "Anagrams" : "Not Anagrams");
            System.out.println((ret2) ? "Anagrams" : "Not Anagrams");
        }
       /* myMap.put("aa", 1);
        myMap.put("aa", 2);
        myMap.put("aa", 3);
        myMap.put("aa", 4);
        myMap.put("bb", 4);
        myMap.put("bb", 4);*/
        //  System.out.println(myMap.keySet().stream().anyMatch(s -> s.equals("aasdasa")));

        //  System.out.println(myMap.values().toString());
    }
}