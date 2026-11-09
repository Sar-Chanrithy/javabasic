package OOP;

public class Polymorphism {

    public static void run() {

        Person person = new Person("Sokha", 30);

        Person student = new Student(
            "Rithy",
            20,
            "Computer Science"
        );

        System.out.println("=== Person ===");
        person.introduce();

        System.out.println("=== Student ===");
        student.introduce();

        System.out.println("=== Multiple Objects ===");

        Person[] people = {
            new Person("Dara", 25),
            new Student("Sreyneang", 19, "IT"),
            new Student("Vanna", 22, "Computer Science")
        };

        for (Person p : people) {
            p.introduce();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        run();
    }
}