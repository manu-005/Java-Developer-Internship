public class User {
    String name;
    int id;

    User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return name + " (ID: " + id + ")";
    }
}
