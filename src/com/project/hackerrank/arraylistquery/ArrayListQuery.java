package com.project.hackerrank.arraylistquery;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListQuery {
	  public static void main(String[] args) throws IOException {
	        Scanner scanner=new Scanner(System.in);
	        int listCount = scanner.nextInt();
	        List<List<Integer>> listOfList=new ArrayList<>();
	        
	        for (int i = 0; i < listCount; i++) {
				List<Integer> integers=new ArrayList<Integer>();
				int listOfCount=scanner.nextInt();
				for (int j = 0; j < listOfCount; j++) {
					integers.add(scanner.nextInt());
				}
				listOfList.add(integers);
			}
	        
	        
	        int countQuery = scanner.nextInt();
	        for (int i = 0; i < countQuery; i++) {
	    				
	    				int line=scanner.nextInt();
	    				int index=scanner.nextInt();
	    				
	    				try {
	    					System.out.println(listOfList.get(line-1).get(index-1));
						} catch (Exception e) {
							// TODO: handle exception
							 System.out.println("ERROR!");
						}
	    				
	    			}
	        
	       
	    }

}
