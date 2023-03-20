package com.example.codingpractice;

public class SquareInherit extends Shape {
    SquareInherit(int dim1) {
        super(dim1, -1);
    }

    public int area() {
        return this.dim1 * this.dim1;
    }
}
