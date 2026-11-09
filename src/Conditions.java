public class Conditions {

    public static void run() {

        int age = 20;

        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are under 18");
        }

        int score = 85;

        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 80) {
            System.out.println("Grade B");
        } else if (score >= 70) {
            System.out.println("Grade C");
        } else if (score >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }

        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Other Day");
        }
    }

    public static void main(String[] args) {
        run();
    }
}