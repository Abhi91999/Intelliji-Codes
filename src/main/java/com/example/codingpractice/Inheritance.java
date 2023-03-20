package com.example.codingpractice;

import java.util.SortedMap;

class Base extends Thread{
    protected int x;
    private int y;

    public Base(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX()  {
        System.out.println("I am setting the base class"+x);
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        System.out.println(y);
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class Hybrid extends Base{
    public Hybrid(int x, int y) {
        super(x, y);
    }

    public int getJ() {
        System.out.println("I am setting hybrid calss"+j);
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    private int j;

}
class Super extends Hybrid{

    public Super(int x, int y) {
        super(x, y);
    }
    private int k;

    public int getK() {
        System.out.println("This is the super class"+x);
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Base bs = new Base(14,15);
//        bs.setX(2);
//        bs.setY(4);
        Hybrid hy = new Hybrid(50,60);
        hy.setJ(16);
        System.out.println(bs.getX()+" "+bs.getY());
        System.out.println(hy.getX()+" "+hy.getJ());
        Super sc = new Super(24,75);
        sc.setK(99);
        System.out.println(sc.getK());


    }
}
