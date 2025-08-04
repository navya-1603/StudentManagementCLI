package StudentManagementCLI;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // To display student details
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}
