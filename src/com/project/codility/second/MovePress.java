package com.project.codility.second;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author habib
 * @on 30.05.2021 11:32
 */
public class MovePress {
    public static void main(String[] args) {
        //String strinPress = "><^v";
       // String strinPress = "><><";
      // String strinPress = "<<>>^v>><<>";
       String strinPress = "<<^<v>>";
        List list = Arrays.asList(strinPress.split(""));
        AtomicInteger controlPress = new AtomicInteger();
        AtomicInteger count = new AtomicInteger();
        AtomicInteger count2 = new AtomicInteger();
        controlPress.set(0);
        count.set(0);
        count2.set(0);

        list.forEach(o -> {
            count2.getAndIncrement();
            if (o.equals("^") || o.equals("v")) {//< = 1 , > = 2 , ^v = 0
                controlPress.set(0);
                count.getAndIncrement();

            } else if (o.equals(">")) {
                if( count2.get()!=list.size()  ){

                    controlPress.set(2);
                }else{
                    controlPress.set(2);
                    count.getAndIncrement();
                }

            } else {
                if(controlPress.get()==2){
                    controlPress.set(2);
                }else{
                    controlPress.set(1);
                    count.getAndIncrement();
                }

            }


        });
      //  list.forEach(System.out::println);
        System.out.println(count);

    }
}
