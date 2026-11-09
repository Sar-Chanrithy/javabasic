package OOP;

public class Abstraction {

    static abstract class Animal {

        abstract void makeSound();

        public void sleep() {
            System.out.println("Animal is sleeping");
        }
    }

    static class Dog extends Animal {

        @Override
        void makeSound() {
            System.out.println("Dog: Woof Woof!");
        }
    }

    static class Cat extends Animal {

        @Override
        void makeSound() {
            System.out.println("Cat: Meow Meow!");
        }
    }

    public static void run() {

        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println("=== Dog ===");
        dog.makeSound();
        dog.sleep();

        System.out.println("=== Cat ===");
        cat.makeSound();
        cat.sleep();
    }

    public static void main(String[] args) {
        run();
    }
}