package com.example.codingpractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
//        Creating a file
//        File myFile = new File("check.txt");
//        try {
//            myFile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create Path");
//            throw new RuntimeException(e);
//        }
//        try {
//            FileWriter myFileWriter = new FileWriter("check.txt");
//            myFileWriter.write("This is the first file from our java course\n");
//            myFileWriter.write("Ok now Bye");
//            myFileWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        File myFile = new File("check.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine())
            {
                String str = sc.nextLine();
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
