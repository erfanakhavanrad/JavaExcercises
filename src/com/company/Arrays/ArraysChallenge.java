package com.company.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {

  private static Scanner scanner = new Scanner(System.in);
  static int[] number = new int[5];
  static int[] sorted = new int[number.length];

  public static void main(String[] args) {
    getIntegers();
    printArray();
    sortIntegers();
  }

  public static int[] getIntegers() {

    for (int i = 0; i < number.length; i++) {
      System.out.println("Enter number " + i);
      number[i] = scanner.nextInt();
    }

    return number;
  }

  public static void printArray() {
    System.out.println(Arrays.toString(number));
  }

  public static int[] sortIntegers() {
    for (int i = 0; i < number.length; i++) {
      sorted[i] = number[i];
    }
    boolean flag = true;
    int temp;
    while (flag) {
      flag = false;
      for (int i = 0; i < sorted.length - 1; i++) {
        if (sorted[i] < sorted[i + 1]) {
          temp = sorted[i];
          sorted[i] = sorted[i + 1];
          sorted[i + 1] = temp;
          flag = true;
        }
      }
    }
    System.out.println(Arrays.toString(sorted));
    return sorted;
  }
}
