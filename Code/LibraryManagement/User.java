package LibraryManagement;

abstract class User {
    int id;
    String name;
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public abstract void register();
    public abstract void login();
}
