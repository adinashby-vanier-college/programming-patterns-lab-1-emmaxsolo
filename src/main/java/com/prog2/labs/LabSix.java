package com.prog2.labs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author adinashby
 *
 */

public class LabSix {

	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
                
                //Declare first integer 'n'
                int n = scanner.nextInt();
                
                //Create ArrayList that will store all inputted integers
                ArrayList<ArrayList<Integer>> list = new ArrayList<>();
                
                //Create loop that will create lines and store integers
                //& get the denoting numbers on each line 
                for(int i = 0; i < n; i++){
                    int d = scanner.nextInt(); //d = first number on line
                    ArrayList<Integer> newLine = new ArrayList<>();
                    
                    //Create loop that adds inputted values to newLine
                    for(int j = 0; j < d; j++){
                        int val = scanner.nextInt();
                        newLine.add(val);
                    }
                    
                    list.add(newLine); //Adds new line to main ArrayList
                    
                }
                
                //Declare number of queries
                int q = scanner.nextInt();
                
                //Create loop that gets each query and prints the number
                //Print ERROR if invalid position was inputted
                for(int i = 0; i < q ; i++){
                    int y = scanner.nextInt(); 
                    int x = scanner.nextInt();
                    
                    //if statement to make sure position exists
                    if()
                    //get element on line y position x
                    int elementLine = list.get(y.(get(x)));
  
                    
                    
                    
                }
                
                
                
	}

	/**
	 * Please refer to the README file for question(s) description
	 */

	public String arrayListProblem(String input) {
		return "";
	}
}
