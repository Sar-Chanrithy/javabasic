public class Methods {

    public static void sayHello() {
        System.out.println("Hello Java!");
    }

    public static void greeting(String name) {
        System.out.println("Hello " + name);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double calculateAverage(double a, double b) {
        return (a + b) / 2;
    }

    public static boolean isAdult(int age) {
        return age >= 18;
    }

    public static void run() {

        sayHello();

        greeting("Rithy");

        int sum = add(10, 20);
        System.out.println("Sum: " + sum);

        int result = multiply(5, 4);
        System.out.println("Multiply: " + result);

        double average = calculateAverage(80, 90);
        System.out.println("Average: " + average);

        boolean adult = isAdult(20);
        System.out.println("Is Adult: " + adult);
    }

    public static void main(String[] args) {
        run();
    }
}