package LibraryManagement;
import java.util.*;

public class Member extends User {
    List<Book> borrowedBooks;
    int maxBookLimit = 5;

    public Member(int id, String name) {
        super(id, name);
        this.borrowedBooks = new ArrayList<>();
    }
    
    public void register(){
        System.out.println(name +"registed as member. Member id " + id );
    }

    public void login(){
        System.out.println(name +"logged in successfully" );
    }

    public void borrowBook(Book book){
        if(borrowedBooks.size() >=  maxBookLimit){
            System.out.println("You reached the maximum limit to borrow books. If you return any book you can borrow books");
        }
        if(book.isAvailable()){
            borrowedBooks.add(book);
            book.borrowCopy();
            System.out.println(name + " borrowed " + book.getName());
        }
        else{
            System.out.println(book.getName() +" book is not available");
        }
    }

    public void returnBook(Book book){
        if(borrowedBooks.remove(book)){
            book.returnCopy();
            System.out.println(book.getName() + " returned.");
        }
        else{
            System.out.println("You did not borrow this book");
        }
    }

    public List<Book> getBorrowedBooks(){
        return borrowedBooks;
    }

}
