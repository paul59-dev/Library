package fr.manages;

import java.util.ArrayList;

public class Library {
    
    private ArrayList<Book> listOfBooks;
    private ArrayList<User> listOfUsers;

    public Library() {
        this.listOfBooks = new ArrayList<>();
        this.listOfUsers = new ArrayList<>();
    }
    
    // Ajouter un livre
    public void addBook(Book book) {
        listOfBooks.add(book);
    }

    // Ajouter un utilisateur
    public void addUser(User user) {
        listOfUsers.add(user);
        System.out.println("Utilisateur ajouté.");
    }

    // Affichier tout les livres de la library
    public void showAllBooks() {
        System.out.println("Liste des livres: ");

        for(Book book: listOfBooks) {
            System.out.println("*********************");
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("Titre: " + book.getTitle());
            System.out.println("Autheur: " + book.getAuthor());
        }
    }

    // Affichier tout les utilisateur inscrit
    public void showAllUsers() {
        System.out.println("Liste des utilisateurs: ");

        for(User user: listOfUsers) {
            System.out.println("*********************");
            System.out.print("Nom: " + user.getName() + " - " + user.getUserId());
        }
    }
}
