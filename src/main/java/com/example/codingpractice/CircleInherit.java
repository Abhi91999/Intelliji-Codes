package com.example.codingpractice;

public class CircleInherit extends Shape {
    CircleInherit(int dim1) {
        super(dim1, -1);
    }

    public double area() {
        return this.dim1 * Math.PI*this.dim1;
    }
}
