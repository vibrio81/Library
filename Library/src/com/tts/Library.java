package com.tts;
import java.util.*;
public class Library {

    String addr;
    ArrayList<Book> list;

    public Library(String address) {
        addr = address;
        list = new ArrayList<>();
    }

    public void addBook(Book addbook) {
        this.list.add(addbook);
    }


    public String openHours() {
        String hours = "All Library branches are open daily from 9am to 5pm.";
        return hours;
    }


    public String printAddr() {
        return addr;
    }

    public void borrowBook(String title) {
        for (Book book : this.list) {
            if (title.equals(book.getTitle())) {
                if (book.isBorrowed()) {
                    System.out.println("Sorry, this book is already borrowed.");
                } else {
                    book.borrowed();
                    System.out.println("You successfully borrowed " + book.getTitle());
                }
                return;
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");
    }
    public void availableBooks() {
        if (this.list.isEmpty()) {
            System.out.println("No book in the catalog.");
        }
        for (Book book : this.list) {
            System.out.println(book.getTitle());
        }
    }
    public void returnBook(String title) {
        for (Book book : this.list) {
            if (title.equals(book.getTitle())) {
                book.returned();
                System.out.println("You have successfully returned " + book.getTitle());
            }
        }
    }
}
