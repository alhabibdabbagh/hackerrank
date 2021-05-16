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
    public  String pattern="([0-9]{1,3})(((\\.)[0-9]{1,3}){1,3}+)";
    //([0-9]{1,3})((\.)[0-9]{1,3})((\.)[0-9]{1,3})((\.)[0-9]{1,3})
}

