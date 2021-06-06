package com.project.codility.thrit;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author habib
 * @on 6.06.2021 11:13
 */
public class Potholes {
    public static void main(String[] args) {
        int [] X={2,4,2,6,7,1};
        int [] Y={0,5,3,2,1,5};
        int W =2;
/*        int [] X={4,8,2,2,1,4};
        int [] Y={1,2,3,1,2,3};
        int W =3;*/
/*        int [] X={0,3,6,5};
        int [] Y={0,5,3,2,1,5};
        int W =1;*/
        int count=0;
        int count1=0;
        int FirstNaumer=0;
        int solution=0;
        List<Integer> ssd=new ArrayList<>();


        StringBuilder stringBuilder=new StringBuilder();

        List<Integer> xCoordinate=Arrays.stream(X).boxed().collect(Collectors.toList());

  /*    //  Collections.sort(Arrays.asList(X));
        List xCoordinates= Arrays.asList(X);
        xCoordinates.stream().forEach(System.out::println);*/
        xCoordinate.sort(Integer::compareTo);
        //xCoordinate.stream().forEach(System.out::println);

        for(int i=0; i<xCoordinate.size();i++){

           int s=xCoordinate.get(i);
           if(s>count1 || s==0){
               count1=0;
               count1=s+W;
               count++;
           }

        }
        System.out.println(count);

/*
        int finalI = i;
        List<Integer> ss= xCoordinate.stream().filter(integer -> xCoordinate.get(finalI)+W>= integer).collect(Collectors.toList());

        break;
*/

    }
}
