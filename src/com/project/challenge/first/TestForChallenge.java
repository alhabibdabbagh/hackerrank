package com.project.challenge.first;

import java.util.*;
import java.util.List;

/**
 * @author habib
 * @on 15.06.2021 21:50
 */
public class TestForChallenge {
    public static void main(String[] args) {
        System.out.println(Challenge.comperess("abbb aa  "));
    }
}


class Challenge {
    public static String comperess(String text) {
        List<String> list = new ArrayList<>(Arrays.asList(text.split("")));
        int count = 1;
        int listSize = list.size();
        String result = "";
        String characterWithCount = "";
        String repeatKontrol = "";
        String isRepeatCharacter = "";
        for (int i = 0; i < list.size(); i++) {//first loop

            for (int j = i + 1; j < list.size(); j++) { // second loop, for control the first character on secode loop

                if (!list.get(i).equals(isRepeatCharacter)) { // aaaa a  aaa  like this is repeat
                    if (list.get(i).equals(list.get(j))) { // if equals
                        count++; // count 2
                        repeatKontrol = list.get(i);
                        if (list.get(i).equals(" ")) {// isBlank
                            result = list.get(i);
                        } else {
                            result = list.get(i) + count;
                        }


                    } else {
                        if (list.get(i).equals(" ")) {
                            characterWithCount += list.get(i);
                        } else {
                            characterWithCount += list.get(i) + count;
                        }

                        count = 1;
                        break;
                    }
                } else {// break the loop
                    break;
                }

            }
            isRepeatCharacter = repeatKontrol;

        }
        if (!list.get(listSize - 1).equals(list.get(listSize - 2))) {
            characterWithCount += list.get(listSize - 1) + count;
            result = "";
        } else if (characterWithCount.isEmpty())
            return result;
        return  characterWithCount + result ;
    }
}
