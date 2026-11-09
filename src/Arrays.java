public class Arrays {

    public static void run() {

        String[] names = {"Rithy", "Dara", "Sokha"};

        System.out.println("=== Array Elements ===");

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        System.out.println("=== Array Length ===");

        System.out.println(names.length);

        System.out.println("=== For Loop ===");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("=== For Each ===");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("=== Integer Array ===");

        int[] numbers = {10, 20, 30, 40, 50};

        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        System.out.println("Total: " + total);

        System.out.println("=== Update Array ===");

        names[0] = "Chanrithy";

        System.out.println(names[0]);
    }

    public static void main(String[] args) {
        run();
    }
}