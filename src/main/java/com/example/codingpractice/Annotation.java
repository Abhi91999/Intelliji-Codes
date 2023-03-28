package com.example.codingpractice;
interface Demoano{
    void meth1(int a);
//    void meth2();
}
//class AnnonyDemo implements Demoano{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("this is meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("This is meth2");
//    }
//}
public class Annotation {
    public static void main(String[] args) {
//        AnnonyDemo an = new AnnonyDemo();
//        an.meth1();
//        an.meth2();
//        Demoano obj = new Demoano() {
//            @Override
//            public void meth1() {
//                System.out.println("This is meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("This is meth2");
//            }
//        };
//        obj.meth1();
//        obj.meth2();
        Demoano obj = (a)->{System.out.println("I am labda expression" + a);};
        obj.meth1(6);
    }
}
