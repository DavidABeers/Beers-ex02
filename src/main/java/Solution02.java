/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Beers
 */

/*
 *   print a prompt for input string
 *   store the input string
 *   get the number of characters within the stored string
 *   print the number of characters in the string
 */

import java.util.Scanner;

public class Solution02 {

    public static void main(String []args){
        System.out.println("What is the string to count characters for?");
        Scanner inputScanner  = new Scanner(System.in);
        String inputString = inputScanner.nextLine();
        System.out.printf("%s has %d characters", inputString, inputString.length());
    }
}
