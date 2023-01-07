package com.example.test.quiz04;

public class Test04 {
  private static int factorial(int num) {
    if (num > Integer.MAX_VALUE) {
      return 0;
    } else if (num == 1) {
      return 1;
    } else {
      return num * factorial(--num);
    }
  }
  public static void main(String[] args) {
    int result = factorial(50);
    if (result == 0) {
      System.out.println("스택오버플로우!");
    } else {
      System.out.println(result);
    }
  }
}
