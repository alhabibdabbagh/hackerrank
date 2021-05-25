package com.project.hackerrank.fifteenth;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author habib
 * @on 23.05.2021 00:02
 */


public class DuplicateWords {

    public static void main(String[] args) {
        String regex = "\\b(\\w+)((?:\\W+)\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE+Pattern.MULTILINE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }
/*        String pattern = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
        Pattern r = Pattern.compile(pattern,Pattern.MULTILINE+Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String input = in.nextLine();
            Matcher m = r.matcher(input);
            boolean findMatch = true;
            while(m.find( )){
                input =input.replaceAll(m.group(),m.group(1));
                findMatch = false;
            }
            System.out.println(input);
            testCases--;
        }

        in.close();*/
    }
}

/*
source
        https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#sum
        Special constructs (named-capturing and non-capturing)
        (?<name>X)	X, as a named-capturing group
        (?:X)	X, as a non-capturing group
        (?idmsuxU-idmsuxU) 	Nothing, but turns match flags i d m s u x U on - off
        (?idmsux-idmsux:X)  	X, as a non-capturing group with the given flags i d m s u x on - off
        (?=X)	X, via zero-width positive lookahead
        (?!X)	X, via zero-width negative lookahead
        (?<=X)	X, via zero-width positive lookbehind
        (?<!X)	X, via zero-width negative lookbehind
        (?>X)	X, as an independent, non-capturing group

Boundary matchers
^	The beginning of a line
$	The end of a line
\b	A word boundary
\B	A non-word boundary
\A	The beginning of the input
\G	The end of the previous match
\Z	The end of the input but for the final terminator, if any
\z	The end of the input
        */
