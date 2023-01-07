package com.example.test.quiz03;

public class Test03 {
  private static int factorial(int num) {
    if (num == 1) {
      return 1;
    }
    return num * factorial(--num);
  }
  public static void main(String[] args) {
    int result = factorial(5);
    System.out.println(result);
  }
}
