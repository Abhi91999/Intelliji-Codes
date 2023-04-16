package com.example.codingpractice;

public class ExcelSheetColumnTiles {
    public static void main(String[] args) {
        System.out.printf("The column number in string is %s%n",convertToTitle(701));
    }
    public static String convertToTitle(int columnNumber) {
        String ans = "";
        while (columnNumber>0){
            columnNumber--;
            ans = (char) ('A'+ (columnNumber%26)) + ans;
            columnNumber = columnNumber/26;
        }
        return ans;
    }
}
