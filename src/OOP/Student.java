package OOP;

public class Student extends Person {

    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void introduce() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Major: " + major);
    }

    public static void main(String[] args) {

        Student student = new Student(
            "Rithy",
            20,
            "Computer Science"
        );

        student.introduce();
    }
}