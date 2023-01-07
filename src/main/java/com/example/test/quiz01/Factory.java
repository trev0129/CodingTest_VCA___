package com.example.test.quiz01;

public class Factory {
  private BreadFile breadFile;
  public Factory(BreadFile breadFile) {
    this.breadFile = breadFile;
  }

  public Bread getBread(String type) {
    if (type == null) {
      return null;
    }
    switch (type) {
      case "cream":
        return new Cream(breadFile);
      case "sugar":
        return new Sugar(breadFile);
      case "butter":
        return new Butter(breadFile);
    }
    return null;
  }
}