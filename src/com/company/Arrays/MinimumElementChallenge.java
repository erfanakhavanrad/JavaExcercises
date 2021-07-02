package com.company.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {

  static Scanner scanner = new Scanner(System.in);
  static int count;

  public static void main(String args[]) {
    System.out.println("How many numbers to you want to enter?");
    count = scanner.nextInt();
//    int[] returnedArray = readIntegers(count);
//    int returnedMin = findMin(returnedArray);
    findMin(readIntegers(count));
  }

  public static int[] readIntegers(int count) {
    int[] myArray = new int[count];
    System.out.println("Enter your array values");
    for (int i = 0; i < count; i++) {
      myArray[i] = scanner.nextInt();
    }
    System.out.println(Arrays.toString(myArray));
    return myArray;
  }

  public static int findMin(int[] array) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < array.length; i++) {
      int value = array[i];
      if (value < min) {
        min = value;
      }
    }
    System.out.println(min);
    return min;
  }
}
