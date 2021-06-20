package com.project;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author habib
 * @on 15.06.2021 23:05
 */
public class ww {
    public static void main(String[] args) {
        System.out.println(Challenge1.removeRedundant("aaba kouq bux",1));
    }
}
class Challenge1{
    public static String removeRedundant(String text,int repeats){

        List<String> list = new ArrayList<>(Arrays.asList(text.split("")));
        String ss = list.get(0);
        String ss1 = "";
        List<String> mtList = new ArrayList<>();
        int count = 1;
        int count2 = list.size();
        String soluntion = "";
        String soluntion2 = "";
        String soluntion3 = "";
        String soluntion4 = "";
        boolean isTamam =true;
        for (int i = 0; i < list.size(); i++) {
/*            if (ss.equals(list.get(i))) {
                count++;
                *//* ss=list.get(i)*//*
                ;
                soluntion = "";
                soluntion = list.get(i) + count;
            }*//*else if (list.size()-1==i){
                soluntion=ss+count;
            }*//* else {
                ss = list.get(i);
                count = 1;

                if (ss.equals(ss1)) {
                    soluntion4+=
                            soluntion3 = "";
                    soluntion3 = list.get(i) + count;
                    count++;
                } else {
                    ss1 = list.get(i);
                    soluntion2 = "";
                    soluntion2 = list.get(i) + count;
                    count++;
                }

      *//*          soluntion=soluntion+list.get(i)+count;
            count=0;*//*
            }*/
            for (int j = i + 1; j < list.size(); j++) {

                if (!list.get(i).equals(soluntion4)) {
                    if (list.get(i).equals(list.get(j))) {
                        count++;
                        soluntion3 = list.get(i);
                        if(list.get(i).equals(" ")){
                            soluntion=list.get(i);
                        }else{
                            soluntion=list.get(i)+count;
                        }


                    } else {
                        if(list.get(i).equals(" ")){
                            soluntion2 +=list.get(i);
                        }else{
                            soluntion2 +=list.get(i)+count;
                        }
                /*     if (count > 1)
                         isTamam = false;*/
                        count = 1;
                        break;
                    }
                    // if (!list.get(i).equals(list.get(j))) isTamam = true;
                } else {
                    break;
                }

            }
            soluntion4 = soluntion3;

        }
        if(!list.get(count2-1).equals(list.get(count2-2))){
            soluntion2+= list.get(count2-1)+count;
            soluntion="";
        }else
        if (soluntion2.isEmpty())
            return soluntion;
        return (!soluntion2.substring(soluntion2.length()-2,soluntion2.length()).equals(soluntion) )?soluntion2+soluntion: soluntion2;



    }
}
