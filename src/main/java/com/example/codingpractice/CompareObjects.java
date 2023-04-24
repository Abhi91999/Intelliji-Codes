package com.example.codingpractice;
class Pet{
    String name;
    int age;
    String breed;
    Pet(String name, int age,String breed)
    {
        this.name=name;
        this.age=age;
        this.breed=breed;
    }
    public boolean Checkequals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }
        if(obj == null && this.getClass() != obj.getClass())
        {
            return false;
        }
        Pet p1 = (Pet)obj;
        return this.name.equals(((Pet) obj).name) && this.age == ((Pet) obj).age && this.breed.equals(((Pet) obj).breed);
    }
}

public class CompareObjects {
    public static void main(String[] args) {
       Pet dog1 = new Pet("Whiskey",3,"German");
       Pet cat = new Pet("Patty",2,"Tabby");
       Pet dog2 = new Pet("Whiskey",3,"German");
        System.out.println(dog1.Checkequals(dog2));

    }
}
