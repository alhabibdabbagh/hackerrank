package com.project.hackerrank.sha256;

import java.security.MessageDigest;
import java.util.Scanner;

/**
 * @author Habib
 * @on 9/23/21 - 9:10 AM
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            Scanner input = new Scanner(System.in);
            java.security.MessageDigest m = java.security.MessageDigest.getInstance("SHA-256");
         //   m.reset();
            m.update(input.nextLine().getBytes());
            for (byte i : m.digest()) {
                System.out.print(String.format("%02x", i));
            }
        } catch (Exception e) {

        }

    }
}
