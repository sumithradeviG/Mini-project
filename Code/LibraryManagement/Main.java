package LibraryManagement;

public class Main {
    public static void main(String[] args) {
        Admin admin1 = new Admin(1, "Sumithra");
        admin1.register();
        admin1.login();

        Book book1 = new Book(1, "AAAAA", "ZZZZZ", "Fiction", 10);
        Book book2 = new Book(2, "BBBBB", "YYYYY", "SciFi", 5);
        Book book3 = new Book(3, "CCCCC", "XXXXX", "Comedy", 2);
        admin1.addBook(book1);
        admin1.addBook(book2);
        admin1.addBook(book3);

        Library lib = new Library();
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);

        Member member = new Member(1, "Senthil");
        member.register();
        member.login();

        member.borrowBook(book1);
        member.borrowBook(book1);
        member.borrowBook(book2);
        member.borrowBook(book3);
        member.borrowBook(book3);

        // search by title
        System.out.println("\nSearching for book by title: ");
        List<Book> searchResult = lib.searchByTitle("AAAAA");
        for(Book book : searchResult){
            System.out.println(book.getName() + " by " + book.getAuthor());
        }

        // member return book
        member.returnBook(book1);
    }
    
}
