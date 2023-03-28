package com.example.codingpractice;

import java.util.HashMap;

public class SetZeros {
    public static void setZeroes(int[][] matrix) {
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    hm.put((j + ":" + i), i);
                }
            }
        }

        for (String key : hm.keySet()) {
            int res = Integer.parseInt(key.substring(0, key.indexOf(":")));

            for (int j = 0; j < matrix[0].length; j++) {
                matrix[hm.get(key)][j] = 0;
            }

            for (int i = 0; i < matrix.length; i++) {
                matrix[i][res] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);

    }
}
