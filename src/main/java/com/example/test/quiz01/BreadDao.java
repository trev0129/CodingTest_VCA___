package com.example.test.quiz01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import com.google.gson.Gson;

public class BreadDao {
  private List<BreadFile> list = new LinkedList<>();
  private String filename;

  public BreadDao(String filename) {
    this.filename = filename;
  }

  public List<Bread> breadLoad() throws Exception {
    try(BufferedReader in = new BufferedReader(new FileReader(filename));) {
      StringBuilder strBuilder = new StringBuilder();
      String str;
      while ((str = in.readLine()) != null) {
        strBuilder.append(str);
      }
      BreadFile[] arr = new Gson().fromJson(strBuilder.toString(), BreadFile[].class);
      for (int i = 0; i < arr.length; i++) {
        list.add(arr[i]);
      }

      List<Bread> breadList = new LinkedList<>();
      for (int i = 0; i < list.size(); i++) {
        Factory factory = new Factory(list.get(i));
        breadList.add(factory.getBread(list.get(i).getBreadType()));
      }

      return breadList;
    }
  }
}
