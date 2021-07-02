package com.company.Maktab;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Questions {
//  public static void main (String args[]){

/**
 triangle(); 1
 lightSwitch(); 5
 */
//    System.out.println(visionTest()); // 4
//    bonus();
//    descartes();

//  }

  public static void descartes() {
    Scanner input = new Scanner(System.in);
    int x1, y1, x2, y2, x3, y3;

    System.out.println("enter X1");
    x1 = input.nextInt();
    System.out.println("enter Y1");
    y1 = input.nextInt();
    System.out.println("enter X2");
    x2 = input.nextInt();
    System.out.println("enter Y2");
    y2 = input.nextInt();
    System.out.println("enter X3");
    x3 = input.nextInt();
    System.out.println("enter Y3");
    y3 = input.nextInt();

    if (x1 == x3) {
      int yPlus = y1 + y3;
      int y4 = yPlus - y2;
      System.out.println("Dimensions of fourth is " + x2 + ", " + y4);
    } else if (x1 == x2) {
      int yPlus = y1 + y2;
      int y4 = yPlus - y3;
      System.out.println("Dimensions of fourth is " + x2 + ", " + y4);
    } else if (x2 == x3) {
      int yPlus = y2 + y3;
      int y4 = yPlus - y1;
      System.out.println("Dimensions of fourth is " + x2 + ", " + y4);
    } else {
      System.out.println("Error");
    }

  }


  public static void lightSwitch() {
    Scanner input = new Scanner(System.in);
    int numberOfLines = 5, stateChanged = 0;

    System.out.println("Enter number of lines:");
    numberOfLines = input.nextInt();
    int statesCount[] = new int[numberOfLines];
//    Enter possible change variety
    for (int i = 0; i < statesCount.length; i++) {
      System.out.println("Enter number of line " + i);
      statesCount[i] = input.nextInt();
    }

    for (int i = 0; i < statesCount.length - 1; i++) {
//      Check whether it is equal to next number or not
      if (statesCount[i] != statesCount[i + 1]) {
        stateChanged++;
      }
    }
    System.out.println(stateChanged);
  }

  public static int visionTest() {
    String inputWord, outputWord;
    int mistyped;
    Scanner input = new Scanner(System.in);

    inputWord = input.nextLine();
    outputWord = input.nextLine();
    int iWL = inputWord.length();
    int oWL = outputWord.length();
//    int lmin = Math.min(iWL, oWL);

    for (int i = 0; i < iWL; i++) {
      int inputWord_ch = (int) inputWord.charAt(i);
      int outPutWord_ch = (int) outputWord.charAt(i);

      if (inputWord_ch != outPutWord_ch) {
        return inputWord_ch - outPutWord_ch;
      }
    }

    if (iWL != oWL) {
      return iWL - oWL;
    } else {
      return 0;
    }
  }

  public static void triangle() {
    int a, b, c, sumAB, sumAC, sumBC;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a:");
    a = input.nextInt();
    System.out.println("Enter b:");
    b = input.nextInt();
    System.out.println("Enter c:");
    c = input.nextInt();

    sumAB = (a * a) + (b * b);
    sumAC = (a * a) + (c * c);
    sumBC = (b * b) + (c * c);

    if (sumAB == (c * c)) {
      System.out.println("Yes");
    } else if (sumAC == (b * b)) {
      System.out.println("Yes");
    } else if (sumBC == (a * a)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  public static void bonus(){
    Deque deque = new LinkedList<>();

    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your lines (Enter exit to continue):");

//    As long as we enter loop continues
    while(sc.hasNext()) {
      String line = sc.next();
      if(line.toLowerCase().equals("exit")) {
        break;
      }
      deque.add(line);
    }

    System.out.println("\n=====Reversed Lines=====\n");

    Iterator reverse = deque.descendingIterator();
    while (reverse.hasNext()) {
      System.out.println(reverse.next());
    }
  }
}
