package com.project.hackerrank.fourteenth;

import java.util.Scanner;

/**
 * @author habib
 * @on 15.05.2021 19:21
 */
public class MyRegex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex1().pattern));
        }
    }
}
class MyRegex1{
    public  String pattern1="(([0]?[0-9]{2})?([0])?([1][0-9]{2})?([2][01234][0-9])?(25[012345])?\\.){3}([0]?[0-9]{2})?([0])?([1][0-9]{2})?([2][01234][0-9])?(25[012345])?";
 /*   (  ([0][0-9]{2})? ([1][0-9]{2})? ([2][012345]{2})?   )*/
    //([0-9]{1,3})((\.)[0-9]{1,3})((\.)[0-9]{1,3})((\.)[0-9]{1,3})

   /* 225.33.226.44*/
    // you have to do review to this code

    // another solution
    String zeroTo255 = "((\\d{1,2}|(0|1)\\d{2})|(2[0-4]\\d|25[0-5]))";
    public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
}

