package cp_10_07;

import java.util.ArrayList;

public class Course {
    private ArrayList<Student> roster; // Collection of Student objects

    public Course() {
        roster = new ArrayList<Student>();
    }

    // Drops a student from course by removing student from course roster
    public void dropStudent(String last) {

        int index = -1; // not sure if there is ever a case where there is a negative index...

        for (Student student : this.roster) {
            if (student.getLast().equals(last))
                 index = this.roster.indexOf(student);
        }
        if (index > -1)
            this.roster.remove(index);
    }

    public void addStudent(Student s) {
        roster.add(s);
    }

    public int countStudents() {
        return roster.size();
    }

    public void printRoster() {
        for (Student student : this.roster)
            System.out.println(student.toString());
    }
    // main
    public static void main(String args[]) {
        Course course = new Course();
        String first;  // first name
        String last;   // last name
        double gpa;    // grade point average
        int beforeCount;

        first = "Henry";
        last = "Nguyen";
        gpa = 3.5;
        course.addStudent(new Student(first, last, gpa));  // Add 1st student

        first = "Brenda";
        last = "Stern";
        gpa = 2.0;
        course.addStudent(new Student(first, last, gpa));  // Add 2nd student

        first = "Lynda";
        last = "Robison";
        gpa = 3.2;
        course.addStudent(new Student(first, last, gpa));  // Add 3rd student

        first = "Sonya";
        last = "King";
        gpa = 3.9;
        course.addStudent(new Student(first, last, gpa));  // Add 4th student

        beforeCount = course.countStudents();  // Number of students before dropping any students
        course.printRoster();

        last = "Stern";
        course.dropStudent(last); // Should drop Brenda Stern

        System.out.println("Course size: " + beforeCount + " students");     // Should output 4
        System.out.println("Course size after drop: " + course.countStudents() + " students");     // Should output 3
        course.printRoster();
    }
}