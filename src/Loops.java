public class Loops {

    public static void run() {

        System.out.println("=== For Loop ===");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        System.out.println("=== While Loop ===");

        int a = 1;

        while (a <= 5) {
            System.out.println("Number: " + a);
            a++;
        }

        System.out.println("=== Do While Loop ===");

        int b = 1;

        do {
            System.out.println("Number: " + b);
            b++;
        } while (b <= 5);

        System.out.println("=== For Each Loop ===");

        String[] names = {"Rithy", "Dara", "Sokha"};

        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        run();
    }
}