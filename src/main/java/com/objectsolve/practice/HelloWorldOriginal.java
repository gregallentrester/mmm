package com.objectsolve.practice;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

/*
Description
In this problem, you will build an application which calculates the checksum of a data set. The input comes in the form of a table. For each row in the table, determine the difference between the largest value and the smallest value; the checksum is the sum of all those differences.

Example
Input table:

5 1 9 5
7 5 3
2 4 6 8

The first row's largest and smallest values are 9 and 1. The difference is 8.
The second row's largest and smallest values are 7 and 3. The difference is 4.
The third row's largest and smallest values are 8 and 2. This row's difference is 6.
In this example, the checksum would be 8 + 4 + 6 = 18

Notes/Tips
Make sure to talk through your thought process! We're interested in hearing how you approach the problem
We're looking for code quality, but be aware of time
Use the programming language you're most comfortable with
Think about edge cases
Remember, we want you to succeed! Feel free to ask any questions and work with your assessor if you get stuck
*/

/* Name of the class has to be "Main" only if the class is public. */
public class HelloWorldOriginal {

  public static void main(String ... args) {

    String input = "5 1 9 5\n7 5 3\n2 4 6 8";
    String tmp = input.replaceAll(" ", "");
    String[] tmp1 = tmp.split("\n");

    int checksum = 0;


    for (String s : tmp1) {

      int max = 0;
      int min = s.charAt(0);

      for (int i = 0; i < s.length(); i++) {

        char a = s.charAt(i);
        int x = a - '0';
        if (x > max) {
            max = x;
        }
        if (x < min) {
            min = x;
        }
      }

      System.out.println("Max:" + max + " Min" + min);

      int diff = max - min;
      System.out.println("Diff=" + diff);

      checksum = checksum + diff;

    }

    System.err.println(
      GRN + "\n\nChecksum = " + NC + checksum);
  }


  public static final String RED = "\033[1;91m";
  public static final String GRN = "\033[1;92m";
  public static final String YLW = "\033[1;93m";
  public static final String NC = "\u001B[0m";
}
