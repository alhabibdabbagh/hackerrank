package com.project.hackerrank.javad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Java1DArray {

	 public static boolean canWin(int leap, int[] game) {
	
	        // Return true if you can win the game; otherwise, return false.
		/*
		 * 4 q = 4 (number of queries) 
		 * 5 3 
		 * game[] size n = 5, leap = 3 (first query) 
		 * 0 0 0 0 0 game = [0, 0, 0, 0, 0]
		 *  6 5 game[] size n = 6, leap = 5 (second query)
  			0 0 0 1 1 1 . . .
  			6 3
  			0 0 1 1 1 0 
  			3 1
  			0 1 0
		 */
		 boolean winnable = false;

		    Stack<Integer> visitedZeros = new Stack<Integer>();

		    List<Integer> visited = new ArrayList<Integer>();

		    visitedZeros.push(0);
		    while(!visitedZeros.isEmpty())  {
		        int i = visitedZeros.pop();
		        while(i<game.length) {

		            if (i == game.length - 1 || i+leap > game.length - 1){
		                winnable = true;
		                break;
		            } else if( !visited.contains(i+1) && game[i+1] == 0 ) {
		                //leapedZeros.put(i, Boolean.FALSE);
		                i++;
		                visited.add(i);  
		                visitedZeros.push(i);              
		            } else if (!visited.contains(i+leap)&& game[i+leap] == 0) {

		                //leapedZeros.put(i, Boolean.TRUE);
		                i+=leap;             
		                visited.add(i);
		                visitedZeros.push(i);
		            } 
		            else if (i>0 && !visited.contains(i-1) && game[i-1] == 0) {
		                i--;
		                visited.add(i);
		                visitedZeros.push(i);
		            }
		            else {
		                break;
		            }
		        }
		    }

		    return winnable;
		}

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int q = scan.nextInt();
	        while (q-- > 0) {
	            int n = scan.nextInt();
	            int leap = scan.nextInt();
	            
	            int[] game = new int[n];
	            for (int i = 0; i < n; i++) {
	                game[i] = scan.nextInt();
	            }

	            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
	        }
	        scan.close();
	    }

}
