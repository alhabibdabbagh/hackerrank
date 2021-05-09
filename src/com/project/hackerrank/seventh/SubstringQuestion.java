package com.project.hackerrank.seventh;

import java.util.Scanner;

/**
 * @author habib
 * @on 9.05.2021 00:38
 */
public class SubstringQuestion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start,end));
    }
    }

