package cp_10_07;

import java.text.DecimalFormat;

// Class representing a student
public class Student {

    private String first;  // first name
    private String last;   // last name
    private double gpa;    // grade point average

    // Student class constructor
    public Student(String f, String l, double g) {
        first = f;  // first name
        last = l;   // last name
        gpa = g;    // grade point average
    }

    public double getGPA() {
        return gpa;
    }

    public String getLast() {
        return last;
    }

    // Returns a String representation of the Student object, with the GPA formatted to one decimal
    public String toString() {
        DecimalFormat fmt = new DecimalFormat("#.0");
        return first + " " + last + " " + fmt.format(gpa);
    }
}