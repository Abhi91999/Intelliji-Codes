package com.example.codingpractice;

public class SphereInherit extends Shape {
    SphereInherit(int dim1) {
        super(dim1, -1);
    }

    public double area() {
        return 4 * Math.PI * dim1 * dim1;
    }
}
