package LibraryManagement;

public class Book {
    int id;
    String name;
    String author;
    String genre;
    int availableCopies;
    public Book(int id, String name, String author, String genre, int availableCopies) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.availableCopies = availableCopies;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getAvailableCopies() {
        return availableCopies;
    }
    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public boolean isAvailable(){
        return (availableCopies > 0);
    }

    public void borrowCopy(){
        if(availableCopies > 0){
            availableCopies--;
        }
    }

    public void returnCopy(){
        availableCopies++;
    }
}
