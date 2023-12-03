import fr.manages.Book;
import fr.manages.Library;
import fr.manages.User;

public class App {
    public static void main(String[] args) throws Exception {
        
        Library library = new Library();

        // Creation des livres
        Book livre1 = new Book("1", "Alice au pays des merveilles", "Lewis Caroll");
        Book livre2 = new Book("2", "L'étrange noël de Monsieur Jack", "Tim Burton");
        Book livre3 = new Book("3", "Jujutsu Kaisen", "Gege Akutami");
        Book livre4 = new Book("4", "Spy x Family", "Tatsuya Endo");

        // Creation des utilisateurs
        User user1 = new User("Paul", 1);
        User user2 = new User("Angelique", 2);
        User user3 = new User("Marie", 3);
        User user4 = new User("Jean", 4);

        // Ajout des livre dans la bibliotheque
        library.addBook(livre1);
        library.addBook(livre2);
        library.addBook(livre3);
        library.addBook(livre4);

        // Ajout des utilisateurs dans la bibliotheque 
        library.addUser(user1);
        library.addUser(user2);
        library.addUser(user3);
        library.addUser(user4);
        
        // Affichage des livres disponibles dans la bibliothèque
        library.showAllBooks();

        // Emprunt de livres par les utilisateurs
        user1.borrowingBook(livre1);
        user2.borrowingBook(livre2);

        // Affichage des livres empruntés par les utilisateurs
        user1.showBorrowingBook();
        user2.showBorrowingBook();

        // Rendu des livres par les utilisateurs
        user1.renderBook(livre1);
        user2.renderBook(livre2);

        // Affichage des livres disponibles après le rendu
        library.showAllBooks();
    }
}
