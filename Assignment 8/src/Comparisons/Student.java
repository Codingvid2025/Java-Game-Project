package Comparisons;

public class Student implements Comparable<Student> {
    private String name;
    private String lastName;
    private int studentNumber;
    private double gpa;

    public Student(String name, String lastName, int studentNumber, double gpa) {
        this.name = name;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student other) {
        if (this.name.equals(other.name) &&
                this.lastName.equals(other.lastName) &&
                this.studentNumber == other.studentNumber &&
                this.gpa == other.gpa) {
            return 0;
        }
        return Double.compare(this.gpa, other.gpa);
    }

    @Override
    public String toString() {
        return name + " " + lastName + " (ID: " + studentNumber + ", GPA: " + gpa + ")";
    }
}

