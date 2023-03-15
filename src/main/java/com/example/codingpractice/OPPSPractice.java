package com.example.codingpractice;
class Employee
{
    int id;
    int salary;
    String name;
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
    }
}
