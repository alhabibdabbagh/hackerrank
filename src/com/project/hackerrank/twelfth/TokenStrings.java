package com.project.hackerrank.twelfth;

import java.util.Arrays;

/**
 * @author habib
 * @on 14.05.2021 00:07
 */
public class TokenStrings {
    public static void main(String[] args) {
        String s ="He  is a very very good boy, isn't he?";

     /*   java.util.StringTokenizer tokenizer=new java.util.StringTokenizer(s,"[ !,?._'@]+");
        System.out.println(tokenizer.countTokens());
        while (tokenizer.hasMoreElements()){
            System.out.println(tokenizer.nextToken());
        }*/
 // another sulotion WİNTHOUT  StringTokenizer

       String[] a= s.split("[ !,?._'@]+");
        System.out.println(a.length);
for(String aa:a) System.out.println(aa);


    //    Arrays.asList(s.split("")).stream().filter(s1 -> s1.);
    }
}
