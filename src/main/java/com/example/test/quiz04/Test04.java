package com.example.test.quiz04;

public class Test04 {
  private static int factorial(int num) {
    if (num == 1) {
      return 1;
    }
    return num * factorial(--num);
  }
  public static void main(String[] args) {
    try {
      int result = factorial(1000000);
      System.out.println(result);
    } catch (StackOverflowError e) {
      System.out.println("스택오버플로우!");
    }
  }
}
