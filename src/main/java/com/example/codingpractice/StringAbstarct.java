package com.example.codingpractice;
class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books =0;
    }
    void addBooks(String name)
    {
        this.books[no_of_books] = name;
        no_of_books++;
        System.out.println(name + "books has been added...");
    }
    void showAvailableBooks(){
        System.out.println("The available books are:");
        for(String book : this.books)
        {
            if(book == null) break;
            System.out.println("* "+ book);
        }
    }
}

public class StringAbstarct {
    public static void main(String[] args) {
        Library li = new Library();
        li.addBooks("Always think bigger");
        li.addBooks("I am richest man");
        li.showAvailableBooks();
//        String[] pr = li.books;
//        for(int i=0;i<li.books.length;i++)
//        {
//            System.out.println(pr[i]);
//        }
    }
}
