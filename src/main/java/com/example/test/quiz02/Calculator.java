package com.example.test.quiz02;

public class Calculator {

  private int reseult = 0;

  public Calculator add(int number) {
    this.reseult += number;
    return this;
  }  
  public Calculator subtract(int number) {
    this.reseult -= number;
    return this;
  }  
  public Calculator multiply(int number) {
    this.reseult *= number;
    return this;
  }  
  public Calculator division(int number) {
    this.reseult /= number;
    return this;
  }
  public int out() {
    return reseult;
  }
}
