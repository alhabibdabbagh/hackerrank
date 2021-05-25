package com.project.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author habib
 * @on 24.05.2021 22:27
 */
public class Codility {
    public static void main(String[] args) {
        int N = -5895;
        List<Integer> ss = new ArrayList<>();
        List<Integer> search = new ArrayList<>();
        List<Integer> bigest = new ArrayList<>();
        List<String> bigestString = new ArrayList<>();
        int K =0;

        if (N < 0) {
            K=N*(-1);
            while (K > 0) {
                ss.add(K % 10);
                search.add(K % 10);
                K /= 10;
            }
        } else {
            while (N > 0) {
                ss.add(N % 10);
                search.add(N % 10);
                N /= 10;
            }
        }
        int count = 0;
        int count2 = 0;
        int countForFive = 0;
        int howManayFiveHave = 0;
        String as = "";
        for (int t : ss) {
            if (t == 5) {
                howManayFiveHave++;
            }
        }
        for (int i = 0; i < howManayFiveHave; i++) {
            for (int a : ss) {
                if (count == 0) {
                    if (a == 5) {
                        if (count2 > 0) {
                            count2--;
                            as += String.valueOf(a);
                            continue;
                        }
                        if (countForFive <= howManayFiveHave) {
                            count++;
                            countForFive++;
                            count2 = countForFive;
                            continue;
                        }
                    }
                }
                as += String.valueOf(a);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(as);
            bigest.add(Integer.parseInt(stringBuilder.reverse().toString()));
            as = "";
            count = 0;
        }
        int solution=0;
        if(N>0){
             solution = Collections.max(bigest);
        }else {

             solution = Collections.min(bigest);
             solution=solution*(-1);

        }
        System.out.println(solution);

    }
}
