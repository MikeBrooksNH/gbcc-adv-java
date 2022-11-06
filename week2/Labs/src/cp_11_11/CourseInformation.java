package cp_11_11;

import java.util.Scanner;
public class CourseInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String courseNumber, courseTitle;
        String offeredNumber, offeredTitle, instructorName, term, classTime;

        courseNumber = scanner.nextLine();
        courseTitle = scanner.nextLine();

        offeredNumber = scanner.nextLine();
        offeredTitle = scanner.nextLine();
        instructorName = scanner.nextLine();
        term = scanner.nextLine();
        classTime = scanner.nextLine();

        Course course = new Course(courseNumber, courseTitle);
        System.out.println(course);

        OfferedCourse offeredCourse = new OfferedCourse(offeredNumber, offeredTitle, instructorName, term, classTime);
        System.out.println(offeredCourse);
    }
}
