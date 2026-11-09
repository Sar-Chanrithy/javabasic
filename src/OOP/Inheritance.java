package OOP;

public class Inheritance {

    public static void run() {

        Student student1 = new Student(
            "Rithy",
            20,
            "Computer Science"
        );

        Student student2 = new Student(
            "Dara",
            21,
            "Information Technology"
        );

        System.out.println("=== Student 1 ===");
        student1.introduce();

        System.out.println("=== Student 2 ===");
        student2.introduce();
    }

    public static void main(String[] args) {
        run();
    }
}