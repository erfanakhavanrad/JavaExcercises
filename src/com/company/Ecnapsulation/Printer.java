package com.company.Ecnapsulation;

public class Printer {

  private int tonerLevel;
  private int numberOfPagesPrinted;
  private boolean duplexPrint;

  public void fillUpPrinter(int ink) {
    int verify = tonerLevel + ink;
    if (tonerLevel < 100 && verify < 100) {
      tonerLevel += ink;
      System.out.println(tonerLevel);
    } else {
      System.out.println("Overflow");
    }
  }

  public void printPage(int desiredToPrint, boolean duplexPrint) {
    if (duplexPrint) {
      numberOfPagesPrinted = 0;
      for (int i = 0; i <= desiredToPrint; i +=2) {
        int sheets = desiredToPrint / 2;
        System.out.println(
            "Printing " + desiredToPrint + " pages on both sides on " + sheets + " sheets.");

        for (int j = 1; j <= desiredToPrint; j++) {
          numberOfPagesPrinted = j;
                  System.out.println("Number of numberOfPagesPrinted is " + numberOfPagesPrinted);

        }

        sheets += 1;
      }
    } else {
      System.out.println("Printing" + desiredToPrint + " pages on 1 side.");
      for (int i = 0; i <= desiredToPrint; i++) {
        System.out.println("Number of pages printed is " + numberOfPagesPrinted);
        numberOfPagesPrinted += 1;
      }
    }
  }
}
