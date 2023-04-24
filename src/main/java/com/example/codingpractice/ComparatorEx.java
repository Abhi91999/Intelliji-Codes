package com.example.codingpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student5 implements Comparable<Student5>{
    String name;
    int age;

    public Student5(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student5{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student5 that) {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}
public class ComparatorEx {
    public static void main(String[] args) {
        Comparator<Student5> comp = (i, j) -> {
                return i.age>j.age ? 1 : -1;
            };
        ArrayList<Student5> li = new ArrayList<Student5>();
        li.add(new Student5("Abhishek", 56));
        li.add(new Student5("Abhish", 89));
        li.add(new Student5("Abhishe", 50));
        li.add(new Student5("Abhi", 48));
        li.add(new Student5("shek", 9));
        li.add(new Student5("ek", 75));
        Collections.sort(li,comp);
        for(Student5 i : li)
        System.out.println(i);
    }

}
