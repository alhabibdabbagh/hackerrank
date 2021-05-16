package com.project.hackerrank.thirteenth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author habib
 * @on 15.05.2021 12:07
 */
public class PatternMatcher {

    public static void main(String[] args) {
        String statment=" a  erekasdasdasd Banas  {sadasdasd} {} CA 1 a  A A {sa} {(sa} v  2345 PA (412)555-1212  johnsmith@h   otmail .com 412-555-1234 412 555-1234  ";

        Pattern pattern=Pattern.compile("\\{\\(?[a-z]{5,10}\\}");//{sadasdasd} // {en az 5 , en çok 10 }  \\{ yazdırmak için

        Matcher matcher=pattern.matcher(statment);

        while (matcher.find()){
            if (matcher.group().length()!=0){
                System.out.println(matcher.group().trim());
            }

            System.out.println("start "+matcher.start());
        System.out.println("end "+matcher.end());
        }
     /*   System.out.println("start "+matcher.start());
        System.out.println("end "+matcher.end());*/
        System.out.println(pattern);
        System.out.println(matcher);

/*
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
*/

    }
}
