package com.project.hackerrank.fifth;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author habib
 * @on 1.05.2021 02:33
 */
public class IteratorQuestion {

    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        int count=0;
        while (it.hasNext()) {
            Object element = it.next();
            if (element instanceof String)
                if(element.equals("###"))
                    break;;
        }
        return it;
    }
        public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0;i<n;i++){
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for(int i=0;i<m;i++){
            mylist.add(sc.next());
        }

        Iterator it=func(mylist);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}
