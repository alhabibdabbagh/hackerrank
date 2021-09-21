package com.project.hackerrank.bigInteger;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        // write your code here

        BigInteger bigInteger=new BigInteger("5");
        BigInteger bigInteger2 = new BigInteger("95");
        BigInteger bigInteger1= bigInteger.add(new BigInteger("8"));
        System.out.println(bigInteger1);
        System.out.println(bigInteger2.isProbablePrime(1));
    }
}
