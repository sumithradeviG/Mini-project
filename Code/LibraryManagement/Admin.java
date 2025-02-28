package LibraryManagement;
import java.util.*;

public class Admin extends User {
    List<Book> inventory;

    public Admin(int id, String name) {
        super(id, name);
        this.inventory = new ArrayList<>();
    }

    public void register(){
        System.out.println(name +"registed as member. Member id " + id );
    }

    public void login(){
        System.out.println(name +"logged in successfully" );
    }

    public void addBook(Book book){
        inventory.add(book);
        System.out.println(book.getName() + " added to inventory");
    }

    public void removeBook(Book book){
        inventory.remove(book);
        System.out.println(book.getName() + " removed from inventory");
    }

    public void updateBook(Book book, String newTitle, String newAuthor, String newGenre, int newCopies){
        book.setName(newTitle);
        book.setAuthor(newAuthor);
        book.setGenre(newGenre);
        book.setAvailableCopies(newCopies);

        System.out.println(book.getName() + " updated successfully");
    }

    public List<Book> getInventory(){
        return inventory;
    }
}
