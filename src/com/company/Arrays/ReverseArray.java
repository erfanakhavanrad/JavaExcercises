package com.company.Arrays;

import java.util.Arrays;

public class ReverseArray {

  public static void main(String args[]) {
    int[] array = new int[]{5, 3, 6, 1, 4};
    reverse(array);
  }

  public static void reverse(int[] array) {
    System.out.println(Arrays.toString(array));
    int[] reversed = new int[array.length];

    for (int i = array.length; i > 0; i--) {
      int temp = array[i];
      System.out.println("bbbb " + temp);
    }
  }
}
