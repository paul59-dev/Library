package fr.manages;

public class Book {
    
    private String isbn;
    private String title;
    private String author;
    private boolean available;

    public Book(String isbn, String title, String author, boolean available) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    // Enprunter
    public void borrowing() {
        if(available) {
            available = false;
            System.out.println("Livre emprunter: " + title);
        } else {
            System.out.println("Le livre n'est pas disponible");
        }
    }

    // Rendre
    public void render(){
        available = true;
        System.out.println("Livre rendu: " + title);
    }

    // Afficher les détails
    public void showDetails() {
        System.out.println("Livre: " + title);
        System.out.println("-> Isbn: " + isbn);
        System.out.println("-> Autheur: " + author);
        System.out.println("-> Disponible: " + (available ? "OUI" : "NON"));
    }
}
