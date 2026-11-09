public class Operators {

    public static void run() {

        int a = 10;
        int b = 5;

        System.out.println("=== Arithmetic Operators ===");

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println("=== Comparison Operators ===");

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        System.out.println("=== Logical Operators ===");

        boolean x = true;
        boolean y = false;

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);

        System.out.println("=== Assignment Operators ===");

        int number = 10;

        number += 5;
        System.out.println(number);

        number -= 3;
        System.out.println(number);

        number *= 2;
        System.out.println(number);
    }

    public static void main(String[] args) {
        run();
    }
}