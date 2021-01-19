package com.tts;

public class Main {

    public static void main(String[] args) {

        //test of book class
        Book bk = new Book("The Da Vinci Code");

        System.out.println("Title: " + bk.getTitle());
        System.out.println("Borrowed? : " + bk.isBorrowed());
        bk.borrowed();
        System.out.println("Borrowed? : " + bk.isBorrowed());
        bk.returned();
        System.out.println("Borrowed?: " + bk.isBorrowed());

        //add 2 libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        //Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petite Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));


        //Print hours of operation and location

        //System.out.println("First Library");
        System.out.println(firstLibrary.openHours());
        //System.out.println(secondLibrary.openHours());
        System.out.println(firstLibrary.printAddr());
        //System.out.println("second Library");
        System.out.println(secondLibrary.printAddr());

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.availableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.availableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.availableBooks();




    }

}
























