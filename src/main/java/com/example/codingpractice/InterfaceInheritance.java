package com.example.codingpractice;
interface Bike{
    void bajaj();
    void hero();
    private void check(){
        System.out.println("I am special");
    }
    default void excep(){
        System.out.println("I wamt to buy bmw 310gs");
    }
}
interface SuperBike extends Bike{
    void ducatti();
    void kawasaki();
}
class BuyBike implements SuperBike{
    public void ducatti(){
        System.out.println("I want to buy ducatti pinaganle");
    }
    public void kawasaki(){
        System.out.println("I want to buy kawasaki ninja z1000");
    }
    public void bajaj()
    {
        System.out.println("I don't want to buy bajaj dominar");
    }
    public void hero()
    {
        System.out.println("I don't want to buy hero karizma");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        BuyBike bs = new BuyBike();
        bs.bajaj();
        bs.ducatti();
        bs.hero();
        bs.kawasaki();
        bs.excep();
    }

}
