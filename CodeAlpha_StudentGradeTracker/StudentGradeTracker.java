import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            double marks = sc.nextDouble();
            sc.nextLine();

            students.add(new Student(name, marks));
        }

        double total = 0;
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;

        for (Student s : students) {
            total += s.marks;

            if (s.marks > highest) {
                highest = s.marks;
            }

            if (s.marks < lowest) {
                lowest = s.marks;
            }
        }

        double average = total / students.size();

        System.out.println("\n----- Summary Report -----");
        for (Student s : students) {
        String grade;

if (s.marks >= 90) {
    grade = "A";
} else if (s.marks >= 75) {
    grade = "B";
} else if (s.marks >= 60) {
    grade = "C";
} else if (s.marks >= 40) {
    grade = "D";
} else {
    grade = "F";
}

System.out.println("Name: " + s.name + 
                   " | Marks: " + s.marks + 
                   " | Grade: " + grade);

        System.out.println("\nAverage Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
    }
}
