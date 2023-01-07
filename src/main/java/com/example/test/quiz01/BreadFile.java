package com.example.test.quiz01;

import java.util.LinkedHashMap;

public class BreadFile {
  private String breadType;
  private LinkedHashMap<String, Integer> recipe;
  @Override
  public String toString() {
    return "Bread [breadType=" + breadType + ", recipe=" + recipe + "]";
  }
  public String getBreadType() {
    return breadType;
  }
  public void setBreadType(String breadType) {
    this.breadType = breadType;
  }
  public LinkedHashMap<String, Integer> getRecipe() {
    return recipe;
  }
  public void setRecipe(LinkedHashMap<String, Integer> recipe) {
    this.recipe = recipe;
  }



}
