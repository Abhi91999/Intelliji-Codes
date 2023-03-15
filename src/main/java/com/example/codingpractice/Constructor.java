package com.example.codingpractice;
class MyEmployee{
    private int id;
    private String name;
    public MyEmployee()
    {
        id = 45;
        name = "Abhishek";
    }
    public MyEmployee(int j)
    {
        id= j;
    }
    public void setId(int i)
    {
        this.id = i;
    }
    public void setName(String a)
    {
        this.name = a;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();
        MyEmployee ab = new MyEmployee(4);
        System.out.println(emp.getId()+" "+emp.getName());
        System.out.println((ab.getId()+" "+ab.getName()));
        emp.setId(5);
        emp.setName("Love Trading");
        System.out.println(emp.getId()+" "+emp.getName());

    }
}
