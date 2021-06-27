package com.project.hackerrank.bigdecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author habib
 * @on 26.06.2021 17:04
 */
public class BigDecimalQuestion {
    public static void main(String[] args) {
        String[] s = {"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};
/*        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String a1, String a2) {
                //convert to big decimal inside comparator
                //so permanent string values are never changed
                //aka you only use the BigDecimal values to
                //compare the strings!
                BigDecimal a = new BigDecimal(a1);
                BigDecimal b = new BigDecimal(a2);
                return a.compareTo(b);
            }
        }));*/

        Comparator<String> stringComparator = new Comparator<String>() {//TODO read about this comparator
            @Override
            public int compare(String o1, String o2) {
                BigDecimal a = new BigDecimal(o1);
                BigDecimal b = new BigDecimal(o2);
                return a.compareTo(b);
            }
        };
        Collections.reverse(Arrays.asList(s));
        Arrays.sort(s, 0, 9, stringComparator);
        String[] ss=new String[9];
        for (int i = 0; i <s.length ; i++){
            ss[i]=s[i];
        }
        int j =0;
        for (int i = s.length-1; i >= 0; i--) {
            s[j]=ss[i];
            System.out.println(ss[j]);
j++;

        }

    }
/*
    String[] s ={"-100","50","0","56.6","90","0.12",".12","02.34","000.000"};
    List<String> list=Arrays.asList(s);
    List<BigDecimal> ss =list.stream().map(s1 -> {

        BigDecimal bigDecimal=BigDecimal.valueOf(Float.parseFloat((s1)));


        return bigDecimal ;
    }).sorted().collect(java.util.stream.Collectors.toList());
Collections.reverse(ss);
        for(int i=0;i<ss.size();i++){
        s[i]=String.valueOf(ss.get(i));
    }

        ss.stream().forEach(System.out::println);
    double d =0.3d;
    double d1 =0.1d;
    BigDecimal bigDecimal=BigDecimal.valueOf(d);
    BigDecimal bigDecimal1=BigDecimal.valueOf(d1);
    BigDecimal bigDecimal2=bigDecimal.add(bigDecimal1);

        System.out.println(bigDecimal2);
*/

}
