package OOP;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== JAVA OOP ===");

        System.out.println("\n1. PERSON");
        Person person = new Person("Rithy", 20);
        person.introduce();

        System.out.println("\n2. STUDENT");
        Student student = new Student("Rithy", 20, "Computer Science");
        student.introduce();

        System.out.println("\n3. INHERITANCE");
        Inheritance.run();

        System.out.println("\n4. ENCAPSULATION");
        Encapsulation.run();

        System.out.println("\n5. POLYMORPHISM");
        Polymorphism.run();

        System.out.println("\n6. ABSTRACTION");
        Abstraction.run();
    }
}