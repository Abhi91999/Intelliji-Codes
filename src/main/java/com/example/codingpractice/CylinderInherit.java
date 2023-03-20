package com.example.codingpractice;

public class CylinderInherit extends Shape {
    CylinderInherit(int dim1, int dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return 2 * Math.PI * dim1 * dim2 + Math.PI * dim1*dim1;
    }
}
