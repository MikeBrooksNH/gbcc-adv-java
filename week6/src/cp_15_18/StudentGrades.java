package cp_15_18;
/*
Given a HashMap pre-filled with student names as keys and grades as values, complete main()
by reading in the name of a student, outputting their original grade, and then reading in and
outputting their new grade. If the student name is not found, output a message to indicate that.

Example(s):

    If the input is:
        Quincy Wraight
        73.1
    The output is:
        Quincy Wraight's original grade: 65.4
        Quincy Wraight's new grade: 73.1

    If the input is:
        Harley Davidson
        81.6
    The output is:
        Student name Harley Davidson was not found

 */

import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName;
        double studentGrade;

        HashMap<String, Double> studentGrades = new HashMap<String, Double>();

        // Students's grades (pre-entered)
        studentGrades.put("Harry Rawlins", 84.3);
        studentGrades.put("Stephanie Kong", 91.0);
        studentGrades.put("Shailen Tennyson", 78.6);
        studentGrades.put("Quincy Wraight", 65.4);
        studentGrades.put("Janine Antinori", 98.2);

        //       If student doesn't exist, output the appropriate
        //       error message.
        studentName = scanner.nextLine();
        studentGrade = scanner.nextDouble();

        try {
            if (studentGrades.get(studentName) != null) {
                System.out.println(studentName + "'s original grade: " + studentGrades.get(studentName));
                studentGrades.put(studentName, studentGrade);
                System.out.println(studentName + "'s new grade: " + studentGrade);
            } else {
                System.out.println("Student name " + studentName + " was not found");
            }
        } catch (Exception e) {
            System.out.println("There was an error inserting the new grade...");
        }
    }
}
