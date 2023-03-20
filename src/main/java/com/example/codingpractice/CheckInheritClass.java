package com.example.codingpractice;
class Inherit extends Shape implements RectangeInherit{

    Inherit(int dim1, int dim2) {
        super(dim1, dim2);
    }
}

public class CheckInheritClass {
    public static void main(String[] args) {
        Inherit in = new Inherit(2,4);
    }
}
