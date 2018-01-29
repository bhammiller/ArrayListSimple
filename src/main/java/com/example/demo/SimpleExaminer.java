package com.example.demo;
import java.util.ArrayList;

public class  SimpleExaminer {
    public ArrayList<Book> getBooks() {


        ArrayList<Book> books = new ArrayList<Book>();

        //add a new book
        //create a book from our object
        Book book1 = new Book();
        book1.author = "Author 1";
        book1.title = "Title of Book 1";
        books.add(book1);

        Book book2 = new Book();
        book2.author = "Author 2";
        book2.title = "Title of Book 2";
        books.add(book2);

        //print all the books in the array list
        System.out.println("All the books:");
        for (Book book : books) {
            System.out.print(book.title);
            System.out.print(" ");
            System.out.print(book.author);
            System.out.println();
        }
        return books;
    }

}


