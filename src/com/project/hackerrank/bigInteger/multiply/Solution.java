package com.project.hackerrank.bigInteger.multiply;

/**
 * @author Habib
 * @on 9/23/21 - 8:14 AM
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader firstNum = new BufferedReader(new InputStreamReader(System.in));
        //multi and add
        try {
            String S =firstNum.readLine();
            String S1 =firstNum.readLine();
            BigInteger num1=new BigInteger(S);
            BigInteger num2=new BigInteger(S1);
            System.out.println(num1.add(num2));
            System.out.println(num1.multiply(num2));
         //   System.out.println(br.readLine());

        }catch (Exception e){
            System.out.println("hata");
            }


    }
}