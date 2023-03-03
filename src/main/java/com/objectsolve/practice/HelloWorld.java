package com.objectsolve.practice;


public final class HelloWorld {

  private static final String workingModel =
    "5 1 9 5\n7 5 3\n2 4 6 8".
      replaceAll(" ", "");

  private static final int LIMIT =
    workingModel.length();


  /* prime the pump - by introducing any valid value from
     the universe (set) as an artibrary lower-bounds value */
  private static int min =
    workingModel.charAt(0);

  private static int max = 0;

  private static int diff = 0;

  private static char candidate = ' ';
  private static int checksum = 0;


  /**
   * Canonical entry-point for a Java stand-alone app.
   */
  public static void main(String ... args) {


    for (int i = 0; i < LIMIT; i++) {

      candidate = workingModel.charAt(i);

      if (Character.isDigit(candidate)) {

        System.err.println("\nCandidate " + candidate);

        // coerce:  char-to-int
        int x = candidate - '0';

        max = x > max ? x : max;
        min = x < min ? x : min;
      }
      /* respond to a control-break condition upon
         encountering a newline (a non-digit character) */
      else {

        checksum = checksum + (max - min);

        min = workingModel.charAt(i);
        max = 0;

        System.err.println("\n\n");
      }

      System.err.println(
        GRN + "Max " + NC + max +
        GRN + "\nMin " + NC + min +
        GRN + "\nDif " + NC + (max - min));
    }

    // logic to account for post control-break state
    checksum = checksum + (max - min);

    System.err.println(
      GRN + "\n\n\nChecksum: " + NC + checksum);
  }


  public static final String RED = "\033[1;91m";
  public static final String GRN = "\033[1;92m";
  public static final String YLW = "\033[1;93m";
  public static final String NC = "\u001B[0m";
}
