package com.example.test.quiz01;

import java.util.List;

public class Test01 {
  public static void main(String[] args) throws Exception {
    List<Bread> breadList = new BreadDao("bread.json").breadLoad();

    for (int i = 0; i < breadList.size(); i++) {
      System.out.println("breadType: " + breadList.get(i).getBreadType());
      System.out.println("recipe");
      for (String key : breadList.get(i).getRecipe().keySet()) {
        System.out.println(key + ": " + breadList.get(i).getRecipe().get(key));
      }
      System.out.println();
    }

  }
}
