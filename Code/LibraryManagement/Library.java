package LibraryManagement;

import java.util.*;

public class Library {
    List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }
    
    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> searchByTitle(String title){
        List<Book> searchResult = new ArrayList<>();
        for(Book book : books){
            if(book.getName().equals(title)){
                searchResult.add(book);
            }
        }
        return searchResult;
    }

    public List<Book> searchByAuthor (String author){
        List<Book> searchResult = new ArrayList<>();
        for(Book book : books){
            if(book.getAuthor().equals(author)){
                searchResult.add(book);
            }
        }
        return searchResult;
    }

    public List<Book> searchByGenre(String genre){
        List<Book> searchResult = new ArrayList<>();
        for(Book book : books){
            if(book.getGenre().equals(genre)){
                searchResult.add(book);
            }
        }
        return searchResult;
    }
}
