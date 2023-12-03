package fr.manages;

import java.util.ArrayList;

public class User {
    
    private String name;
    private int userID;
    private ArrayList<Book> listOfBorrowing;

    public User(String name, int userID) {
        this.name = name;
        this.userID = userID;
        this.listOfBorrowing = new ArrayList<>();
    }

    // Emprunter un livre
    public void borrowingBook(Book book) {
        listOfBorrowing.add(book);
        book.borrowing();
    }

    // Rendre un livre
    public void renderBook(Book book) {
        listOfBorrowing.remove(book);
        book.render();
    }

    // Afficher les livre empruntés
    public void showBorrowingBook() {
        System.out.println(name + " - " + userID);

        for(Book book: listOfBorrowing) {
            book.showDetails();
        }
    }
}
