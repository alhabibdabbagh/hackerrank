package com.project.hackrrend.first;

import java.util.Scanner;


/**
 * @author habib
 * @on 29.04.2021 01:19
 */
public class question {

    public  static  int B;
    public  static  int H;
    public  static  boolean flag;
    public  static Scanner ss=new Scanner(System.in);
    static {
        B=ss.nextInt();
        H=ss.nextInt();
        if(B>0 && H>0){
            flag=true;
        }else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args) {

      //  initialiseClassVariable();
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

        Integer ssa = 0;
        String ww=ssa.toString();

    }
    private static void initialiseClassVariable() {
        B=ss.nextInt();
        H=ss.nextInt();
        if(B>0 && H>0){
            flag=true;
        }else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

}
