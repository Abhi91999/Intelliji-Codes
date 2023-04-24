package com.example.codingpractice;
interface Bike{
    void bajaj();
    void hero();

}
interface SuperBike extends Bike{
    void ducatti();
    void kawasaki();
}
class BuyBike implements SuperBike{
    public void ducatti(){
        System.out.println("I want to buy ducatti pinagle");
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


    }

}
