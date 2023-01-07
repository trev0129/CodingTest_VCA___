package com.example.test.quiz02;

public class Test02 {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    int reseult = calculator.add(4).add(5).subtract(3).out();
    System.out.println(reseult);
  }
}
