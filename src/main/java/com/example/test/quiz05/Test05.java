package com.example.test.quiz05;

public class Test05 {
  public static void main(String[] args) {
    int[][] arr = {
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
        {0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
        {0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
        {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
        {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
        {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    System.out.println("[ initial state ]");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.printf("%d ", arr[i][j]);
      }
      System.out.println();
    }

    int[][] resultArr = arr;
    while (true) {
      int check = 0;
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
          if (i != 0 && j != 0 && i != arr.length - 1 && j != arr[0].length - 1) {
            if (resultArr[i][j] != 0 
                && resultArr[i - 1][j] != 0 
                && resultArr[i + 1][j] != 0 
                && resultArr[i][j - 1] != 0 
                && resultArr[i][j + 1] != 0) {

              if (resultArr[i][j] <= resultArr[i - 1][j]
                  && resultArr[i][j] <= resultArr[i + 1][j]
                      && resultArr[i][j] <= resultArr[i][j - 1]
                          && resultArr[i][j] <= resultArr[i][j + 1]) {
                resultArr[i][j]++;
                check = 1;
              }

            } else {
              resultArr[i][j] = resultArr[i][j];
            }
          }
        }
      }
      if (check == 0) {
        break;
      }
    }

    System.out.printf("\n[ result ]\n");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.printf("%d ", resultArr[i][j]);
      }
      System.out.println();
    }
  }
}
