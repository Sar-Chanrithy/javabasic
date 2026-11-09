package OOP;

public class Encapsulation {

    public static void run() {

        Person person = new Person("Rithy", 20);

        System.out.println("=== Before Update ===");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.setName("Chanrithy");
        person.setAge(21);

        System.out.println("=== After Update ===");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }

    public static void main(String[] args) {
        run();
    }
}