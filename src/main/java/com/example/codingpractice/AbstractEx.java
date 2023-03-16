package com.example.codingpractice;
abstract class Check{
    public Check(){
        System.out.println("I am base constructor");
    }
    public void sayHello(){
        System.out.println("Say Hello");
    }
    abstract public void greet();
    abstract public void tell();
}
class Check2 extends Check{
    public Check2(){
        System.out.println("I am check 2 constructor");
    }
    public void greet(){
        System.out.println("Good Morning");
    }
    public  void tell(){
        System.out.println("I am Check2");
    }
}
class Check3 extends Check2{
    public Check3(){
        System.out.println("I am a Check 3 constructor");
    }
    public void greet(){
        System.out.println("I am class Check3 greet");
    }
    public void tell(){
        System.out.println("I am a class Check3 tell");
    }
}

public class AbstractEx {
    public static void main(String[] args) {
        Check3 ch = new Check3();
        ch.greet();
        ch.tell();
        ch.sayHello();
    }
}
