package com.example.test.quiz01;

import java.util.LinkedHashMap;
import java.util.Map;

public class Butter implements Bread{
  private BreadFile breadFile;
  public Butter(BreadFile breadFile) {
    this.breadFile = breadFile;
  }

  @Override
  public String getBreadType() {
    return breadFile.getBreadType();
  }

  @Override
  public Map<String, Integer> getRecipe() {
    Map<String, Integer> recipe = new LinkedHashMap<String, Integer>();
    for (String key : breadFile.getRecipe().keySet()) {
      recipe.put(key, breadFile.getRecipe().get(key));
    }

    return recipe;
  }

}
