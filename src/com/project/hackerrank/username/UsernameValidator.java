package com.project.hackerrank.username;

import java.util.Scanner;

/**
 * @author habib
 * @on 5.06.2021 13:11
 */
 class UsernameValidator {

    public static final String regularExpression = "[A-Za-z](\\w){7,29}+";// the first charachter counted hence started from 7 to 29
}
 class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
