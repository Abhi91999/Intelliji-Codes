package com.example.codingpractice;
class BaseCheck{

    BaseCheck(){
        System.out.println("I am not a overloaded constructor");
    }
    BaseCheck(int k)
    {
        System.out.println("I am a overloaded constructor with value of a as :"+k);
    }

}
class Base1 extends BaseCheck{

        Base1() {
            //super(15);
            System.out.println("This is a derived class constructor");
        }
}
public class Inheritance1 {
    public static void main(String[] args) {
        //BaseCheck dc = new BaseCheck();
        Base1 v = new Base1();
    }
}
