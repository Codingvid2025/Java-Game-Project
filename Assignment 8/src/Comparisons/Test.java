package Comparisons;

public class Test {
    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(3.2),
                new Circle(4.1),
                new Circle(2.5),
                new Circle(3.2) // Duplicate value
        };

        Student[] students = {
                new Student("John", "Doe", 123, 3.7),
                new Student("Jane", "Smith", 456, 3.9),
                new Student("John", "Doe", 123, 3.7), // Duplicate
                new Student("Bob", "Brown", 789, 3.5)
        };

        // Test max and min methods
        System.out.println("Max Circle: " + Utility.max(circles));
        System.out.println("Min Circle: " + Utility.min(circles));

        System.out.println("Max Student: " + Utility.max(students));
        System.out.println("Min Student: " + Utility.min(students));

        // Test removeRepetition
        Circle[] uniqueCircles = (Circle[]) Utility.removeRepetition(circles);
        System.out.println("\nUnique Circles:");
        for (Circle c : uniqueCircles) {
            System.out.println(c);
        }

        Student[] uniqueStudents = (Student[]) Utility.removeRepetition(students);
        System.out.println("\nUnique Students:");
        for (Student s : uniqueStudents) {
            System.out.println(s);
        }
    }
}

