package com.example.codingpractice;
class NegativeException extends Exception{
    public String toString(){
        return "I am String";
    }
    public String getMessage(){
        return "I am get Message";
    }
}

class Employee
{
    int id;
    int salary;
    String name;
    public static int divide (int a, int b) throws ArithmeticException
    {
        int c = a/b;
        return c;
    }
    public static double area(int r) throws NegativeException{
        if(r<0)
        {
            throw new NegativeException();
        }
        double area = Math.PI * r *r;
        return area;
    }
    public void printDetails()
    {
        System.out.println("My id is "+id);
        System.out.println("My name is"+name);
    }
    public int getSalary()
    {
        return salary;
    }
}


public class OPPSPractice {
    public static void main(String[] args) {
        Employee harry = new Employee();
        Employee john = new Employee();
        harry.id = 12;
        harry.name = "Abhi";
        john.id = 14;
        john.name = "aniket";
        harry.salary = 10000;
        john.salary = 12000;
        john.printDetails();
        harry.printDetails();
        System.out.println(harry.getSalary());
        System.out.println(john.getSalary());
        try{
            int c = harry.divide(6,0);
            System.out.println(c);
            double ar = harry.area(-6);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
