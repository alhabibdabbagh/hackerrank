package com.project.hackerrank.sixth;

import java.util.Scanner;

/**
 * @author habib
 * @on 8.05.2021 23:32
 */
public class StringQuestion {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder print=new StringBuilder();
        //System.out.println(A.length()+B.length());
        print.append(A.length()+B.length());
        print.append("\n");
        if(A.compareTo(B)>0){ // burada lexicographically olarak bakılıyor yani harf  bazlı A-Z=> 65  a-z=>122 0-9=>48
            //System.out.println("Yes");
            print.append("Yes");
            print.append("\n");
        }else{
            //System.out.println("No");
            print.append("Yes");
            print.append("\n");
        }
      //  char s=A.charAt(0);
        String s1=String.valueOf(A.charAt(0)).toUpperCase()+A.substring(1);
     //   s1+=A.substring(1);
       // char s2=B.charAt(0);
        String s12=String.valueOf(B.charAt(0)).toUpperCase()+B.substring(1);
      //  s12+=B.substring(1);
        print.append(s1);
        print.append(" ");
        print.append(s12);
      //  System.out.println(A.compareTo(B));
        System.out.println(print);
    }
}
