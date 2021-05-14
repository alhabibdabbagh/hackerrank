package com.project.hackerrank.challenge.sort.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author habib
 * @on 5.05.2021 13:23
 */
public class SortChanllenge {

    public static void main(String[] args) {

        List siralar = Arrays.asList(100, 100, 100, 100, 55, 66, 88, 99, 75, 55, 66, 77, 5, 64, 23, 48, 56, 23, 23, 23, 23, 1, 1, 1, 1, 2, 4, 69, 3, 0);
        Collections.sort(siralar, Collections.reverseOrder());// buyukten kucuğa sıralanıyor
        siralar.forEach(System.out::println);
        //  HACKERRANK SORUSU CEVABIII sıralma sorusu mesela 3 kişi 100 alınca 1. oluyor ama 99 alanı 4. oluyor .
        List son = new ArrayList();
        for (int i = 0; i < siralar.size(); i++) {
            if (i == 0) {
                son.add(i + 1);// SON.ADD(İ); SIFIRDAN BAŞLASIN İSTERNİRSE
            } else if (siralar.get(i - 1).equals(siralar.get(i))) {

                son.add(son.get(i - 1));
            } else {
                son.add(i + 1);// SON.ADD(İ); SIFIRDAN BAŞLASIN İSTERNİRSE
            }

        }
        siralar.forEach(System.out::print);
        System.out.println();

        son.forEach(System.out::print);
    }
}
