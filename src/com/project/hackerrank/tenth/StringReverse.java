package com.project.hackerrank.tenth;

import java.util.Scanner;

/**
 * @author habib
 * @on 12.05.2021 00:23
 */
public class StringReverse {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        String stringValue=sc.next();
        String reverseStringFromHelf="";
        String output="";
        int length=stringValue.length();

        if(length%2==0){
            for(int i=length-1; i>=(length/2);i--){
                reverseStringFromHelf+=String.valueOf(stringValue.charAt(i));
            }
           output= stringValue.substring(0,length/2).equals(reverseStringFromHelf) ? "Yes":"No" ;
        }else {
            for(int i=length-1; i>=(length/2)+1;i--){
                reverseStringFromHelf+=String.valueOf(stringValue.charAt(i));
            }
            output= stringValue.substring(0,length/2).equals(reverseStringFromHelf) ? "Yes":"No" ;
        }
        System.out.println(output);


    //another solution
 /*       System.out.println( A.equals( new StringBuilder(A).reverse().toString())
                ? "Yes" : "No" );*/


        //another solution


 /*       int count = 0;
        for(int i=0; i<A.length()/2;i++)
            if( A.charAt(i) == A.charAt(A.length()-i-1)) count++;
        System.out.println( (count == A.length()/2) ? "Yes" : "No") ;*/
    }
}
